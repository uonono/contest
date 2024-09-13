package com.contest.yh.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;
import java.sql.Timestamp;

@Data
@Table("wx_user")  // 对应数据库表名
public class WxUser {

    /**
     * 微信用户ID
     */
    private String wxUserId;

    /**
     * 用户ID，外键
     */
    private String userId;

    /**
     * ID，业务用
     */
    private String id;

    /**
     * 租户
     */
    private String tenant;

    /**
     * 公众号APPID
     */
    private String fwhAppId;

    /**
     * 小程序APPID
     */
    private String xcxAppId;

    /**
     * 同主体关联ID（Union ID）
     */
    private String unionId;

    /**
     * 公众号OpenID
     */
    private String fwhOpenId;

    /**
     * 小程序OpenID
     */
    private String xcxOpenId;

    /**
     * 小程序Session Key
     */
    private String xcxSessionKey;

    /**
     * 是否关注公众号
     */
    private Boolean subscribed;

    /**
     * 关注公众号时间
     */
    private Timestamp subscribedTime;

    /**
     * 取消关注公众号时间
     */
    private Timestamp unsubscribedTime;

    /**
     * 代理商ID，空串表示属于平台
     */
    private String agentId;

    /**
     * 微信昵称
     */
    private String nickname;

    /**
     * 用户头像，来自微信API
     */
    private String headimgurl;

    /**
     * 用户性别，1-男性，2-女性，0-未知
     */
    private int sex;

    /**
     * 年龄
     */
    private int age;

    /**
     * 城市
     */
    private String city;

    /**
     * 省份
     */
    private String province;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 是否注册会员，0-未注册，1-已注册
     */
    private int bindStatus;
    private Timestamp bindTime;
    private String areaCode;

    /**
     * 完整区域编码
     */
    private String fullAreaCode;

    /**
     * 所选区域名称
     */
    private String areaName;

    /**
     * 收货地址
     */
    private String address;

    /**
     * 删除标志
     */
    private Boolean deleted;

    /**
     * 乐观锁版本号
     */
    private int version;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 更新时间
     */
    private Timestamp updateTime;

    // Getters and Setters
}
