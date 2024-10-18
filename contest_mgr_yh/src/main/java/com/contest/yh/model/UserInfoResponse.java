package com.contest.yh.model;

import lombok.Data;

import java.util.List;
@Data
public class UserInfoResponse {

    private String openid;
    private String nickname;
    private int sex;
    private String province;
    private String city;
    private String country;
    private String headimgurl;
    private List<String> privilege;
    private String unionid;
    private String language; // 新增的 language 字段
}
