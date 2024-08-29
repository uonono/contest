package com.contest.yh.domain;

public class ErrorCode {

    private int code;
    private String message;

    public ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
