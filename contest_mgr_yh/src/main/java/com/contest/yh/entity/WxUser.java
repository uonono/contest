package com.contest.yh.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.sql.Timestamp;
@Data
@Table("wx_user")  // 对应数据库表名
public class WxUser {

    @Id
    private String wxUserId;  // 主键
    private String userId;
    private String tenant;
    private String fwhAppId;
    private String xcxAppId;
    private String unionId;
    private String fwhOpenId;
    private String xcxOpenId;
    private String nickname;
    private String headimgurl;
    private int sex;
    private int age;
    private String city;
    private String province;
    private String phone;
    private String name;
    private int bindStatus;
    private Timestamp bindTime;
    private String areaCode;
    private String fullAreaCode;
    private String areaName;
    private String address;
    private Boolean deleted;
    private int version;
    private Timestamp createTime;
    private Timestamp updateTime;

    // Getters and Setters
}
