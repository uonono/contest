package com.contest.yh.entity;


import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;
@Data
@Table("gbl_setting_wechat")
public class GblSettingWechat {
    public String _ountryName;
    public String KeyNum;
    public String SetValue;
    public String Explain;
    public int Piority;
    public String BaseTable;
    public boolean IsMutiselect;
    public String SystemId;
    public String ModiTime;
    public String ModiOperId;
    public String Describtion;
    public String ModiOperName;
    public String InsertTime;
    public boolean IsActive;
    public boolean u_IsBasetable;
    public boolean u_IsExplain;
    public boolean u_IsKeyNum;
    public boolean u_IsSetValue;
    public String StrTemp;
    public boolean IsModify;
    public String GUID;
    public boolean u_IsGUIDNull;
    public int HospitalId;
    public int RowStatus;
    public int HisType;
    public boolean u_IsHasRecord;
    public boolean u_IsNoRecord;
    public boolean u_isNotPatIDNull;
    public String RedisConditionValus;
    public String DiagMeetingLocId;
    public int SortOrder;
    public String InputTime;
    public String StrTemp1;
    public boolean IsSelected;

    // Getters and setters omitted for brevity
}
