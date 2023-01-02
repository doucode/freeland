package com.douxiangwei.user.vo;

import lombok.Data;

import static com.douxiangwei.user.enums.StatusCodeEnum.*;

@Data
public class Result<T> {
    /**
     * 返回状态
     */
    private Boolean flag;

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    public static <T> Result<T> ok(){
        return restResult(true,null,SUCCESS.getCode(),SUCCESS.getDesc());
    }

    public static <T> Result<T> ok(T data){
        return restResult(true,data,SUCCESS.getCode(),SUCCESS.getDesc());
    }

    public static <T> Result<T> ok(T data, String message){
        return restResult(true,data,SUCCESS.getCode(),message);
    }

    public static <T> Result<T> fail(){
        return restResult(false,null,FAIL.getCode(),FAIL.getDesc());
    }

    public static <T> Result<T> fail(T data, String message){
        return restResult(false,data,FAIL.getCode(),message);
    }

    private static <T> Result<T> restResult(Boolean flag, String message) {
        Result<T> apiResult = new Result<>();
        apiResult.setFlag(flag);
        apiResult.setCode(flag ? SUCCESS.getCode() : FAIL.getCode());
        apiResult.setMessage(message);
        return apiResult;
    }

    private static <T> Result<T> restResult(Boolean flag, T data, Integer code,String message) {
        Result<T> apiResult = new Result<>();
        apiResult.setFlag(flag);
        apiResult.setData(data);
        apiResult.setCode(code);
        apiResult.setMessage(message);
        return apiResult;
    }
}
