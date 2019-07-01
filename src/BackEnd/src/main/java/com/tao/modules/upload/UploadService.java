package com.tao.modules.upload;

import com.alibaba.fastjson.JSONObject;
import com.tao.data.generator.pojo.BillDetailWx;
import com.tao.modules.billdetail.service.WxBillService;
import com.tao.modules.convert.ConvertFactory;
import com.tao.pojo.sys.SimpleMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Service
public class UploadService {
    @Autowired
    private ConvertFactory stringConvert;
    @Autowired
    private WxBillService wxBillService;
    @Transactional
    public void file2Data(MultipartFile file){
        //解析文件
        try {
            InputStream inputStream = file.getInputStream();
            InputStreamReader in = new InputStreamReader(inputStream,"UTF-8");
            BufferedReader br = new BufferedReader(in);
            String str = null;
            //读取每行内容
            while((str=br.readLine())!=null){
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 处理上传的微信文件
     * @param file
     */
    @Transactional(rollbackFor = Exception.class)
    public void solveWxCSVBill(MultipartFile file){
        ////////////////////////////////////////////////
        //使用openCSV进行CSV文件的解析工作（csv->bean）
        ////////////////////////////////////////////////
        InputStreamReader inReader = null;
        try {
            inReader = new InputStreamReader(file.getInputStream(),"utf8");
            LineNumberReader br = new LineNumberReader(inReader);
            //删去无用的部分，bufferReader读取一行后，自动清除改行内容
            for(String line=null;(line=br.readLine())!=null;){
                if(br.getLineNumber()>=18){
                    BillDetailWx billDetailWx = stringConvert.toWxBill(line);
                    System.out.println(JSONObject.toJSONString(billDetailWx));
                    //验证数据是否存在
                    SimpleMap billExistQueryMap = new SimpleMap();
                    billExistQueryMap.put("tradeNum",billDetailWx.getTradeNum());
                    boolean exist = wxBillService.exist(billExistQueryMap);

                    if(!exist){
                        //插入数据
                        wxBillService.save(billDetailWx);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
