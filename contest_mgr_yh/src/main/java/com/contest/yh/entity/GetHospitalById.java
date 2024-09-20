/**
  * Copyright 2024 bejson.com 
  */
package com.contest.yh.entity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Auto-generated: 2024-09-19 18:43:56
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
//@Data
@Document("GetHospitalById")
public class GetHospitalById {

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
    public String GUID;
    public String RequestID;
    public boolean IsSuccess;
    public int State;
    public String Message;
    public String ShowMsg;
    public boolean u_IsShowMsgNull;
    public List<String> ShowObjectList;
    public List<String> ShowMessages;

//    @Data
    public class Returns {

        public String BankAcctType;
        public String BankProvinceId;
        public String BankRegionId;
        public String BankAreaId;
        public String BankNo;
        public String BankAcctName;
        public String BankBranchName;
        public String LegalEmail;
        public String LegalMobile;
        public String ShopAddr;
        public String PrinPhone;
        public String FreezeMemo;
        public String UnfreezeTime;
        public String FreezeTime;
        public String InsertTime;
        public String LsSigned;
        public String SignedHtml;
        public String SignedNo;
        public String Lng;
        public String Lat;
        public String LegalidCardNo;
        public String ShopHouseNo;
        public String LsRegmer;
        public String LsLicense;
        public String BusinessHours;
        public String HisTypeStr;
        public String SaaSId;
        public String Pracertificate;
        public String LegalHandHeldidCard;
        public String Image;
        public String Intro;
        public String SubCode;
        public String HandheldidCard;
        public String ReverseidCard;
        public String FrontidCard;
        public String IndoorPhoto;
        public String ItemPhoto;
        public String SndbankInfo;
        public String FstbankInfo;
        public String FacadePhoto;
        public String HospPhoto;
        public String Permit;
        public String Certificate;
        public String McHuserId;
        public String License;
        public String SignBoard;
        public String LicenseCode;
        public String RegisterCode;
        public String OpeningBank;
        public String Phone;
        public String Address;
        public int Farthest;
        public int Area;
        public boolean IsActive;
        public int OrderBy;
        public String WbCode;
        public String PyCode;
        public String AreaId;
        public String Name;
        public String Code;
        public String BsSpeciaIDLists;
        public String  BsSpeciaNameLists;
        public boolean IsInterface;
        public boolean IsInterUMP;
        public String ReportTitle;
        public boolean IsEnableFreshInventory;
        public boolean IsEnableInventory;
        public int ID;
        public String Introduce;
        public String ShopWebsite;
        public String Email;
        public boolean IsOpenBusiness;
        public int ResidentPopulation;
        public String Memo;
        public String AccountNum;
        public String AccountName;
        public int Score;
        public int OralType;
        public String UserName;
        public String UnionId;
        public boolean IsSelect;
        public String ProvinceStr;
        public String RegIonStr;
        public String AreaStr;
        public String UnionName;
        public String CashierReport;
        public boolean IsAudit;
        public String ManageUser;
        public String EngDesc;
        public String UserId;
        public String ProvinceId;
        public String RegionId;
        public String MedicalCode;
        public String CentralCode;
        public int IconIndex;
        public int TentPopulation;
        public String LogoPath;
        public String ProvinceName;
        public String RegionName;
        public String AreaName;
        public int HospitalId;
        public int HisType;
        public String GUID;
    }
}