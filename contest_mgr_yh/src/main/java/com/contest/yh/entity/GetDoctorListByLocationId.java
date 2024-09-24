/**
  * Copyright 2024 bejson.com 
  */
package com.contest.yh.entity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Auto-generated: 2024-09-24 11:0:19
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Document("GetDoctorListByLocationId")
public class GetDoctorListByLocationId {

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
    public List<Returns> Returns;

    public class Returns {

        public String Code;
        public String Name;
        public String Sex;
        public String  BirthDate;
        public String Address;
        public String Mobile;
        public String Email;
        public String LevelId;
        public String DocLevId;
        public String DoclevName;
        public String Introduce;
        public String LocationId;
        public String LocationName;
        public String RegTypeId;
        public String PicturePath;
        public int LsStatus;
        public int OrderBy;
        public int IconIndex;
        public String UserId;
        public String PyCode;
        public String WbCode;
        public String SupDoctorId;
        public String DiagRoomId;
        public String OperTime;
        public boolean IsPoisonMa;
        public boolean IsRecipe;
        public int Grade;
        public boolean IsConsult;
        public String DoctorOpenId;
        public String Domain;
        public String Honor;
        public int Score;
        public boolean IsChk;
        public String SortOrder;
        public int HospitalId;
        public String HospitalName;
        public int HisType;
        public String RoleId;
        public String RoleName;
        public String GUID;
        public String DocCertifyCode;
        public String YbCode;
        public boolean IsDocRegType;
        public List<String> disableTimes;
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