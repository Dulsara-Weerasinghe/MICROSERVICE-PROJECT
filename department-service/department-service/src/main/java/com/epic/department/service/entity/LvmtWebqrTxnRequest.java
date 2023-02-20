/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "LVMT_WEBQR_TXN_REQUEST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWebqrTxnRequest.findAll", query = "SELECT l FROM LvmtWebqrTxnRequest l"),
    @NamedQuery(name = "LvmtWebqrTxnRequest.findById", query = "SELECT l FROM LvmtWebqrTxnRequest l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtWebqrTxnRequest.findByReferenceId", query = "SELECT l FROM LvmtWebqrTxnRequest l WHERE l.referenceId = :referenceId"),
    @NamedQuery(name = "LvmtWebqrTxnRequest.findByMid", query = "SELECT l FROM LvmtWebqrTxnRequest l WHERE l.mid = :mid"),
    @NamedQuery(name = "LvmtWebqrTxnRequest.findByTid", query = "SELECT l FROM LvmtWebqrTxnRequest l WHERE l.tid = :tid"),
    @NamedQuery(name = "LvmtWebqrTxnRequest.findByLqrString", query = "SELECT l FROM LvmtWebqrTxnRequest l WHERE l.lqrString = :lqrString"),
    @NamedQuery(name = "LvmtWebqrTxnRequest.findByAmount", query = "SELECT l FROM LvmtWebqrTxnRequest l WHERE l.amount = :amount"),
    @NamedQuery(name = "LvmtWebqrTxnRequest.findByCurrency", query = "SELECT l FROM LvmtWebqrTxnRequest l WHERE l.currency = :currency"),
    @NamedQuery(name = "LvmtWebqrTxnRequest.findByErrorUrl", query = "SELECT l FROM LvmtWebqrTxnRequest l WHERE l.errorUrl = :errorUrl"),
    @NamedQuery(name = "LvmtWebqrTxnRequest.findBySuccessUrl", query = "SELECT l FROM LvmtWebqrTxnRequest l WHERE l.successUrl = :successUrl"),
    @NamedQuery(name = "LvmtWebqrTxnRequest.findByReturnUrl", query = "SELECT l FROM LvmtWebqrTxnRequest l WHERE l.returnUrl = :returnUrl"),
    @NamedQuery(name = "LvmtWebqrTxnRequest.findByStatus", query = "SELECT l FROM LvmtWebqrTxnRequest l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtWebqrTxnRequest.findByApiCallStatus", query = "SELECT l FROM LvmtWebqrTxnRequest l WHERE l.apiCallStatus = :apiCallStatus"),
    @NamedQuery(name = "LvmtWebqrTxnRequest.findByCreatedTime", query = "SELECT l FROM LvmtWebqrTxnRequest l WHERE l.createdTime = :createdTime"),
    @NamedQuery(name = "LvmtWebqrTxnRequest.findByUpdatedTime", query = "SELECT l FROM LvmtWebqrTxnRequest l WHERE l.updatedTime = :updatedTime"),
    @NamedQuery(name = "LvmtWebqrTxnRequest.findByOrderId", query = "SELECT l FROM LvmtWebqrTxnRequest l WHERE l.orderId = :orderId")})
public class LvmtWebqrTxnRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "REFERENCE_ID")
    private String referenceId;
    @Column(name = "MID")
    private String mid;
    @Column(name = "TID")
    private String tid;
    @Column(name = "LQR_STRING")
    private String lqrString;
    @Column(name = "AMOUNT")
    private String amount;
    @Column(name = "CURRENCY")
    private String currency;
    @Column(name = "ERROR_URL")
    private String errorUrl;
    @Column(name = "SUCCESS_URL")
    private String successUrl;
    @Column(name = "RETURN_URL")
    private String returnUrl;
    @Column(name = "STATUS")
    private Long status;
    @Column(name = "API_CALL_STATUS")
    private Long apiCallStatus;
    @Column(name = "CREATED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    @Column(name = "UPDATED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTime;
    @Column(name = "ORDER_ID")
    private String orderId;

    public LvmtWebqrTxnRequest() {
    }

    public LvmtWebqrTxnRequest(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getLqrString() {
        return lqrString;
    }

    public void setLqrString(String lqrString) {
        this.lqrString = lqrString;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getErrorUrl() {
        return errorUrl;
    }

    public void setErrorUrl(String errorUrl) {
        this.errorUrl = errorUrl;
    }

    public String getSuccessUrl() {
        return successUrl;
    }

    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getApiCallStatus() {
        return apiCallStatus;
    }

    public void setApiCallStatus(Long apiCallStatus) {
        this.apiCallStatus = apiCallStatus;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
        if (!(object instanceof LvmtWebqrTxnRequest)) {
            return false;
        }
        LvmtWebqrTxnRequest other = (LvmtWebqrTxnRequest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWebqrTxnRequest[ id=" + id + " ]";
    }
    
}
