package com.tao.modules.upload;

import com.alibaba.fastjson.JSONObject;
import com.tao.data.generator.dao.BillDetailAliMapper;
import com.tao.data.generator.pojo.BillDetailAli;
import com.tao.data.generator.pojo.BillDetailWx;
import com.tao.data.me.AliBillMapperMe;
import com.tao.modules.billdetail.service.AliBillService;
import com.tao.modules.billdetail.service.WxBillService;
import com.tao.modules.convert.ConvertFactory;
import com.tao.pojo.sys.SimpleMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    @Autowired
    private AliBillService aliBillService;
    @Autowired
    private BillDetailAliMapper billDetailAliMapper;

    private static Logger logger = LoggerFactory.getLogger(UploadService.class);

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

    @Transactional(rollbackFor = Exception.class)
    public void solveAliCSVBill(MultipartFile file){
        InputStreamReader inReader = null;
        try {
            inReader = new InputStreamReader(file.getInputStream(),"gbk");
            LineNumberReader br = new LineNumberReader(inReader);
            //删去无用的部分，bufferReader读取一行后，自动清除改行内容
            for(String line=null;(line=br.readLine())!=null;){
                if(br.getLineNumber()>=6 && line.split(",").length>8){
                    //数据转化
                    BillDetailAli billDetailAli = stringConvert.toAliBill(line);
                    logger.info("获取成功-{}",JSONObject.toJSONString(billDetailAli));

                    SimpleMap aliGetOneMap = new SimpleMap();
                    aliGetOneMap.put("tradeNum",billDetailAli.getTradeNum());
                    SimpleMap one = aliBillService.getOne(aliGetOneMap);
                    if(one==null){ //没有该账单，直接插入
                        billDetailAliMapper.insertSelective(billDetailAli);
                        logger.info("新建成功-{}",JSONObject.toJSONString(billDetailAli));
                    }else if (!billDetailAli.getPayStatus().equals(Short.valueOf(one.getString("payStatus")))){ //账单存在，对比账单状态是否相同，不相同则插入
                        billDetailAliMapper.insertSelective(billDetailAli);
                        logger.info("更新成功-{}",JSONObject.toJSONString(billDetailAli));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
