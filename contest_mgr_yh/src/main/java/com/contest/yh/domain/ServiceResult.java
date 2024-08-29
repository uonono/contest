package com.contest.yh.domain;

import lombok.extern.slf4j.Slf4j;

import java.text.MessageFormat;

@Slf4j
public class ServiceResult<T> {
    private boolean success = true;
    private T data;
    private String message;
    private int code;

    public ServiceResult<T> error(){
        success = false;
        return this;
    }
    public ServiceResult<T> error(int code){
        success = false;
        this.code = code;
        return this;
    }


    public ServiceResult<T> error(String message, Object... args){
        success = false;
        this.code=R.FAIL;//默认code
        this.message = message;
        if(args != null && args.length > 0){
            this.message = MessageFormat.format(message, args);
        }
        return this;
    }

    public ServiceResult<T> error(ErrorCode errorCode){
        return error(errorCode.getCode(), errorCode.getMessage());
    }

    public ServiceResult<T> error(int code, String message, Object...args)
    {
        if(code==R.SUCCESS){
            code=R.FAIL;
        }
        this.code = code;
        this.message = message;
        this.success = false;
        if(args != null && args.length > 0){
            this.message = MessageFormat.format(message, args);
        }

        return this;
    }

//	public ServiceResult<T> error(int code, String messageTpl, Object...args)
//	{
//		this.errorCode = code;
//		this.message = message;
//		this.success = false;
//		return this;
//	}

    public ServiceResult<T> error(Exception e){
        StringBuilder message = new StringBuilder(e.getMessage());
        Throwable cause = e.getCause();
        while (cause != null){
            message.append("\ncause by:");
            message.append(cause.getMessage());
            cause = cause.getCause();
        }
        return error(message.toString());
    }

    public ServiceResult<T> success(){
        return success(null,null);
    }
    public ServiceResult<T> success(String message)
    {
        return success(null,message);
    }
    public ServiceResult<T> success(T data){
        return success(data,null);
    }
    public ServiceResult<T> success(T data, String message)
    {
        success = true;
        this.data = data;
        this.message = message;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
