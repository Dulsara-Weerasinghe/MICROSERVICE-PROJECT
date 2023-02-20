/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
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
@Table(name = "LVMT_SWT_JUSTPAY_COMMISSION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtJustpayCommission.findAll", query = "SELECT l FROM LvmtSwtJustpayCommission l"),
    @NamedQuery(name = "LvmtSwtJustpayCommission.findById", query = "SELECT l FROM LvmtSwtJustpayCommission l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtSwtJustpayCommission.findByMethod", query = "SELECT l FROM LvmtSwtJustpayCommission l WHERE l.method = :method"),
    @NamedQuery(name = "LvmtSwtJustpayCommission.findByRangeStart", query = "SELECT l FROM LvmtSwtJustpayCommission l WHERE l.rangeStart = :rangeStart"),
    @NamedQuery(name = "LvmtSwtJustpayCommission.findByRangeEnd", query = "SELECT l FROM LvmtSwtJustpayCommission l WHERE l.rangeEnd = :rangeEnd"),
    @NamedQuery(name = "LvmtSwtJustpayCommission.findByStatus", query = "SELECT l FROM LvmtSwtJustpayCommission l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtSwtJustpayCommission.findByCreateDate", query = "SELECT l FROM LvmtSwtJustpayCommission l WHERE l.createDate = :createDate"),
    @NamedQuery(name = "LvmtSwtJustpayCommission.findByMerchantFee", query = "SELECT l FROM LvmtSwtJustpayCommission l WHERE l.merchantFee = :merchantFee"),
    @NamedQuery(name = "LvmtSwtJustpayCommission.findByCustomerFee", query = "SELECT l FROM LvmtSwtJustpayCommission l WHERE l.customerFee = :customerFee")})
public class LvmtSwtJustpayCommission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "METHOD")
    private String method;
    @Basic(optional = false)
    @Column(name = "RANGE_START")
    private String rangeStart;
    @Column(name = "RANGE_END")
    private String rangeEnd;
    @Column(name = "STATUS")
    private BigInteger status;
    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "MERCHANT_FEE")
    private String merchantFee;
    @Column(name = "CUSTOMER_FEE")
    private String customerFee;

    public LvmtSwtJustpayCommission() {
    }

    public LvmtSwtJustpayCommission(Integer id) {
        this.id = id;
    }

    public LvmtSwtJustpayCommission(Integer id, String method, String rangeStart) {
        this.id = id;
        this.method = method;
        this.rangeStart = rangeStart;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRangeStart() {
        return rangeStart;
    }

    public void setRangeStart(String rangeStart) {
        this.rangeStart = rangeStart;
    }

    public String getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(String rangeEnd) {
        this.rangeEnd = rangeEnd;
    }

    public BigInteger getStatus() {
        return status;
    }

    public void setStatus(BigInteger status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getMerchantFee() {
        return merchantFee;
    }

    public void setMerchantFee(String merchantFee) {
        this.merchantFee = merchantFee;
    }

    public String getCustomerFee() {
        return customerFee;
    }

    public void setCustomerFee(String customerFee) {
        this.customerFee = customerFee;
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
        if (!(object instanceof LvmtSwtJustpayCommission)) {
            return false;
        }
        LvmtSwtJustpayCommission other = (LvmtSwtJustpayCommission) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtJustpayCommission[ id=" + id + " ]";
    }
    
}
