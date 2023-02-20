/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

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
@Table(name = "LVMT_JP_REQUESTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtJpRequests.findAll", query = "SELECT l FROM LvmtJpRequests l"),
    @NamedQuery(name = "LvmtJpRequests.findByTxnid", query = "SELECT l FROM LvmtJpRequests l WHERE l.txnid = :txnid"),
    @NamedQuery(name = "LvmtJpRequests.findByMobileNo", query = "SELECT l FROM LvmtJpRequests l WHERE l.mobileNo = :mobileNo"),
    @NamedQuery(name = "LvmtJpRequests.findByEmail", query = "SELECT l FROM LvmtJpRequests l WHERE l.email = :email"),
    @NamedQuery(name = "LvmtJpRequests.findByPlatform", query = "SELECT l FROM LvmtJpRequests l WHERE l.platform = :platform"),
    @NamedQuery(name = "LvmtJpRequests.findByJustpayCode", query = "SELECT l FROM LvmtJpRequests l WHERE l.justpayCode = :justpayCode"),
    @NamedQuery(name = "LvmtJpRequests.findByChallengeId", query = "SELECT l FROM LvmtJpRequests l WHERE l.challengeId = :challengeId"),
    @NamedQuery(name = "LvmtJpRequests.findByCreatedTime", query = "SELECT l FROM LvmtJpRequests l WHERE l.createdTime = :createdTime"),
    @NamedQuery(name = "LvmtJpRequests.findByLpayDeviceId", query = "SELECT l FROM LvmtJpRequests l WHERE l.lpayDeviceId = :lpayDeviceId"),
    @NamedQuery(name = "LvmtJpRequests.findByLastUpdatedTime", query = "SELECT l FROM LvmtJpRequests l WHERE l.lastUpdatedTime = :lastUpdatedTime"),
    @NamedQuery(name = "LvmtJpRequests.findByToken", query = "SELECT l FROM LvmtJpRequests l WHERE l.token = :token"),
    @NamedQuery(name = "LvmtJpRequests.findByUserid", query = "SELECT l FROM LvmtJpRequests l WHERE l.userid = :userid"),
    @NamedQuery(name = "LvmtJpRequests.findByUsername", query = "SELECT l FROM LvmtJpRequests l WHERE l.username = :username")})
public class LvmtJpRequests implements Serializable {

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
    @Column(name = "TOKEN")
    private String token;
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

    public LvmtJpRequests() {
    }

    public LvmtJpRequests(String txnid) {
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (txnid != null ? txnid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtJpRequests)) {
            return false;
        }
        LvmtJpRequests other = (LvmtJpRequests) object;
        if ((this.txnid == null && other.txnid != null) || (this.txnid != null && !this.txnid.equals(other.txnid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtJpRequests[ txnid=" + txnid + " ]";
    }
    
}
