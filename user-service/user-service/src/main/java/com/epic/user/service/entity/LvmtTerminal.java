/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "LVMT_TERMINAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtTerminal.findAll", query = "SELECT l FROM LvmtTerminal l"),
    @NamedQuery(name = "LvmtTerminal.findByTid", query = "SELECT l FROM LvmtTerminal l WHERE l.tid = :tid"),
    @NamedQuery(name = "LvmtTerminal.findByTerminalname", query = "SELECT l FROM LvmtTerminal l WHERE l.terminalname = :terminalname"),
    @NamedQuery(name = "LvmtTerminal.findByCreatedtime", query = "SELECT l FROM LvmtTerminal l WHERE l.createdtime = :createdtime"),
    @NamedQuery(name = "LvmtTerminal.findByLastupdatedtime", query = "SELECT l FROM LvmtTerminal l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtTerminal.findByLastupdateduser", query = "SELECT l FROM LvmtTerminal l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtTerminal.findByMobileNo", query = "SELECT l FROM LvmtTerminal l WHERE l.mobileNo = :mobileNo"),
    @NamedQuery(name = "LvmtTerminal.findByTerminalUser", query = "SELECT l FROM LvmtTerminal l WHERE l.terminalUser = :terminalUser"),
    @NamedQuery(name = "LvmtTerminal.findByDeviceId", query = "SELECT l FROM LvmtTerminal l WHERE l.deviceId = :deviceId")})
public class LvmtTerminal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TID")
    private String tid;
    @Column(name = "TERMINALNAME")
    private String terminalname;
    @Column(name = "CREATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdtime;
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Basic(optional = false)
    @Column(name = "LASTUPDATEDUSER")
    private String lastupdateduser;
    @Column(name = "MOBILE_NO")
    private String mobileNo;
    @Column(name = "TERMINAL_USER")
    private String terminalUser;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DEVICE_ID")
    private BigDecimal deviceId;
    @Lob
    @Column(name = "QR_CODE_BLOB")
    private Serializable qrCodeBlob;
    @JoinColumns({
        @JoinColumn(name = "MID", referencedColumnName = "MID"),
        @JoinColumn(name = "INSTITUTE", referencedColumnName = "INSTITUTE")})
    @ManyToOne
    private LvmtMerchant lvmtMerchant;
    @JoinColumn(name = "TER_TYPE", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtMerchantChannelType terType;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;

    public LvmtTerminal() {
    }

    public LvmtTerminal(String tid) {
        this.tid = tid;
    }

    public LvmtTerminal(String tid, String lastupdateduser) {
        this.tid = tid;
        this.lastupdateduser = lastupdateduser;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTerminalname() {
        return terminalname;
    }

    public void setTerminalname(String terminalname) {
        this.terminalname = terminalname;
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

    public String getLastupdateduser() {
        return lastupdateduser;
    }

    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getTerminalUser() {
        return terminalUser;
    }

    public void setTerminalUser(String terminalUser) {
        this.terminalUser = terminalUser;
    }

    public BigDecimal getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(BigDecimal deviceId) {
        this.deviceId = deviceId;
    }

    public Serializable getQrCodeBlob() {
        return qrCodeBlob;
    }

    public void setQrCodeBlob(Serializable qrCodeBlob) {
        this.qrCodeBlob = qrCodeBlob;
    }

    public LvmtMerchant getLvmtMerchant() {
        return lvmtMerchant;
    }

    public void setLvmtMerchant(LvmtMerchant lvmtMerchant) {
        this.lvmtMerchant = lvmtMerchant;
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
        hash += (tid != null ? tid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtTerminal)) {
            return false;
        }
        LvmtTerminal other = (LvmtTerminal) object;
        if ((this.tid == null && other.tid != null) || (this.tid != null && !this.tid.equals(other.tid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtTerminal[ tid=" + tid + " ]";
    }
    
}
