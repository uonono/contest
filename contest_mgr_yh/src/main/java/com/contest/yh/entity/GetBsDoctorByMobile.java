/**
  * Copyright 2024 bejson.com 
  */
package com.contest.yh.entity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Auto-generated: 2024-09-25 16:19:34
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Document("GetBsDoctorByMobile")
public class GetBsDoctorByMobile {

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
    public class Returns {
        public List<String> ReturnT;
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
        public ReturnsInner Returns;
        public class ReturnsInner {
            public String ReturnT;
        }
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