/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_MERCHANT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtMerchant.findAll", query = "SELECT l FROM LvmtMerchant l"),
    @NamedQuery(name = "LvmtMerchant.findByMid", query = "SELECT l FROM LvmtMerchant l WHERE l.lvmtMerchantPK.mid = :mid"),
    @NamedQuery(name = "LvmtMerchant.findByInstitute", query = "SELECT l FROM LvmtMerchant l WHERE l.lvmtMerchantPK.institute = :institute"),
    @NamedQuery(name = "LvmtMerchant.findByName", query = "SELECT l FROM LvmtMerchant l WHERE l.name = :name"),
    @NamedQuery(name = "LvmtMerchant.findByType", query = "SELECT l FROM LvmtMerchant l WHERE l.type = :type"),
    @NamedQuery(name = "LvmtMerchant.findByAccount", query = "SELECT l FROM LvmtMerchant l WHERE l.account = :account"),
    @NamedQuery(name = "LvmtMerchant.findByAddress", query = "SELECT l FROM LvmtMerchant l WHERE l.address = :address"),
    @NamedQuery(name = "LvmtMerchant.findByTid", query = "SELECT l FROM LvmtMerchant l WHERE l.tid = :tid"),
    @NamedQuery(name = "LvmtMerchant.findByCreatetime", query = "SELECT l FROM LvmtMerchant l WHERE l.createtime = :createtime"),
    @NamedQuery(name = "LvmtMerchant.findByLastupdatedtime", query = "SELECT l FROM LvmtMerchant l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtMerchant.findByLastupdateduser", query = "SELECT l FROM LvmtMerchant l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtMerchant.findByContactNo1", query = "SELECT l FROM LvmtMerchant l WHERE l.contactNo1 = :contactNo1"),
    @NamedQuery(name = "LvmtMerchant.findByEmail1", query = "SELECT l FROM LvmtMerchant l WHERE l.email1 = :email1"),
    @NamedQuery(name = "LvmtMerchant.findByLegalName", query = "SELECT l FROM LvmtMerchant l WHERE l.legalName = :legalName"),
    @NamedQuery(name = "LvmtMerchant.findByMcc", query = "SELECT l FROM LvmtMerchant l WHERE l.mcc = :mcc"),
    @NamedQuery(name = "LvmtMerchant.findByStatus", query = "SELECT l FROM LvmtMerchant l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtMerchant.findByInvoiceNo", query = "SELECT l FROM LvmtMerchant l WHERE l.invoiceNo = :invoiceNo"),
    @NamedQuery(name = "LvmtMerchant.findByNic", query = "SELECT l FROM LvmtMerchant l WHERE l.nic = :nic"),
    @NamedQuery(name = "LvmtMerchant.findBySecretCode", query = "SELECT l FROM LvmtMerchant l WHERE l.secretCode = :secretCode"),
    @NamedQuery(name = "LvmtMerchant.findByTxnVerificationType", query = "SELECT l FROM LvmtMerchant l WHERE l.txnVerificationType = :txnVerificationType"),
    @NamedQuery(name = "LvmtMerchant.findByEncMid", query = "SELECT l FROM LvmtMerchant l WHERE l.encMid = :encMid"),
    @NamedQuery(name = "LvmtMerchant.findByEncTid", query = "SELECT l FROM LvmtMerchant l WHERE l.encTid = :encTid"),
    @NamedQuery(name = "LvmtMerchant.findByDeviceId", query = "SELECT l FROM LvmtMerchant l WHERE l.deviceId = :deviceId"),
    @NamedQuery(name = "LvmtMerchant.findByAccountType", query = "SELECT l FROM LvmtMerchant l WHERE l.accountType = :accountType"),
    @NamedQuery(name = "LvmtMerchant.findByCity", query = "SELECT l FROM LvmtMerchant l WHERE l.city = :city"),
    @NamedQuery(name = "LvmtMerchant.findByLatitude", query = "SELECT l FROM LvmtMerchant l WHERE l.latitude = :latitude"),
    @NamedQuery(name = "LvmtMerchant.findByLongitude", query = "SELECT l FROM LvmtMerchant l WHERE l.longitude = :longitude"),
    @NamedQuery(name = "LvmtMerchant.findByMerchantCus", query = "SELECT l FROM LvmtMerchant l WHERE l.merchantCus = :merchantCus"),
    @NamedQuery(name = "LvmtMerchant.findByCostCenterCode", query = "SELECT l FROM LvmtMerchant l WHERE l.costCenterCode = :costCenterCode"),
    @NamedQuery(name = "LvmtMerchant.findByUserpassGen", query = "SELECT l FROM LvmtMerchant l WHERE l.userpassGen = :userpassGen"),
    @NamedQuery(name = "LvmtMerchant.findByReferenceLabel", query = "SELECT l FROM LvmtMerchant l WHERE l.referenceLabel = :referenceLabel"),
    @NamedQuery(name = "LvmtMerchant.findBySecretKey", query = "SELECT l FROM LvmtMerchant l WHERE l.secretKey = :secretKey")})
public class LvmtMerchant implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LvmtMerchantPK lvmtMerchantPK;
    @Column(name = "NAME")
    private String name;
    @Column(name = "TYPE")
    private Long type;
    @Column(name = "ACCOUNT")
    private String account;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "TID")
    private String tid;
    @Basic(optional = false)
    @Column(name = "CREATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Column(name = "LASTUPDATEDUSER")
    private String lastupdateduser;
    @Column(name = "CONTACT_NO1")
    private String contactNo1;
    @Column(name = "EMAIL1")
    private String email1;
    @Column(name = "LEGAL_NAME")
    private String legalName;
    @Column(name = "MCC")
    private String mcc;
    @Lob
    @Column(name = "QR_CODE_BLOB")
    private Serializable qrCodeBlob;
    @Column(name = "STATUS")
    private Long status;
    @Column(name = "INVOICE_NO")
    private Long invoiceNo;
    @Column(name = "NIC")
    private String nic;
    @Column(name = "SECRET_CODE")
    private String secretCode;
    @Column(name = "TXN_VERIFICATION_TYPE")
    private String txnVerificationType;
    @Column(name = "ENC_MID")
    private String encMid;
    @Column(name = "ENC_TID")
    private String encTid;
    @Column(name = "DEVICE_ID")
    private Long deviceId;
    @Column(name = "ACCOUNT_TYPE")
    private String accountType;
    @Column(name = "CITY")
    private String city;
    @Column(name = "LATITUDE")
    private String latitude;
    @Column(name = "LONGITUDE")
    private String longitude;
    @Column(name = "MERCHANT_CUS")
    private String merchantCus;
    @Column(name = "COST_CENTER_CODE")
    private String costCenterCode;
    @Column(name = "USERPASS_GEN")
    private Short userpassGen;
    @Column(name = "REFERENCE_LABEL")
    private String referenceLabel;
    @Column(name = "SECRET_KEY")
    private String secretKey;
    @OneToMany(mappedBy = "lvmtMerchant")
    private List<LvmtTerminal> lvmtTerminalList;
    @JoinColumn(name = "SERVICE_PROVIDER", referencedColumnName = "PROVIDER_ID")
    @ManyToOne
    private LvmtBillServiceProvider serviceProvider;
    @JoinColumn(name = "BRANCH_CODE", referencedColumnName = "BRANCHCODE")
    @ManyToOne
    private LvmtBranch branchCode;
    @JoinColumn(name = "CHANNEL_TYPE", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtMerchantChannelType channelType;

    public LvmtMerchant() {
    }

    public LvmtMerchant(LvmtMerchantPK lvmtMerchantPK) {
        this.lvmtMerchantPK = lvmtMerchantPK;
    }

    public LvmtMerchant(LvmtMerchantPK lvmtMerchantPK, Date createtime) {
        this.lvmtMerchantPK = lvmtMerchantPK;
        this.createtime = createtime;
    }

    public LvmtMerchant(String mid, String institute) {
        this.lvmtMerchantPK = new LvmtMerchantPK(mid, institute);
    }

    public LvmtMerchantPK getLvmtMerchantPK() {
        return lvmtMerchantPK;
    }

    public void setLvmtMerchantPK(LvmtMerchantPK lvmtMerchantPK) {
        this.lvmtMerchantPK = lvmtMerchantPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public String getLastupdateduser() {
        return lastupdateduser;
    }

    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
    }

    public String getContactNo1() {
        return contactNo1;
    }

    public void setContactNo1(String contactNo1) {
        this.contactNo1 = contactNo1;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public Serializable getQrCodeBlob() {
        return qrCodeBlob;
    }

    public void setQrCodeBlob(Serializable qrCodeBlob) {
        this.qrCodeBlob = qrCodeBlob;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    public String getTxnVerificationType() {
        return txnVerificationType;
    }

    public void setTxnVerificationType(String txnVerificationType) {
        this.txnVerificationType = txnVerificationType;
    }

    public String getEncMid() {
        return encMid;
    }

    public void setEncMid(String encMid) {
        this.encMid = encMid;
    }

    public String getEncTid() {
        return encTid;
    }

    public void setEncTid(String encTid) {
        this.encTid = encTid;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getMerchantCus() {
        return merchantCus;
    }

    public void setMerchantCus(String merchantCus) {
        this.merchantCus = merchantCus;
    }

    public String getCostCenterCode() {
        return costCenterCode;
    }

    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }

    public Short getUserpassGen() {
        return userpassGen;
    }

    public void setUserpassGen(Short userpassGen) {
        this.userpassGen = userpassGen;
    }

    public String getReferenceLabel() {
        return referenceLabel;
    }

    public void setReferenceLabel(String referenceLabel) {
        this.referenceLabel = referenceLabel;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    @XmlTransient
    public List<LvmtTerminal> getLvmtTerminalList() {
        return lvmtTerminalList;
    }

    public void setLvmtTerminalList(List<LvmtTerminal> lvmtTerminalList) {
        this.lvmtTerminalList = lvmtTerminalList;
    }

    public LvmtBillServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(LvmtBillServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public LvmtBranch getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(LvmtBranch branchCode) {
        this.branchCode = branchCode;
    }

    public LvmtMerchantChannelType getChannelType() {
        return channelType;
    }

    public void setChannelType(LvmtMerchantChannelType channelType) {
        this.channelType = channelType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lvmtMerchantPK != null ? lvmtMerchantPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtMerchant)) {
            return false;
        }
        LvmtMerchant other = (LvmtMerchant) object;
        if ((this.lvmtMerchantPK == null && other.lvmtMerchantPK != null) || (this.lvmtMerchantPK != null && !this.lvmtMerchantPK.equals(other.lvmtMerchantPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtMerchant[ lvmtMerchantPK=" + lvmtMerchantPK + " ]";
    }
    
}
