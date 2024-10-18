package com.contest.yh.model;

import lombok.Data;

import java.util.List;

/**
* @Author: cy
* @Date: 2024/10/17 14:26
* @Description: 登录传输类
*/
@Data
public class AuthorizedLoginResponse {

    // Getter 和 Setter 方法
    private String openid;
    private String scope;
    private int isSnapshotuser;
    private String unionid;
    private String token;
    private String nickname;
    private int sex;
    private String province;
    private String city;
    private String country;
    private String headimgurl;
    private List<String> privilege;
}
