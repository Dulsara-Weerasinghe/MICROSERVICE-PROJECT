/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_SWT_ST_TRANSACTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtStTransaction.findAll", query = "SELECT l FROM LvmtSwtStTransaction l"),
    @NamedQuery(name = "LvmtSwtStTransaction.findById", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByTxntype", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.txntype = :txntype"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByDatetime", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.datetime = :datetime"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByAmount", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.amount = :amount"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByInvoiceno", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.invoiceno = :invoiceno"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByStatus", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByTxnDateTime", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.txnDateTime = :txnDateTime"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByTraceNumber", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.traceNumber = :traceNumber"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByFromAccountNumber", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.fromAccountNumber = :fromAccountNumber"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByToAccountNumber", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.toAccountNumber = :toAccountNumber"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByTid", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.tid = :tid"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByMid", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.mid = :mid"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByListneruid", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.listneruid = :listneruid"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByResponcecode", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.responcecode = :responcecode"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByMaskingFromAccount", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.maskingFromAccount = :maskingFromAccount"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByMaskingToAccount", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.maskingToAccount = :maskingToAccount"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByMaskingCardNo", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.maskingCardNo = :maskingCardNo"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByCardNo", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.cardNo = :cardNo"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByExpireDate", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.expireDate = :expireDate"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByInstrumentType", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.instrumentType = :instrumentType"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByLocalTime", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.localTime = :localTime"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByLocalDate", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.localDate = :localDate"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByRrn", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.rrn = :rrn"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByIsoDateTime", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.isoDateTime = :isoDateTime"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByCvv", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.cvv = :cvv"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByCustomerName", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.customerName = :customerName"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByMerchantLegalName", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.merchantLegalName = :merchantLegalName"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByMerchantAddress", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.merchantAddress = :merchantAddress"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByDeviceId", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.deviceId = :deviceId"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByMerchantBank", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.merchantBank = :merchantBank"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByCustomerBank", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.customerBank = :customerBank"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByCustomerInstrumentBank", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.customerInstrumentBank = :customerInstrumentBank"),
    @NamedQuery(name = "LvmtSwtStTransaction.findBySequanceNumber", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.sequanceNumber = :sequanceNumber"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByBankCommision", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.bankCommision = :bankCommision"),
    @NamedQuery(name = "LvmtSwtStTransaction.findBySettleStatus", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.settleStatus = :settleStatus"),
    @NamedQuery(name = "LvmtSwtStTransaction.findBySettleDate", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.settleDate = :settleDate"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByCusAccountType", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.cusAccountType = :cusAccountType"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByMerAccountType", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.merAccountType = :merAccountType"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByMerCommission", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.merCommission = :merCommission"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByCusCommission", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.cusCommission = :cusCommission"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByMerComRate", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.merComRate = :merComRate"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByCusComRate", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.cusComRate = :cusComRate"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByMerchantNotifyStatus", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.merchantNotifyStatus = :merchantNotifyStatus"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByCustomerNotifyStatus", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.customerNotifyStatus = :customerNotifyStatus"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByCommissionType", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.commissionType = :commissionType"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByCraetedTime", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.craetedTime = :craetedTime"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByBusinessDate", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.businessDate = :businessDate"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByNode", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.node = :node"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByBillReffrenceNumber", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.billReffrenceNumber = :billReffrenceNumber"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByBillProviderId", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.billProviderId = :billProviderId"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByBillCatId", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.billCatId = :billCatId"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByQrChannel", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.qrChannel = :qrChannel"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByQrcVoucherNo", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.qrcVoucherNo = :qrcVoucherNo"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByUpayMsgId", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.upayMsgId = :upayMsgId"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByVoidStatus", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.voidStatus = :voidStatus"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByCeftRrn", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.ceftRrn = :ceftRrn"),
    @NamedQuery(name = "LvmtSwtStTransaction.findByBenefiName", query = "SELECT l FROM LvmtSwtStTransaction l WHERE l.benefiName = :benefiName")})
public class LvmtSwtStTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "TXNTYPE")
    private String txntype;
    @Basic(optional = false)
    @Column(name = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "INVOICENO")
    private String invoiceno;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private long status;
    @Column(name = "TXN_DATE_TIME")
    private String txnDateTime;
    @Column(name = "TRACE_NUMBER")
    private String traceNumber;
    @Column(name = "FROM_ACCOUNT_NUMBER")
    private String fromAccountNumber;
    @Column(name = "TO_ACCOUNT_NUMBER")
    private String toAccountNumber;
    @Column(name = "TID")
    private String tid;
    @Column(name = "MID")
    private String mid;
    @Column(name = "LISTNERUID")
    private String listneruid;
    @Column(name = "RESPONCECODE")
    private String responcecode;
    @Column(name = "MASKING_FROM_ACCOUNT")
    private String maskingFromAccount;
    @Column(name = "MASKING_TO_ACCOUNT")
    private String maskingToAccount;
    @Column(name = "MASKING_CARD_NO")
    private String maskingCardNo;
    @Column(name = "CARD_NO")
    private String cardNo;
    @Column(name = "EXPIRE_DATE")
    private String expireDate;
    @Column(name = "INSTRUMENT_TYPE")
    private String instrumentType;
    @Column(name = "LOCAL_TIME")
    private String localTime;
    @Column(name = "LOCAL_DATE")
    private String localDate;
    @Column(name = "RRN")
    private String rrn;
    @Column(name = "ISO_DATE_TIME")
    private String isoDateTime;
    @Column(name = "CVV")
    private String cvv;
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Column(name = "MERCHANT_LEGAL_NAME")
    private String merchantLegalName;
    @Column(name = "MERCHANT_ADDRESS")
    private String merchantAddress;
    @Column(name = "DEVICE_ID")
    private Long deviceId;
    @Column(name = "MERCHANT_BANK")
    private String merchantBank;
    @Column(name = "CUSTOMER_BANK")
    private String customerBank;
    @Column(name = "CUSTOMER_INSTRUMENT_BANK")
    private String customerInstrumentBank;
    @Column(name = "SEQUANCE_NUMBER")
    private Integer sequanceNumber;
    @Column(name = "BANK_COMMISION")
    private BigDecimal bankCommision;
    @Column(name = "SETTLE_STATUS")
    private Short settleStatus;
    @Column(name = "SETTLE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date settleDate;
    @Column(name = "CUS_ACCOUNT_TYPE")
    private String cusAccountType;
    @Column(name = "MER_ACCOUNT_TYPE")
    private String merAccountType;
    @Column(name = "MER_COMMISSION")
    private BigDecimal merCommission;
    @Column(name = "CUS_COMMISSION")
    private BigDecimal cusCommission;
    @Column(name = "MER_COM_RATE")
    private String merComRate;
    @Column(name = "CUS_COM_RATE")
    private String cusComRate;
    @Column(name = "MERCHANT_NOTIFY_STATUS")
    private Short merchantNotifyStatus;
    @Column(name = "CUSTOMER_NOTIFY_STATUS")
    private Short customerNotifyStatus;
    @Column(name = "COMMISSION_TYPE")
    private String commissionType;
    @Column(name = "CRAETED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date craetedTime;
    @Column(name = "BUSINESS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date businessDate;
    @Column(name = "NODE")
    private BigInteger node;
    @Column(name = "BILL_REFFRENCE_NUMBER")
    private String billReffrenceNumber;
    @Column(name = "BILL_PROVIDER_ID")
    private String billProviderId;
    @Column(name = "BILL_CAT_ID")
    private String billCatId;
    @Column(name = "QR_CHANNEL")
    private Short qrChannel;
    @Column(name = "QRC_VOUCHER_NO")
    private String qrcVoucherNo;
    @Column(name = "UPAY_MSG_ID")
    private String upayMsgId;
    @Column(name = "VOID_STATUS")
    private String voidStatus;
    @Lob
    @Column(name = "FULL_REF_ORG_REQ")
    private String fullRefOrgReq;
    @Column(name = "CEFT_RRN")
    private String ceftRrn;
    @Column(name = "BENEFI_NAME")
    private String benefiName;

    public LvmtSwtStTransaction() {
    }

    public LvmtSwtStTransaction(String id) {
        this.id = id;
    }

    public LvmtSwtStTransaction(String id, Date datetime, long status) {
        this.id = id;
        this.datetime = datetime;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTxntype() {
        return txntype;
    }

    public void setTxntype(String txntype) {
        this.txntype = txntype;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public String getTxnDateTime() {
        return txnDateTime;
    }

    public void setTxnDateTime(String txnDateTime) {
        this.txnDateTime = txnDateTime;
    }

    public String getTraceNumber() {
        return traceNumber;
    }

    public void setTraceNumber(String traceNumber) {
        this.traceNumber = traceNumber;
    }

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public void setFromAccountNumber(String fromAccountNumber) {
        this.fromAccountNumber = fromAccountNumber;
    }

    public String getToAccountNumber() {
        return toAccountNumber;
    }

    public void setToAccountNumber(String toAccountNumber) {
        this.toAccountNumber = toAccountNumber;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getListneruid() {
        return listneruid;
    }

    public void setListneruid(String listneruid) {
        this.listneruid = listneruid;
    }

    public String getResponcecode() {
        return responcecode;
    }

    public void setResponcecode(String responcecode) {
        this.responcecode = responcecode;
    }

    public String getMaskingFromAccount() {
        return maskingFromAccount;
    }

    public void setMaskingFromAccount(String maskingFromAccount) {
        this.maskingFromAccount = maskingFromAccount;
    }

    public String getMaskingToAccount() {
        return maskingToAccount;
    }

    public void setMaskingToAccount(String maskingToAccount) {
        this.maskingToAccount = maskingToAccount;
    }

    public String getMaskingCardNo() {
        return maskingCardNo;
    }

    public void setMaskingCardNo(String maskingCardNo) {
        this.maskingCardNo = maskingCardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getLocalTime() {
        return localTime;
    }

    public void setLocalTime(String localTime) {
        this.localTime = localTime;
    }

    public String getLocalDate() {
        return localDate;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public String getIsoDateTime() {
        return isoDateTime;
    }

    public void setIsoDateTime(String isoDateTime) {
        this.isoDateTime = isoDateTime;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMerchantLegalName() {
        return merchantLegalName;
    }

    public void setMerchantLegalName(String merchantLegalName) {
        this.merchantLegalName = merchantLegalName;
    }

    public String getMerchantAddress() {
        return merchantAddress;
    }

    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getMerchantBank() {
        return merchantBank;
    }

    public void setMerchantBank(String merchantBank) {
        this.merchantBank = merchantBank;
    }

    public String getCustomerBank() {
        return customerBank;
    }

    public void setCustomerBank(String customerBank) {
        this.customerBank = customerBank;
    }

    public String getCustomerInstrumentBank() {
        return customerInstrumentBank;
    }

    public void setCustomerInstrumentBank(String customerInstrumentBank) {
        this.customerInstrumentBank = customerInstrumentBank;
    }

    public Integer getSequanceNumber() {
        return sequanceNumber;
    }

    public void setSequanceNumber(Integer sequanceNumber) {
        this.sequanceNumber = sequanceNumber;
    }

    public BigDecimal getBankCommision() {
        return bankCommision;
    }

    public void setBankCommision(BigDecimal bankCommision) {
        this.bankCommision = bankCommision;
    }

    public Short getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(Short settleStatus) {
        this.settleStatus = settleStatus;
    }

    public Date getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(Date settleDate) {
        this.settleDate = settleDate;
    }

    public String getCusAccountType() {
        return cusAccountType;
    }

    public void setCusAccountType(String cusAccountType) {
        this.cusAccountType = cusAccountType;
    }

    public String getMerAccountType() {
        return merAccountType;
    }

    public void setMerAccountType(String merAccountType) {
        this.merAccountType = merAccountType;
    }

    public BigDecimal getMerCommission() {
        return merCommission;
    }

    public void setMerCommission(BigDecimal merCommission) {
        this.merCommission = merCommission;
    }

    public BigDecimal getCusCommission() {
        return cusCommission;
    }

    public void setCusCommission(BigDecimal cusCommission) {
        this.cusCommission = cusCommission;
    }

    public String getMerComRate() {
        return merComRate;
    }

    public void setMerComRate(String merComRate) {
        this.merComRate = merComRate;
    }

    public String getCusComRate() {
        return cusComRate;
    }

    public void setCusComRate(String cusComRate) {
        this.cusComRate = cusComRate;
    }

    public Short getMerchantNotifyStatus() {
        return merchantNotifyStatus;
    }

    public void setMerchantNotifyStatus(Short merchantNotifyStatus) {
        this.merchantNotifyStatus = merchantNotifyStatus;
    }

    public Short getCustomerNotifyStatus() {
        return customerNotifyStatus;
    }

    public void setCustomerNotifyStatus(Short customerNotifyStatus) {
        this.customerNotifyStatus = customerNotifyStatus;
    }

    public String getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(String commissionType) {
        this.commissionType = commissionType;
    }

    public Date getCraetedTime() {
        return craetedTime;
    }

    public void setCraetedTime(Date craetedTime) {
        this.craetedTime = craetedTime;
    }

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    public BigInteger getNode() {
        return node;
    }

    public void setNode(BigInteger node) {
        this.node = node;
    }

    public String getBillReffrenceNumber() {
        return billReffrenceNumber;
    }

    public void setBillReffrenceNumber(String billReffrenceNumber) {
        this.billReffrenceNumber = billReffrenceNumber;
    }

    public String getBillProviderId() {
        return billProviderId;
    }

    public void setBillProviderId(String billProviderId) {
        this.billProviderId = billProviderId;
    }

    public String getBillCatId() {
        return billCatId;
    }

    public void setBillCatId(String billCatId) {
        this.billCatId = billCatId;
    }

    public Short getQrChannel() {
        return qrChannel;
    }

    public void setQrChannel(Short qrChannel) {
        this.qrChannel = qrChannel;
    }

    public String getQrcVoucherNo() {
        return qrcVoucherNo;
    }

    public void setQrcVoucherNo(String qrcVoucherNo) {
        this.qrcVoucherNo = qrcVoucherNo;
    }

    public String getUpayMsgId() {
        return upayMsgId;
    }

    public void setUpayMsgId(String upayMsgId) {
        this.upayMsgId = upayMsgId;
    }

    public String getVoidStatus() {
        return voidStatus;
    }

    public void setVoidStatus(String voidStatus) {
        this.voidStatus = voidStatus;
    }

    public String getFullRefOrgReq() {
        return fullRefOrgReq;
    }

    public void setFullRefOrgReq(String fullRefOrgReq) {
        this.fullRefOrgReq = fullRefOrgReq;
    }

    public String getCeftRrn() {
        return ceftRrn;
    }

    public void setCeftRrn(String ceftRrn) {
        this.ceftRrn = ceftRrn;
    }

    public String getBenefiName() {
        return benefiName;
    }

    public void setBenefiName(String benefiName) {
        this.benefiName = benefiName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtStTransaction)) {
            return false;
        }
        LvmtSwtStTransaction other = (LvmtSwtStTransaction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtStTransaction[ id=" + id + " ]";
    }
    
}
