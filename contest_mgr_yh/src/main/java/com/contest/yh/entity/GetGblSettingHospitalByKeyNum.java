/**
  * Copyright 2024 bejson.com 
  */
package com.contest.yh.entity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Auto-generated: 2024-09-19 18:5:5
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Document("GetGblSettingHospitalByKeyNum")
@Data
public class GetGblSettingHospitalByKeyNum {

    private String _id;
    private String _saveStatus;
    private List<String> _showMessages;
    private List<String> _showObjectList;
    private boolean _isShowMsgNull;
    private int WarningCode;
    private String ErrorMsg;
    private String WarningMsg;
    private int ErrorCode;
    private boolean IsNewInfo;
    private boolean u_IsErrorCode;
    private Returns Returns;
    private String GUID;
    private String RequestID;
    private boolean IsSuccess;
    private int State;
    private String Message;
    private String ShowMsg;
    private boolean u_IsShowMsgNull;
    private List<String> ShowObjectList;
    private List<String> ShowMessages;

    @Data
    static
    class ReturnT{

            public String _ountryName;
            public String KeyNum;
            public String KeyValue;
            public String Explain;
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
            public String StrTemp;
            public String StrTemp1;
            public boolean IsSelected;

    }

    @Data
    static
    class Returns {

            public ReturnT ReturnT;
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

        }

}