/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

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
@Table(name = "LVMT_TERMINAL_REQUEST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtTerminalRequest.findAll", query = "SELECT l FROM LvmtTerminalRequest l"),
    @NamedQuery(name = "LvmtTerminalRequest.findById", query = "SELECT l FROM LvmtTerminalRequest l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtTerminalRequest.findByMid", query = "SELECT l FROM LvmtTerminalRequest l WHERE l.mid = :mid"),
    @NamedQuery(name = "LvmtTerminalRequest.findByMerchantcus", query = "SELECT l FROM LvmtTerminalRequest l WHERE l.merchantcus = :merchantcus"),
    @NamedQuery(name = "LvmtTerminalRequest.findByTerminalname", query = "SELECT l FROM LvmtTerminalRequest l WHERE l.terminalname = :terminalname"),
    @NamedQuery(name = "LvmtTerminalRequest.findByTerminalUser", query = "SELECT l FROM LvmtTerminalRequest l WHERE l.terminalUser = :terminalUser"),
    @NamedQuery(name = "LvmtTerminalRequest.findByMobileNo", query = "SELECT l FROM LvmtTerminalRequest l WHERE l.mobileNo = :mobileNo"),
    @NamedQuery(name = "LvmtTerminalRequest.findByLastupdateduser", query = "SELECT l FROM LvmtTerminalRequest l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtTerminalRequest.findByCreatedtime", query = "SELECT l FROM LvmtTerminalRequest l WHERE l.createdtime = :createdtime"),
    @NamedQuery(name = "LvmtTerminalRequest.findByLastupdatedtime", query = "SELECT l FROM LvmtTerminalRequest l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtTerminalRequest.findByApproveStatus", query = "SELECT l FROM LvmtTerminalRequest l WHERE l.approveStatus = :approveStatus"),
    @NamedQuery(name = "LvmtTerminalRequest.findByRemark", query = "SELECT l FROM LvmtTerminalRequest l WHERE l.remark = :remark")})
public class LvmtTerminalRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "MID")
    private String mid;
    @Column(name = "MERCHANTCUS")
    private String merchantcus;
    @Column(name = "TERMINALNAME")
    private String terminalname;
    @Column(name = "TERMINAL_USER")
    private String terminalUser;
    @Column(name = "MOBILE_NO")
    private String mobileNo;
    @Column(name = "LASTUPDATEDUSER")
    private String lastupdateduser;
    @Column(name = "CREATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdtime;
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Column(name = "APPROVE_STATUS")
    private BigInteger approveStatus;
    @Column(name = "REMARK")
    private String remark;
    @JoinColumn(name = "TER_TYPE", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtMerchantChannelType terType;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;

    public LvmtTerminalRequest() {
    }

    public LvmtTerminalRequest(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMerchantcus() {
        return merchantcus;
    }

    public void setMerchantcus(String merchantcus) {
        this.merchantcus = merchantcus;
    }

    public String getTerminalname() {
        return terminalname;
    }

    public void setTerminalname(String terminalname) {
        this.terminalname = terminalname;
    }

    public String getTerminalUser() {
        return terminalUser;
    }

    public void setTerminalUser(String terminalUser) {
        this.terminalUser = terminalUser;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getLastupdateduser() {
        return lastupdateduser;
    }

    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public BigInteger getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(BigInteger approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LvmtMerchantChannelType getTerType() {
        return terType;
    }

    public void setTerType(LvmtMerchantChannelType terType) {
        this.terType = terType;
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
        if (!(object instanceof LvmtTerminalRequest)) {
            return false;
        }
        LvmtTerminalRequest other = (LvmtTerminalRequest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtTerminalRequest[ id=" + id + " ]";
    }
    
}
