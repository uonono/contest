package com.contest.yh.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Table("gbl_setting_wechat")
@Data
public class GblSettingWechat {
    private String _ountryName;
    private String KeyNum;
    private String SetValue;
    private String Explain;
    private int Piority;
    private String BaseTable;
    private boolean IsMutiselect;
    private String SystemId;
    private String ModiTime;
    private String ModiOperId;
    private String Describtion;
    private String ModiOperName;
    private String InsertTime;
    private boolean IsActive;
    private boolean u_IsBasetable;
    private boolean u_IsExplain;
    private boolean u_IsKeyNum;
    private boolean u_IsSetValue;
    private String StrTemp;
    private boolean IsModify;
    private String GUID;
    private boolean u_IsGUIDNull;
    private int HospitalId;
    private int RowStatus;
    private int HisType;
    private boolean u_IsHasRecord;
    private boolean u_IsNoRecord;
    private boolean u_isNotPatIDNull;
    private String RedisConditionValus;
    private String DiagMeetingLocId;
    private int SortOrder;
    private String InputTime;
    private String StrTemp1;
    private boolean IsSelected;

    // Getters and setters omitted for brevity
}
