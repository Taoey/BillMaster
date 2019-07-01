package com.tao.modules.billdetail.controller;

import com.tao.modules.billdetail.service.WxBillService;
import com.tao.pojo.sys.GridPage;
import com.tao.pojo.sys.Message;
import com.tao.pojo.sys.SimpleMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("wxbill")
@ResponseBody
public class WxBillController {
    @Autowired
    private WxBillService wxBillService;

    @PostMapping("list")
    public Message list(@RequestBody SimpleMap params){
        GridPage<SimpleMap> result = wxBillService.list(params);
        return new Message(Message.STATUS_OK).setResult(result);
    }
}
