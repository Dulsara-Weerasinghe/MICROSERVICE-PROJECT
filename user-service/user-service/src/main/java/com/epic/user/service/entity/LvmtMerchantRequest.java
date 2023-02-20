/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
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
@Table(name = "LVMT_MERCHANT_REQUEST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtMerchantRequest.findAll", query = "SELECT l FROM LvmtMerchantRequest l"),
    @NamedQuery(name = "LvmtMerchantRequest.findByNic", query = "SELECT l FROM LvmtMerchantRequest l WHERE l.nic = :nic"),
    @NamedQuery(name = "LvmtMerchantRequest.findByName", query = "SELECT l FROM LvmtMerchantRequest l WHERE l.name = :name"),
    @NamedQuery(name = "LvmtMerchantRequest.findByAddress", query = "SELECT l FROM LvmtMerchantRequest l WHERE l.address = :address"),
    @NamedQuery(name = "LvmtMerchantRequest.findByMobileNo", query = "SELECT l FROM LvmtMerchantRequest l WHERE l.mobileNo = :mobileNo"),
    @NamedQuery(name = "LvmtMerchantRequest.findByApprovalStatus", query = "SELECT l FROM LvmtMerchantRequest l WHERE l.approvalStatus = :approvalStatus"),
    @NamedQuery(name = "LvmtMerchantRequest.findByDeviceId", query = "SELECT l FROM LvmtMerchantRequest l WHERE l.deviceId = :deviceId"),
    @NamedQuery(name = "LvmtMerchantRequest.findByCreatetime", query = "SELECT l FROM LvmtMerchantRequest l WHERE l.createtime = :createtime"),
    @NamedQuery(name = "LvmtMerchantRequest.findByRequestId", query = "SELECT l FROM LvmtMerchantRequest l WHERE l.requestId = :requestId"),
    @NamedQuery(name = "LvmtMerchantRequest.findByMcc", query = "SELECT l FROM LvmtMerchantRequest l WHERE l.mcc = :mcc"),
    @NamedQuery(name = "LvmtMerchantRequest.findByLegalName", query = "SELECT l FROM LvmtMerchantRequest l WHERE l.legalName = :legalName"),
    @NamedQuery(name = "LvmtMerchantRequest.findByAddressLineTwo", query = "SELECT l FROM LvmtMerchantRequest l WHERE l.addressLineTwo = :addressLineTwo"),
    @NamedQuery(name = "LvmtMerchantRequest.findByCity", query = "SELECT l FROM LvmtMerchantRequest l WHERE l.city = :city")})
public class LvmtMerchantRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "NIC")
    private String nic;
    @Column(name = "NAME")
    private String name;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "MOBILE_NO")
    private String mobileNo;
    @Column(name = "APPROVAL_STATUS")
    private Long approvalStatus;
    @Column(name = "DEVICE_ID")
    private Long deviceId;
    @Basic(optional = false)
    @Column(name = "CREATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    @Id
    @Basic(optional = false)
    @Column(name = "REQUEST_ID")
    private Long requestId;
    @Column(name = "MCC")
    private String mcc;
    @Column(name = "LEGAL_NAME")
    private String legalName;
    @Column(name = "ADDRESS_LINE_TWO")
    private String addressLineTwo;
    @Column(name = "CITY")
    private String city;

    public LvmtMerchantRequest() {
    }

    public LvmtMerchantRequest(Long requestId) {
        this.requestId = requestId;
    }

    public LvmtMerchantRequest(Long requestId, String nic, Date createtime) {
        this.requestId = requestId;
        this.nic = nic;
        this.createtime = createtime;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Long getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Long approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requestId != null ? requestId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtMerchantRequest)) {
            return false;
        }
        LvmtMerchantRequest other = (LvmtMerchantRequest) object;
        if ((this.requestId == null && other.requestId != null) || (this.requestId != null && !this.requestId.equals(other.requestId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtMerchantRequest[ requestId=" + requestId + " ]";
    }
    
}
