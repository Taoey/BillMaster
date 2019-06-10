package com.tao.pojo.sys;

import java.io.Serializable;

/**
 * 统一消息返回
 */
public class Message implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;

    public static final String STATUS_OK = "200";
    public static final String SERVER_ERROR = "500";

    private String code = SERVER_ERROR;

    private String message = "server error";

    private Object result;

    public Message(String code) {
        this(code, "");
    }

    public Message(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Object getResult() {
        return result;
    }

    public Message setResult(Object result) {
        this.result = result;
        return this;
    }

    public String getCode() {
        return code;
    }

    public String toString() {
        return "code: " + code + ", message: " + message;
    }

}