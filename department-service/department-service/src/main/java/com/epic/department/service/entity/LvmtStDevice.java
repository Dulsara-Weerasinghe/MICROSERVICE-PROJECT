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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "LVMT_ST_DEVICE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtStDevice.findAll", query = "SELECT l FROM LvmtStDevice l"),
    @NamedQuery(name = "LvmtStDevice.findById", query = "SELECT l FROM LvmtStDevice l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtStDevice.findByWalletId", query = "SELECT l FROM LvmtStDevice l WHERE l.walletId = :walletId"),
    @NamedQuery(name = "LvmtStDevice.findByUuid", query = "SELECT l FROM LvmtStDevice l WHERE l.uuid = :uuid"),
    @NamedQuery(name = "LvmtStDevice.findByModel", query = "SELECT l FROM LvmtStDevice l WHERE l.model = :model"),
    @NamedQuery(name = "LvmtStDevice.findByBrand", query = "SELECT l FROM LvmtStDevice l WHERE l.brand = :brand"),
    @NamedQuery(name = "LvmtStDevice.findByOsVersion", query = "SELECT l FROM LvmtStDevice l WHERE l.osVersion = :osVersion"),
    @NamedQuery(name = "LvmtStDevice.findByOsType", query = "SELECT l FROM LvmtStDevice l WHERE l.osType = :osType"),
    @NamedQuery(name = "LvmtStDevice.findByPushId", query = "SELECT l FROM LvmtStDevice l WHERE l.pushId = :pushId"),
    @NamedQuery(name = "LvmtStDevice.findByInstituteId", query = "SELECT l FROM LvmtStDevice l WHERE l.instituteId = :instituteId"),
    @NamedQuery(name = "LvmtStDevice.findByStatus", query = "SELECT l FROM LvmtStDevice l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtStDevice.findByMobileNo", query = "SELECT l FROM LvmtStDevice l WHERE l.mobileNo = :mobileNo"),
    @NamedQuery(name = "LvmtStDevice.findByOtp", query = "SELECT l FROM LvmtStDevice l WHERE l.otp = :otp"),
    @NamedQuery(name = "LvmtStDevice.findByMpin", query = "SELECT l FROM LvmtStDevice l WHERE l.mpin = :mpin"),
    @NamedQuery(name = "LvmtStDevice.findByAttemptCount", query = "SELECT l FROM LvmtStDevice l WHERE l.attemptCount = :attemptCount"),
    @NamedQuery(name = "LvmtStDevice.findByCreateTime", query = "SELECT l FROM LvmtStDevice l WHERE l.createTime = :createTime"),
    @NamedQuery(name = "LvmtStDevice.findByLoginStatus", query = "SELECT l FROM LvmtStDevice l WHERE l.loginStatus = :loginStatus"),
    @NamedQuery(name = "LvmtStDevice.findByLastLoginTime", query = "SELECT l FROM LvmtStDevice l WHERE l.lastLoginTime = :lastLoginTime"),
    @NamedQuery(name = "LvmtStDevice.findByLastUpdatedTime", query = "SELECT l FROM LvmtStDevice l WHERE l.lastUpdatedTime = :lastUpdatedTime"),
    @NamedQuery(name = "LvmtStDevice.findByWalletType", query = "SELECT l FROM LvmtStDevice l WHERE l.walletType = :walletType"),
    @NamedQuery(name = "LvmtStDevice.findByFirstName", query = "SELECT l FROM LvmtStDevice l WHERE l.firstName = :firstName"),
    @NamedQuery(name = "LvmtStDevice.findByLastName", query = "SELECT l FROM LvmtStDevice l WHERE l.lastName = :lastName"),
    @NamedQuery(name = "LvmtStDevice.findByNic", query = "SELECT l FROM LvmtStDevice l WHERE l.nic = :nic"),
    @NamedQuery(name = "LvmtStDevice.findByEmail", query = "SELECT l FROM LvmtStDevice l WHERE l.email = :email"),
    @NamedQuery(name = "LvmtStDevice.findByProfileImage", query = "SELECT l FROM LvmtStDevice l WHERE l.profileImage = :profileImage"),
    @NamedQuery(name = "LvmtStDevice.findByAnsweredStatus", query = "SELECT l FROM LvmtStDevice l WHERE l.answeredStatus = :answeredStatus"),
    @NamedQuery(name = "LvmtStDevice.findByTraceNo", query = "SELECT l FROM LvmtStDevice l WHERE l.traceNo = :traceNo"),
    @NamedQuery(name = "LvmtStDevice.findByPinResetReq", query = "SELECT l FROM LvmtStDevice l WHERE l.pinResetReq = :pinResetReq"),
    @NamedQuery(name = "LvmtStDevice.findBySalted", query = "SELECT l FROM LvmtStDevice l WHERE l.salted = :salted"),
    @NamedQuery(name = "LvmtStDevice.findByAlgoChanged", query = "SELECT l FROM LvmtStDevice l WHERE l.algoChanged = :algoChanged"),
    @NamedQuery(name = "LvmtStDevice.findByReviewRemark", query = "SELECT l FROM LvmtStDevice l WHERE l.reviewRemark = :reviewRemark")})
public class LvmtStDevice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "WALLET_ID")
    private String walletId;
    @Column(name = "UUID")
    private String uuid;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "BRAND")
    private String brand;
    @Column(name = "OS_VERSION")
    private String osVersion;
    @Column(name = "OS_TYPE")
    private String osType;
    @Column(name = "PUSH_ID")
    private String pushId;
    @Column(name = "INSTITUTE_ID")
    private String instituteId;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private long status;
    @Column(name = "MOBILE_NO")
    private String mobileNo;
    @Column(name = "OTP")
    private String otp;
    @Column(name = "MPIN")
    private String mpin;
    @Column(name = "ATTEMPT_COUNT")
    private Long attemptCount;
    @Basic(optional = false)
    @Column(name = "CREATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Column(name = "LOGIN_STATUS")
    private Long loginStatus;
    @Column(name = "LAST_LOGIN_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginTime;
    @Column(name = "LAST_UPDATED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTime;
    @Column(name = "WALLET_TYPE")
    private Long walletType;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "NIC")
    private String nic;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PROFILE_IMAGE")
    private String profileImage;
    @Column(name = "ANSWERED_STATUS")
    private Short answeredStatus;
    @Column(name = "TRACE_NO")
    private Integer traceNo;
    @Column(name = "PIN_RESET_REQ")
    private Short pinResetReq;
    @Column(name = "SALTED")
    private String salted;
    @Column(name = "ALGO_CHANGED")
    private String algoChanged;
    @Column(name = "REVIEW_REMARK")
    private String reviewRemark;
    @Lob
    @Column(name = "IMG_PROFILE")
    private Serializable imgProfile;
    @Lob
    @Column(name = "IMG_NIC_FRONT")
    private Serializable imgNicFront;
    @Lob
    @Column(name = "IMG_NIC_BACK")
    private Serializable imgNicBack;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deviceId")
    private List<LvmtBillProfile> lvmtBillProfileList;
    @OneToMany(mappedBy = "deviceId")
    private List<LvmtJpRequests> lvmtJpRequestsList;
    @OneToMany(mappedBy = "deviceId")
    private List<LvmtJpChallangeReqHistory> lvmtJpChallangeReqHistoryList;

    public LvmtStDevice() {
    }

    public LvmtStDevice(Long id) {
        this.id = id;
    }

    public LvmtStDevice(Long id, String walletId, long status, Date createTime) {
        this.id = id;
        this.walletId = walletId;
        this.status = status;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    public String getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(String instituteId) {
        this.instituteId = instituteId;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getMpin() {
        return mpin;
    }

    public void setMpin(String mpin) {
        this.mpin = mpin;
    }

    public Long getAttemptCount() {
        return attemptCount;
    }

    public void setAttemptCount(Long attemptCount) {
        this.attemptCount = attemptCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Long loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public Long getWalletType() {
        return walletType;
    }

    public void setWalletType(Long walletType) {
        this.walletType = walletType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public Short getAnsweredStatus() {
        return answeredStatus;
    }

    public void setAnsweredStatus(Short answeredStatus) {
        this.answeredStatus = answeredStatus;
    }

    public Integer getTraceNo() {
        return traceNo;
    }

    public void setTraceNo(Integer traceNo) {
        this.traceNo = traceNo;
    }

    public Short getPinResetReq() {
        return pinResetReq;
    }

    public void setPinResetReq(Short pinResetReq) {
        this.pinResetReq = pinResetReq;
    }

    public String getSalted() {
        return salted;
    }

    public void setSalted(String salted) {
        this.salted = salted;
    }

    public String getAlgoChanged() {
        return algoChanged;
    }

    public void setAlgoChanged(String algoChanged) {
        this.algoChanged = algoChanged;
    }

    public String getReviewRemark() {
        return reviewRemark;
    }

    public void setReviewRemark(String reviewRemark) {
        this.reviewRemark = reviewRemark;
    }

    public Serializable getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(Serializable imgProfile) {
        this.imgProfile = imgProfile;
    }

    public Serializable getImgNicFront() {
        return imgNicFront;
    }

    public void setImgNicFront(Serializable imgNicFront) {
        this.imgNicFront = imgNicFront;
    }

    public Serializable getImgNicBack() {
        return imgNicBack;
    }

    public void setImgNicBack(Serializable imgNicBack) {
        this.imgNicBack = imgNicBack;
    }

    @XmlTransient
    public List<LvmtBillProfile> getLvmtBillProfileList() {
        return lvmtBillProfileList;
    }

    public void setLvmtBillProfileList(List<LvmtBillProfile> lvmtBillProfileList) {
        this.lvmtBillProfileList = lvmtBillProfileList;
    }

    @XmlTransient
    public List<LvmtJpRequests> getLvmtJpRequestsList() {
        return lvmtJpRequestsList;
    }

    public void setLvmtJpRequestsList(List<LvmtJpRequests> lvmtJpRequestsList) {
        this.lvmtJpRequestsList = lvmtJpRequestsList;
    }

    @XmlTransient
    public List<LvmtJpChallangeReqHistory> getLvmtJpChallangeReqHistoryList() {
        return lvmtJpChallangeReqHistoryList;
    }

    public void setLvmtJpChallangeReqHistoryList(List<LvmtJpChallangeReqHistory> lvmtJpChallangeReqHistoryList) {
        this.lvmtJpChallangeReqHistoryList = lvmtJpChallangeReqHistoryList;
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
        if (!(object instanceof LvmtStDevice)) {
            return false;
        }
        LvmtStDevice other = (LvmtStDevice) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtStDevice[ id=" + id + " ]";
    }
    
}
