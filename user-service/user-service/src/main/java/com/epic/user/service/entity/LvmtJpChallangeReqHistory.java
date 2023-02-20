/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "LVMT_JP_CHALLANGE_REQ_HISTORY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtJpChallangeReqHistory.findAll", query = "SELECT l FROM LvmtJpChallangeReqHistory l"),
    @NamedQuery(name = "LvmtJpChallangeReqHistory.findByTxnid", query = "SELECT l FROM LvmtJpChallangeReqHistory l WHERE l.txnid = :txnid"),
    @NamedQuery(name = "LvmtJpChallangeReqHistory.findByMobileNo", query = "SELECT l FROM LvmtJpChallangeReqHistory l WHERE l.mobileNo = :mobileNo"),
    @NamedQuery(name = "LvmtJpChallangeReqHistory.findByEmail", query = "SELECT l FROM LvmtJpChallangeReqHistory l WHERE l.email = :email"),
    @NamedQuery(name = "LvmtJpChallangeReqHistory.findByPlatform", query = "SELECT l FROM LvmtJpChallangeReqHistory l WHERE l.platform = :platform"),
    @NamedQuery(name = "LvmtJpChallangeReqHistory.findByJustpayCode", query = "SELECT l FROM LvmtJpChallangeReqHistory l WHERE l.justpayCode = :justpayCode"),
    @NamedQuery(name = "LvmtJpChallangeReqHistory.findByChallengeId", query = "SELECT l FROM LvmtJpChallangeReqHistory l WHERE l.challengeId = :challengeId"),
    @NamedQuery(name = "LvmtJpChallangeReqHistory.findByCreatedTime", query = "SELECT l FROM LvmtJpChallangeReqHistory l WHERE l.createdTime = :createdTime"),
    @NamedQuery(name = "LvmtJpChallangeReqHistory.findByLpayDeviceId", query = "SELECT l FROM LvmtJpChallangeReqHistory l WHERE l.lpayDeviceId = :lpayDeviceId"),
    @NamedQuery(name = "LvmtJpChallangeReqHistory.findByLastUpdatedTime", query = "SELECT l FROM LvmtJpChallangeReqHistory l WHERE l.lastUpdatedTime = :lastUpdatedTime"),
    @NamedQuery(name = "LvmtJpChallangeReqHistory.findByUserid", query = "SELECT l FROM LvmtJpChallangeReqHistory l WHERE l.userid = :userid"),
    @NamedQuery(name = "LvmtJpChallangeReqHistory.findByUsername", query = "SELECT l FROM LvmtJpChallangeReqHistory l WHERE l.username = :username")})
public class LvmtJpChallangeReqHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TXNID")
    private String txnid;
    @Column(name = "MOBILE_NO")
    private String mobileNo;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PLATFORM")
    private String platform;
    @Column(name = "JUSTPAY_CODE")
    private String justpayCode;
    @Column(name = "CHALLENGE_ID")
    private String challengeId;
    @Column(name = "CREATED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    @Column(name = "LPAY_DEVICE_ID")
    private String lpayDeviceId;
    @Column(name = "LAST_UPDATED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTime;
    @Lob
    @Column(name = "SIGNED_TC")
    private String signedTc;
    @Column(name = "USERID")
    private String userid;
    @Column(name = "USERNAME")
    private String username;
    @JoinColumn(name = "DEVICE_ID", referencedColumnName = "ID")
    @ManyToOne
    private LvmtStDevice deviceId;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;
    @JoinColumn(name = "TOKEN", referencedColumnName = "TOKEN")
    @ManyToOne
    private LvmtSwtStToken token;

    public LvmtJpChallangeReqHistory() {
    }

    public LvmtJpChallangeReqHistory(String txnid) {
        this.txnid = txnid;
    }

    public String getTxnid() {
        return txnid;
    }

    public void setTxnid(String txnid) {
        this.txnid = txnid;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getJustpayCode() {
        return justpayCode;
    }

    public void setJustpayCode(String justpayCode) {
        this.justpayCode = justpayCode;
    }

    public String getChallengeId() {
        return challengeId;
    }

    public void setChallengeId(String challengeId) {
        this.challengeId = challengeId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getLpayDeviceId() {
        return lpayDeviceId;
    }

    public void setLpayDeviceId(String lpayDeviceId) {
        this.lpayDeviceId = lpayDeviceId;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public String getSignedTc() {
        return signedTc;
    }

    public void setSignedTc(String signedTc) {
        this.signedTc = signedTc;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LvmtStDevice getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(LvmtStDevice deviceId) {
        this.deviceId = deviceId;
    }

    public LvmtSwtMtStatus getStatus() {
        return status;
    }

    public void setStatus(LvmtSwtMtStatus status) {
        this.status = status;
    }

    public LvmtSwtStToken getToken() {
        return token;
    }

    public void setToken(LvmtSwtStToken token) {
        this.token = token;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (txnid != null ? txnid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtJpChallangeReqHistory)) {
            return false;
        }
        LvmtJpChallangeReqHistory other = (LvmtJpChallangeReqHistory) object;
        if ((this.txnid == null && other.txnid != null) || (this.txnid != null && !this.txnid.equals(other.txnid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtJpChallangeReqHistory[ txnid=" + txnid + " ]";
    }
    
}
