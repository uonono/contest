/**
  * Copyright 2024 bejson.com 
  */
package com.contest.yh.entity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Auto-generated: 2024-09-20 15:51:15
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Document("gbl_setting_wechat")
public class GblSettingWechatForMongoDB {

    public String _saveStatus;
    public List<String> _showMessages;
    public List<String> _showObjectList;
    public boolean _isShowMsgNull;
    public int WarningCode;
    public String ErrorMsg;
    public String WarningMsg;
    public int ErrorCode;
    public boolean IsNewInfo;
    public boolean u_IsErrorCode;
    public Returns Returns;
    public String GUID;
    public String RequestID;
    public boolean IsSuccess;
    public int State;
    public String Message;
    public String ShowMsg;
    public boolean u_IsShowMsgNull;
    public List<String> ShowObjectList;
    public List<String> ShowMessages;


    static class ReturnT{
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
    }

    class Returns {

            public List<ReturnT> ReturnT;


        }

}