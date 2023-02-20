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
@Table(name = "LVMT_ST_DEVICE_HISTORY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtStDeviceHistory.findAll", query = "SELECT l FROM LvmtStDeviceHistory l"),
    @NamedQuery(name = "LvmtStDeviceHistory.findById", query = "SELECT l FROM LvmtStDeviceHistory l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtStDeviceHistory.findByOperation", query = "SELECT l FROM LvmtStDeviceHistory l WHERE l.operation = :operation"),
    @NamedQuery(name = "LvmtStDeviceHistory.findByDescription", query = "SELECT l FROM LvmtStDeviceHistory l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtStDeviceHistory.findByUuid", query = "SELECT l FROM LvmtStDeviceHistory l WHERE l.uuid = :uuid"),
    @NamedQuery(name = "LvmtStDeviceHistory.findByWalletId", query = "SELECT l FROM LvmtStDeviceHistory l WHERE l.walletId = :walletId"),
    @NamedQuery(name = "LvmtStDeviceHistory.findByDeviceId", query = "SELECT l FROM LvmtStDeviceHistory l WHERE l.deviceId = :deviceId"),
    @NamedQuery(name = "LvmtStDeviceHistory.findByModel", query = "SELECT l FROM LvmtStDeviceHistory l WHERE l.model = :model"),
    @NamedQuery(name = "LvmtStDeviceHistory.findByBrand", query = "SELECT l FROM LvmtStDeviceHistory l WHERE l.brand = :brand"),
    @NamedQuery(name = "LvmtStDeviceHistory.findByMobileNo", query = "SELECT l FROM LvmtStDeviceHistory l WHERE l.mobileNo = :mobileNo"),
    @NamedQuery(name = "LvmtStDeviceHistory.findByNic", query = "SELECT l FROM LvmtStDeviceHistory l WHERE l.nic = :nic"),
    @NamedQuery(name = "LvmtStDeviceHistory.findByName", query = "SELECT l FROM LvmtStDeviceHistory l WHERE l.name = :name"),
    @NamedQuery(name = "LvmtStDeviceHistory.findByCreateTime", query = "SELECT l FROM LvmtStDeviceHistory l WHERE l.createTime = :createTime")})
public class LvmtStDeviceHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "OPERATION")
    private String operation;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "UUID")
    private String uuid;
    @Column(name = "WALLET_ID")
    private String walletId;
    @Column(name = "DEVICE_ID")
    private BigInteger deviceId;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "BRAND")
    private String brand;
    @Column(name = "MOBILE_NO")
    private String mobileNo;
    @Column(name = "NIC")
    private String nic;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CREATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    public LvmtStDeviceHistory() {
    }

    public LvmtStDeviceHistory(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public BigInteger getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(BigInteger deviceId) {
        this.deviceId = deviceId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        if (!(object instanceof LvmtStDeviceHistory)) {
            return false;
        }
        LvmtStDeviceHistory other = (LvmtStDeviceHistory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtStDeviceHistory[ id=" + id + " ]";
    }
    
}
