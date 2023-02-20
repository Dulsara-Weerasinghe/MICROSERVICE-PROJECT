/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_ST_DEVICE_CARD_ACC_INF")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtStDeviceCardAccInf.findAll", query = "SELECT l FROM LvmtStDeviceCardAccInf l"),
    @NamedQuery(name = "LvmtStDeviceCardAccInf.findById", query = "SELECT l FROM LvmtStDeviceCardAccInf l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtStDeviceCardAccInf.findByType", query = "SELECT l FROM LvmtStDeviceCardAccInf l WHERE l.type = :type"),
    @NamedQuery(name = "LvmtStDeviceCardAccInf.findByCardNo", query = "SELECT l FROM LvmtStDeviceCardAccInf l WHERE l.cardNo = :cardNo"),
    @NamedQuery(name = "LvmtStDeviceCardAccInf.findByExpiaryDate", query = "SELECT l FROM LvmtStDeviceCardAccInf l WHERE l.expiaryDate = :expiaryDate"),
    @NamedQuery(name = "LvmtStDeviceCardAccInf.findByBankCode", query = "SELECT l FROM LvmtStDeviceCardAccInf l WHERE l.bankCode = :bankCode"),
    @NamedQuery(name = "LvmtStDeviceCardAccInf.findByStatus", query = "SELECT l FROM LvmtStDeviceCardAccInf l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtStDeviceCardAccInf.findByProduct", query = "SELECT l FROM LvmtStDeviceCardAccInf l WHERE l.product = :product"),
    @NamedQuery(name = "LvmtStDeviceCardAccInf.findByMaskingNo", query = "SELECT l FROM LvmtStDeviceCardAccInf l WHERE l.maskingNo = :maskingNo"),
    @NamedQuery(name = "LvmtStDeviceCardAccInf.findByCurrency", query = "SELECT l FROM LvmtStDeviceCardAccInf l WHERE l.currency = :currency"),
    @NamedQuery(name = "LvmtStDeviceCardAccInf.findByAccountNo", query = "SELECT l FROM LvmtStDeviceCardAccInf l WHERE l.accountNo = :accountNo"),
    @NamedQuery(name = "LvmtStDeviceCardAccInf.findByInstituteId", query = "SELECT l FROM LvmtStDeviceCardAccInf l WHERE l.instituteId = :instituteId"),
    @NamedQuery(name = "LvmtStDeviceCardAccInf.findByToken", query = "SELECT l FROM LvmtStDeviceCardAccInf l WHERE l.token = :token"),
    @NamedQuery(name = "LvmtStDeviceCardAccInf.findByDeviceId", query = "SELECT l FROM LvmtStDeviceCardAccInf l WHERE l.deviceId = :deviceId")})
public class LvmtStDeviceCardAccInf implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "TYPE")
    private long type;
    @Basic(optional = false)
    @Column(name = "CARD_NO")
    private String cardNo;
    @Column(name = "EXPIARY_DATE")
    private String expiaryDate;
    @Basic(optional = false)
    @Column(name = "BANK_CODE")
    private String bankCode;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private long status;
    @Column(name = "PRODUCT")
    private Long product;
    @Column(name = "MASKING_NO")
    private String maskingNo;
    @Basic(optional = false)
    @Column(name = "CURRENCY")
    private String currency;
    @Column(name = "ACCOUNT_NO")
    private String accountNo;
    @Basic(optional = false)
    @Column(name = "INSTITUTE_ID")
    private String instituteId;
    @Basic(optional = false)
    @Column(name = "TOKEN")
    private String token;
    @Column(name = "DEVICE_ID")
    private Long deviceId;

    public LvmtStDeviceCardAccInf() {
    }

    public LvmtStDeviceCardAccInf(Long id) {
        this.id = id;
    }

    public LvmtStDeviceCardAccInf(Long id, long type, String cardNo, String bankCode, long status, String currency, String instituteId, String token) {
        this.id = id;
        this.type = type;
        this.cardNo = cardNo;
        this.bankCode = bankCode;
        this.status = status;
        this.currency = currency;
        this.instituteId = instituteId;
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getExpiaryDate() {
        return expiaryDate;
    }

    public void setExpiaryDate(String expiaryDate) {
        this.expiaryDate = expiaryDate;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    public String getMaskingNo() {
        return maskingNo;
    }

    public void setMaskingNo(String maskingNo) {
        this.maskingNo = maskingNo;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(String instituteId) {
        this.instituteId = instituteId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
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
        if (!(object instanceof LvmtStDeviceCardAccInf)) {
            return false;
        }
        LvmtStDeviceCardAccInf other = (LvmtStDeviceCardAccInf) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtStDeviceCardAccInf[ id=" + id + " ]";
    }
    
}
