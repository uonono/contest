/**
  * Copyright 2024 bejson.com 
  */
package com.contest.yh.entity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Auto-generated: 2024-09-19 18:21:58
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
@Document("GetByKeyNumSetValue")
public class GetByKeyNumSetValue {

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
    private String Returns;
    private String GUID;
    private String RequestID;
    private boolean IsSuccess;
    private int State;
    private String Message;
    private String ShowMsg;
    private boolean u_IsShowMsgNull;
    private List<String> ShowObjectList;
    private List<String> ShowMessages;

}