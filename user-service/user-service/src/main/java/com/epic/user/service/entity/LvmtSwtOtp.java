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
import javax.persistence.JoinColumn;
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
@Table(name = "LVMT_SWT_OTP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtOtp.findAll", query = "SELECT l FROM LvmtSwtOtp l"),
    @NamedQuery(name = "LvmtSwtOtp.findById", query = "SELECT l FROM LvmtSwtOtp l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtSwtOtp.findByMobileNo", query = "SELECT l FROM LvmtSwtOtp l WHERE l.mobileNo = :mobileNo"),
    @NamedQuery(name = "LvmtSwtOtp.findByCreatedTime", query = "SELECT l FROM LvmtSwtOtp l WHERE l.createdTime = :createdTime"),
    @NamedQuery(name = "LvmtSwtOtp.findByOtp", query = "SELECT l FROM LvmtSwtOtp l WHERE l.otp = :otp"),
    @NamedQuery(name = "LvmtSwtOtp.findByLastUpdatedTime", query = "SELECT l FROM LvmtSwtOtp l WHERE l.lastUpdatedTime = :lastUpdatedTime")})
public class LvmtSwtOtp implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "MOBILE_NO")
    private String mobileNo;
    @Column(name = "CREATED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    @Column(name = "OTP")
    private BigInteger otp;
    @Column(name = "LAST_UPDATED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTime;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;

    public LvmtSwtOtp() {
    }

    public LvmtSwtOtp(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public BigInteger getOtp() {
        return otp;
    }

    public void setOtp(BigInteger otp) {
        this.otp = otp;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtOtp)) {
            return false;
        }
        LvmtSwtOtp other = (LvmtSwtOtp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtOtp[ id=" + id + " ]";
    }
    
}
