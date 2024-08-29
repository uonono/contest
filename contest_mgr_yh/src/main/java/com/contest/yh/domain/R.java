package com.contest.yh.domain;


import java.io.Serializable;

/**
 * 响应信息主体
 */
public class R<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 成功
     */
    public static final int SUCCESS = Constants.SUCCESS;

    /**
     * 失败
     */
    public static final int FAIL = Constants.FAIL;

    private boolean success = true;
    private int code;

    private String msg;

    private T data;
    private Long serverTime;

    public static <T> R<T> success() {
        return restResult(null, SUCCESS, null);
    }

    public static <T> R<T> success(T data) {
        return restResult(data, SUCCESS, null);
    }

    public static <T> R<T> success(T data, String msg) {
        return restResult(data, SUCCESS, msg);
    }

    public static <T> R<T> fail() {
        return restResult(null, FAIL, null);
    }

    public static <T> R<T> fail(String msg) {
        return restResult(null, FAIL, msg);
    }

    public static <T> R<T> fail(T data) {
        return restResult(data, FAIL, null);
    }

    public static <T> R<T> fail(T data, String msg) {
        return restResult(data, FAIL, msg);
    }

    public static <T> R<T> fail(int code, String msg) {
        return restResult(null, code, msg);
    }

    public static <T> R<T> restResult(T data, int code, String msg) {
        R<T> apiResult = new R<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        apiResult.setServerTime(System.currentTimeMillis());
        if (code == SUCCESS) {
            apiResult.setSuccess(true);
        } else {
            apiResult.setSuccess(false);
        }
        return apiResult;
    }

    public static <T> R<T> resetResult(ServiceResult<T> sr) {
        R<T> apiResult = new R<>();
        apiResult.setCode(sr.getCode());
        apiResult.setData(sr.getData());
        apiResult.setMsg(sr.getMessage());
        apiResult.setServerTime(System.currentTimeMillis());
        apiResult.setSuccess(sr.isSuccess());
        return apiResult;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Long getServerTime() {
        return serverTime;
    }

    public void setServerTime(Long serverTime) {
        this.serverTime = serverTime;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
