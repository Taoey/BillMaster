package com.tao.modules.upload;


import com.tao.pojo.sys.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("upload")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    /**
     * 文件上传
     * @param file  前端变量名需要为"file"
     * @param request
     * @return
     */
    @RequestMapping("file_test")
    public Message doUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request){

        if(!file.isEmpty()){
            String filename = file.getOriginalFilename();

            //获取文件后缀
            int dotIndex = filename.lastIndexOf(".");
            String fileSuffix = filename.substring(dotIndex+1);

            if(!fileSuffix.equals("csv")){
                return  new Message(Message.SERVER_ERROR).setResult("文件格式错误，请重新上传");
            }

            //文件处理
            uploadService.file2Data(file);
        }
        return new Message(Message.STATUS_OK);
    }

    /**
     * 文件上传
     * @param file  前端变量名需要为"file"
     * @param request
     * @return
     */
    @RequestMapping("wx_bill")
    public Message wxBillUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request){

        if(!file.isEmpty()){
            String filename = file.getOriginalFilename();

            //获取文件后缀
            int dotIndex = filename.lastIndexOf(".");
            String fileSuffix = filename.substring(dotIndex+1);

            if(!fileSuffix.equals("csv")){
                return  new Message(Message.SERVER_ERROR).setResult("文件格式错误，请重新上传");
            }
            //文件处理
            uploadService.solveWxCSVBill(file);
        }
        return new Message(Message.STATUS_OK);
    }

    @RequestMapping("ali_bill")
    public Message ali_bill(@RequestParam("file") MultipartFile file, HttpServletRequest request){
        if(!file.isEmpty()){
            String filename = file.getOriginalFilename();

            //获取文件后缀
            int dotIndex = filename.lastIndexOf(".");
            String fileSuffix = filename.substring(dotIndex+1);

            if(!fileSuffix.equals("csv")){
                return  new Message(Message.SERVER_ERROR).setResult("文件格式错误，请重新上传");
            }
            //文件处理
            uploadService.solveAliCSVBill(file);
        }
        return new Message(Message.STATUS_OK);
    }
}
