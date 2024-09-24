package com.contest.yh.entity; /**
 * Copyright 2024 bejson.com
 */
import lombok.Data;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Auto-generated: 2024-09-19 17:33:42
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
//@Data
@Document("GetJsonStr")
public class GetJsonStr {

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
    public String Returns;
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