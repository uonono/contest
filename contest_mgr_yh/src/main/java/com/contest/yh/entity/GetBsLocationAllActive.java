/**
  * Copyright 2024 bejson.com 
  */
package com.contest.yh.entity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Auto-generated: 2024-09-20 16:48:40
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Document("GetBsLocationAllActive")
public class GetBsLocationAllActive {

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

/**
 * Auto-generated: 2024-09-20 16:48:40
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
class Returns {

    public List<ReturnT> ReturnT;
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
class ReturnsInner {
    public String GUID;
}
class ReturnT {

    public String _ountryName;
    public boolean IsAudit;
    public String UserId;
    public String License;
    public String EMail;
    public String Phone;
    public String Certificate;
    public String UserName;
    public boolean IsLocationDiagSee;
    public String SpecName;
    public String ProvinceId;
    public String RegionId;
    public String AreaId;
    public String Address;
    public boolean IsRequiredMedicalCard;
    public boolean IsSelect;
    public String BsSpeciaNameLists;
    public String BsSpeciaIdLists;
    public String CashierReport;
    public String Code;
    public boolean u_IsNotSpecialityId;
    public String Name;
    public int LsInOut;
    public boolean IsForwomen;
    public String PhoneCode;
    public int MedicineRatio;
    public int OrderBy;
    public boolean IsActive;
    public int IconIndex;
    public String SpecialityId;
    public int BedSum;
    public String BaSysCode;
    public String Director;
    public String DeptTypeId;
    public boolean IsCostApp;
    public int AppLevel;
    public String PyCode;
    public String WbCode;
    public int Area;
    public String OuRoomId;
    public String InRoomId;
    public boolean IsPriceSub;
    public boolean IsClinical;
    public boolean IsChinLocation;
    public boolean IsRegLocation;
    public boolean IsAllLocation;
    public String ModiTime;
    public String ModiOperId;
    public String InsertTime;
    public boolean IsShow;
    public int Id;
    public String OperTime;
    public String Introduce;
    public String Lat;
    public String Lng;
    public boolean u_IsNotSpecialityIdNull;
    public boolean u_IsNotFunctionNull;
    public String FrozenYearMonth;
    public String Iconpath;
    public boolean u_IsHasSpecialityId;
    public boolean u_IsNameNull;
    public boolean U_isInHospital;
    public boolean U_isLeaveHospital;
    public boolean U_isLsInOutIn;
    public boolean U_isLsInOutAll;
    public boolean u_IsGeriatrics;
    public boolean u_IsHospitalId;
    public boolean u_IsNotNameNull;
    public boolean u_IsNotOuRoomIdNull;
    public boolean u_IsOuRoomIdNull;
    public boolean u_IsNotInRoomIdNull;
    public boolean u_IsInRoomIdNull;
    public boolean u_IsPediatry;
    public boolean u_LsInOut;
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



