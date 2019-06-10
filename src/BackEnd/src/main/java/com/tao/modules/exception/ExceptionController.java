package com.tao.modules.exception;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@ResponseBody
public class ExceptionController {

    @RequestMapping("/exception")
    public void error(HttpServletRequest request) throws Exception {
        throw ((Exception) request.getAttribute("exception"));
    }
}
