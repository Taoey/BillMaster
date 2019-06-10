package com.tao.pojo.sys;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class GridPage<E> implements Serializable {
    private static final long serialVersionUID = -5809782578272943999L;
    private Long total;
    private List<E> rows;

    public JSONObject toJSON(){
        return JSONObject.parseObject(JSONObject.toJSONString(this));
    }
}