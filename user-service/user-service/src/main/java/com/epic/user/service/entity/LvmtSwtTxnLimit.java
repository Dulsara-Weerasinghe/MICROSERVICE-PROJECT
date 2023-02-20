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
@Table(name = "LVMT_SWT_TXN_LIMIT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtTxnLimit.findAll", query = "SELECT l FROM LvmtSwtTxnLimit l"),
    @NamedQuery(name = "LvmtSwtTxnLimit.findByTxntype", query = "SELECT l FROM LvmtSwtTxnLimit l WHERE l.txntype = :txntype"),
    @NamedQuery(name = "LvmtSwtTxnLimit.findByMinPertxnLimit", query = "SELECT l FROM LvmtSwtTxnLimit l WHERE l.minPertxnLimit = :minPertxnLimit"),
    @NamedQuery(name = "LvmtSwtTxnLimit.findByMaxPertxnLimit", query = "SELECT l FROM LvmtSwtTxnLimit l WHERE l.maxPertxnLimit = :maxPertxnLimit"),
    @NamedQuery(name = "LvmtSwtTxnLimit.findByMaximumDailyLimit", query = "SELECT l FROM LvmtSwtTxnLimit l WHERE l.maximumDailyLimit = :maximumDailyLimit"),
    @NamedQuery(name = "LvmtSwtTxnLimit.findByCreatedTime", query = "SELECT l FROM LvmtSwtTxnLimit l WHERE l.createdTime = :createdTime"),
    @NamedQuery(name = "LvmtSwtTxnLimit.findByLastUpdatedUser", query = "SELECT l FROM LvmtSwtTxnLimit l WHERE l.lastUpdatedUser = :lastUpdatedUser"),
    @NamedQuery(name = "LvmtSwtTxnLimit.findByLastUpdatedTime", query = "SELECT l FROM LvmtSwtTxnLimit l WHERE l.lastUpdatedTime = :lastUpdatedTime")})
public class LvmtSwtTxnLimit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TXNTYPE")
    private String txntype;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MIN_PERTXN_LIMIT")
    private BigDecimal minPertxnLimit;
    @Column(name = "MAX_PERTXN_LIMIT")
    private BigDecimal maxPertxnLimit;
    @Column(name = "MAXIMUM_DAILY_LIMIT")
    private BigDecimal maximumDailyLimit;
    @Column(name = "CREATED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    @Column(name = "LAST_UPDATED_USER")
    private String lastUpdatedUser;
    @Column(name = "LAST_UPDATED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTime;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;

    public LvmtSwtTxnLimit() {
    }

    public LvmtSwtTxnLimit(String txntype) {
        this.txntype = txntype;
    }

    public String getTxntype() {
        return txntype;
    }

    public void setTxntype(String txntype) {
        this.txntype = txntype;
    }

    public BigDecimal getMinPertxnLimit() {
        return minPertxnLimit;
    }

    public void setMinPertxnLimit(BigDecimal minPertxnLimit) {
        this.minPertxnLimit = minPertxnLimit;
    }

    public BigDecimal getMaxPertxnLimit() {
        return maxPertxnLimit;
    }

    public void setMaxPertxnLimit(BigDecimal maxPertxnLimit) {
        this.maxPertxnLimit = maxPertxnLimit;
    }

    public BigDecimal getMaximumDailyLimit() {
        return maximumDailyLimit;
    }

    public void setMaximumDailyLimit(BigDecimal maximumDailyLimit) {
        this.maximumDailyLimit = maximumDailyLimit;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getLastUpdatedUser() {
        return lastUpdatedUser;
    }

    public void setLastUpdatedUser(String lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
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
        hash += (txntype != null ? txntype.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtTxnLimit)) {
            return false;
        }
        LvmtSwtTxnLimit other = (LvmtSwtTxnLimit) object;
        if ((this.txntype == null && other.txntype != null) || (this.txntype != null && !this.txntype.equals(other.txntype))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtTxnLimit[ txntype=" + txntype + " ]";
    }
    
}
