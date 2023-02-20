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
@Table(name = "LVMT_SWT_ST_NOTIFICATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtStNotification.findAll", query = "SELECT l FROM LvmtSwtStNotification l"),
    @NamedQuery(name = "LvmtSwtStNotification.findById", query = "SELECT l FROM LvmtSwtStNotification l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtSwtStNotification.findByReference", query = "SELECT l FROM LvmtSwtStNotification l WHERE l.reference = :reference"),
    @NamedQuery(name = "LvmtSwtStNotification.findByCustomerName", query = "SELECT l FROM LvmtSwtStNotification l WHERE l.customerName = :customerName"),
    @NamedQuery(name = "LvmtSwtStNotification.findByAmount", query = "SELECT l FROM LvmtSwtStNotification l WHERE l.amount = :amount"),
    @NamedQuery(name = "LvmtSwtStNotification.findBySubTitle", query = "SELECT l FROM LvmtSwtStNotification l WHERE l.subTitle = :subTitle"),
    @NamedQuery(name = "LvmtSwtStNotification.findByTxnTime", query = "SELECT l FROM LvmtSwtStNotification l WHERE l.txnTime = :txnTime"),
    @NamedQuery(name = "LvmtSwtStNotification.findByExpireTime", query = "SELECT l FROM LvmtSwtStNotification l WHERE l.expireTime = :expireTime"),
    @NamedQuery(name = "LvmtSwtStNotification.findByTxnId", query = "SELECT l FROM LvmtSwtStNotification l WHERE l.txnId = :txnId"),
    @NamedQuery(name = "LvmtSwtStNotification.findByInitiateType", query = "SELECT l FROM LvmtSwtStNotification l WHERE l.initiateType = :initiateType"),
    @NamedQuery(name = "LvmtSwtStNotification.findByMid", query = "SELECT l FROM LvmtSwtStNotification l WHERE l.mid = :mid"),
    @NamedQuery(name = "LvmtSwtStNotification.findByTitle", query = "SELECT l FROM LvmtSwtStNotification l WHERE l.title = :title")})
public class LvmtSwtStNotification implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "REFERENCE")
    private String reference;
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Column(name = "AMOUNT")
    private BigInteger amount;
    @Basic(optional = false)
    @Column(name = "SUB_TITLE")
    private String subTitle;
    @Column(name = "TXN_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txnTime;
    @Column(name = "EXPIRE_TIME")
    private BigInteger expireTime;
    @Column(name = "TXN_ID")
    private String txnId;
    @Basic(optional = false)
    @Column(name = "INITIATE_TYPE")
    private int initiateType;
    @Column(name = "MID")
    private String mid;
    @Column(name = "TITLE")
    private String title;

    public LvmtSwtStNotification() {
    }

    public LvmtSwtStNotification(BigDecimal id) {
        this.id = id;
    }

    public LvmtSwtStNotification(BigDecimal id, String reference, String subTitle, int initiateType) {
        this.id = id;
        this.reference = reference;
        this.subTitle = subTitle;
        this.initiateType = initiateType;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Date getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(Date txnTime) {
        this.txnTime = txnTime;
    }

    public BigInteger getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(BigInteger expireTime) {
        this.expireTime = expireTime;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public int getInitiateType() {
        return initiateType;
    }

    public void setInitiateType(int initiateType) {
        this.initiateType = initiateType;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        if (!(object instanceof LvmtSwtStNotification)) {
            return false;
        }
        LvmtSwtStNotification other = (LvmtSwtStNotification) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtStNotification[ id=" + id + " ]";
    }
    
}
