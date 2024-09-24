/**
  * Copyright 2024 bejson.com 
  */
package com.contest.yh.entity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Auto-generated: 2024-09-24 15:59:51
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Document("GetOuRechargtion")
public class GetOuRechargtion {

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
        public List<ReturnT> ReturnT;
        public class ReturnT {
            public String _ountryName;
            public String PayWayName;
            public String OperTypeName;
            public String OperName;
            public String HospitalName;
            public int DepositAmount;
            public String VoucherName;
            public int VoucherAmount;
            public boolean IsUse;
            public String EffectiveDate;
            public String InsertTime;
            public String PatID;
            public String CardNo;
            public int Income;
            public int PayOut;
            public int Balance;
            public String PayWayId;
            public int OperType;
            public String OperId;
            public String OperTime;
            public String Comments;
            public String VipTypeID;
            public String VipCardID;
            public int IndividualPay;
            public int Givenamount;
            public int Givenamounthis;
            public int IndividualPayhis;
            public String InvoID;
            public String LocationId;
            public int LsSource;
            public String SerialNumber;
            public String OrderId;
            public String IntroducerOperId;
            public boolean IsDeposit;
            public String DepeffectDate;
            public boolean U_isOperTypeRecharge;
            public boolean U_isOperTypeGiving;
            public boolean U_isOperTypeRefund;
            public boolean U_isOperTypePay;
            public boolean U_isOperTypeCancelRefund;
            public boolean U_isNotVipCardIDNull;
            public boolean U_isOperTypeTransfer;
            public boolean U_isItemConsumeDeductible;
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
        public ReturnsInner Returns;
        public class ReturnsInner {
            public String _ountryName;
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