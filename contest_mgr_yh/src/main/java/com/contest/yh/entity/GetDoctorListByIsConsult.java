/**
  * Copyright 2024 bejson.com 
  */
package com.contest.yh.entity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Auto-generated: 2024-09-24 11:43:24
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Document("GetDoctorListByIsConsult")
public class GetDoctorListByIsConsult {

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

        public String GUID;
        public int HospitalId;
        public int HisType;
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
        public String SupDoctorId;
        public boolean IsChk;
        public String SortOrder;
        public String WbCode;
        public String PyCode;
        public String UserId;
        public String DoclevName;
        public String CertificateImage;
        public String MedicalImage;
        public String InsertTime;
        public String Code;
        public String Name;
        public String Sex;
        public String BirthDate;
        public String Address;
        public String City;
        public String Mobile;
        public String Email;
        public String LevelId;
        public String DocLevId;
        public String DocLevIdName;
        public String Introduce;
        public String LocationId;
        public String LocationName;
        public String RegTypeId;
        public String PicturePath;
        public int LsStatus;
        public int OrderBy;
        public int IconIndex;
        public String TechMemo;
        public int OrderCount;
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