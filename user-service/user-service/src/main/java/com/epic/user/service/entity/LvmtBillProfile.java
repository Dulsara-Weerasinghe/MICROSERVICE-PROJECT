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
@Table(name = "LVMT_BILL_PROFILE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtBillProfile.findAll", query = "SELECT l FROM LvmtBillProfile l"),
    @NamedQuery(name = "LvmtBillProfile.findById", query = "SELECT l FROM LvmtBillProfile l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtBillProfile.findByBillerNickname", query = "SELECT l FROM LvmtBillProfile l WHERE l.billerNickname = :billerNickname"),
    @NamedQuery(name = "LvmtBillProfile.findByCreatedDateTime", query = "SELECT l FROM LvmtBillProfile l WHERE l.createdDateTime = :createdDateTime"),
    @NamedQuery(name = "LvmtBillProfile.findByLastUpdatedDateTime", query = "SELECT l FROM LvmtBillProfile l WHERE l.lastUpdatedDateTime = :lastUpdatedDateTime"),
    @NamedQuery(name = "LvmtBillProfile.findByFavouriteFlag", query = "SELECT l FROM LvmtBillProfile l WHERE l.favouriteFlag = :favouriteFlag"),
    @NamedQuery(name = "LvmtBillProfile.findByColumn1", query = "SELECT l FROM LvmtBillProfile l WHERE l.column1 = :column1")})
public class LvmtBillProfile implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "BILLER_NICKNAME")
    private String billerNickname;
    @Column(name = "CREATED_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;
    @Column(name = "LAST_UPDATED_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDateTime;
    @Column(name = "FAVOURITE_FLAG")
    private String favouriteFlag;
    @Column(name = "COLUMN1")
    private String column1;
    @JoinColumn(name = "SERVICE_PROVIDER_ID", referencedColumnName = "PROVIDER_ID")
    @ManyToOne(optional = false)
    private LvmtBillServiceProvider serviceProviderId;
    @JoinColumn(name = "DEVICE_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private LvmtStDevice deviceId;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private LvmtSwtMtStatus status;

    public LvmtBillProfile() {
    }

    public LvmtBillProfile(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getBillerNickname() {
        return billerNickname;
    }

    public void setBillerNickname(String billerNickname) {
        this.billerNickname = billerNickname;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public Date getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    public void setLastUpdatedDateTime(Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    public String getFavouriteFlag() {
        return favouriteFlag;
    }

    public void setFavouriteFlag(String favouriteFlag) {
        this.favouriteFlag = favouriteFlag;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public LvmtBillServiceProvider getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(LvmtBillServiceProvider serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtBillProfile)) {
            return false;
        }
        LvmtBillProfile other = (LvmtBillProfile) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtBillProfile[ id=" + id + " ]";
    }
    
}
