/**
  * Copyright 2024 bejson.com 
  */
package com.contest.yh.entity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Auto-generated: 2024-09-24 16:53:54
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Document("GetWcReservePatByPatId")
public class GetWcReservePatByPatId {
    public List<ReturnT> ReturnT;
    public class ReturnT {
        public String _ountryName;
        public String PatName;
        public String PatTypeId;
        public String OrderInfoId;
        public double Amount;
        public WcReserve WcReserve;
        public class WcReserve {
            public String _ountryName;
            public double Amount;
            public String PatId;
            public String PatName;
            public int LsType;
            public String Name;
            public String Mobile;
            public String ReserveTime;
            public String Memo;
            public String ReserveNo;
            public boolean IsArrange;
            public String ArrangeOperId;
            public String ArrangeTime;
            public String ReplyMemo;
            public String InsertTime;
            public String Places;
            public int VisitNum;
            public String Team;
            public String VisitTime;
            public String LinkManName;
            public String IdCardNo;
            public String AddRessHome;
            public String CkItemId;
            public String MzRegNo;
            public String LocationId;
            public String DoctorId;
            public String RegTypeId;
            public String PatTypeId;
            public String EquipmentId;
            public String EndTime;
            public String ReservedtlMemo;
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
        public List<LstUserBindingReserve> LstUserBindingReserve;
        public class LstUserBindingReserve {
            public String _ountryName;
            public String PatId;
            public int LsType;
            public String Name;
            public String Mobile;
            public String ReserveTime;
            public String Memo;
            public String ReserveNo;
            public boolean IsArrange;
            public String ArrangeOperId;
            public String ArrangeTime;
            public String ReplyMemo;
            public String InsertTime;
            public String Places;
            public int VisitNum;
            public String Team;
            public String VisitTime;
            public String LinkManName;
            public String IdCardNo;
            public String AddRessHome;
            public String CkItemId;
            public String MzRegNo;
            public String LocationId;
            public String DoctorId;
            public String RegTypeId;
            public String PatTypeId;
            public String PatName;
            public int ItemPriceDiag;
            public String ItemId;
            public String ItemName;
            public String ItemGroupMainId;
            public String ItemGroupSubId;
            public int ItemLsRpType;
            public String ItemOperTime;
            public boolean IsOnlyForSys;
            public int PriceDiag;
            public String ReserveId;
            public String OrderInfoId;
            public int Amount;
            public String LstWcReserveDtl;
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
        public String ServiceTime;
        public int OrderInfoPlanCount;
        public String AreaId;
        public String Address;
        public String BillNo;
        public String StringRemarks;
        public String FinishTime;
        public String InsertTime;
        public boolean IsActive;
        public String ItemId;
        public int LsStatus;
        public String OperId;
        public int OrderLive;
        public int OrderStart;
        public int OrderType;
        public String PatId;
        public int PayStart;
        public int PayWay;
        public String PropvinceId;
        public String RegionId;
        public String ReserveId;
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
        public String string;
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
