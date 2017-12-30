package com.hhzt.vod.api;

import com.alibaba.fastjson.annotation.JSONField;

import static com.alibaba.fastjson.JSON.parseObject;

/**
 * Created by wujichang on 2017/12/29.
 */

public class CommonRspRetBean {

    @JSONField(name = "code", ordinal = 0)
    public int code;
    @JSONField(name = "status", ordinal = 1)
    public String status;
    @JSONField(name = "desc", ordinal = 2)
    public String desc;
    @JSONField(name = "data", ordinal = 3)
    public Object data;

    @Override
    public String toString() {
        return "CommonRspRetBean{" +
                "code='" + code + '\'' +
                ", status='" + status + '\'' +
                ", desc='" + desc + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public static CommonRspRetBean fromString(String result) {
        CommonRspRetBean bean = parseObject(result, CommonRspRetBean.class);
        return bean;
    }

    public boolean isSuccess() {
        return code == 0;
    }

    public boolean isTokenExpired() {
        return code == 200000;
    }
}