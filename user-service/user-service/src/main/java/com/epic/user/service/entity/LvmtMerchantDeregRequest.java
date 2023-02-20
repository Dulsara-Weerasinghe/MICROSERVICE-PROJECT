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
@Table(name = "LVMT_MERCHANT_DEREG_REQUEST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtMerchantDeregRequest.findAll", query = "SELECT l FROM LvmtMerchantDeregRequest l"),
    @NamedQuery(name = "LvmtMerchantDeregRequest.findByRequestId", query = "SELECT l FROM LvmtMerchantDeregRequest l WHERE l.requestId = :requestId"),
    @NamedQuery(name = "LvmtMerchantDeregRequest.findByNic", query = "SELECT l FROM LvmtMerchantDeregRequest l WHERE l.nic = :nic"),
    @NamedQuery(name = "LvmtMerchantDeregRequest.findByName", query = "SELECT l FROM LvmtMerchantDeregRequest l WHERE l.name = :name"),
    @NamedQuery(name = "LvmtMerchantDeregRequest.findByMid", query = "SELECT l FROM LvmtMerchantDeregRequest l WHERE l.mid = :mid"),
    @NamedQuery(name = "LvmtMerchantDeregRequest.findByMobileNo", query = "SELECT l FROM LvmtMerchantDeregRequest l WHERE l.mobileNo = :mobileNo"),
    @NamedQuery(name = "LvmtMerchantDeregRequest.findByApprovalStatus", query = "SELECT l FROM LvmtMerchantDeregRequest l WHERE l.approvalStatus = :approvalStatus"),
    @NamedQuery(name = "LvmtMerchantDeregRequest.findByDeviceId", query = "SELECT l FROM LvmtMerchantDeregRequest l WHERE l.deviceId = :deviceId"),
    @NamedQuery(name = "LvmtMerchantDeregRequest.findByBranch", query = "SELECT l FROM LvmtMerchantDeregRequest l WHERE l.branch = :branch"),
    @NamedQuery(name = "LvmtMerchantDeregRequest.findByAddress", query = "SELECT l FROM LvmtMerchantDeregRequest l WHERE l.address = :address"),
    @NamedQuery(name = "LvmtMerchantDeregRequest.findByCreatetime", query = "SELECT l FROM LvmtMerchantDeregRequest l WHERE l.createtime = :createtime")})
public class LvmtMerchantDeregRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "REQUEST_ID")
    private Long requestId;
    @Column(name = "NIC")
    private String nic;
    @Column(name = "NAME")
    private String name;
    @Column(name = "MID")
    private String mid;
    @Column(name = "MOBILE_NO")
    private String mobileNo;
    @Column(name = "APPROVAL_STATUS")
    private Long approvalStatus;
    @Basic(optional = false)
    @Column(name = "DEVICE_ID")
    private long deviceId;
    @Column(name = "BRANCH")
    private String branch;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CREATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;

    public LvmtMerchantDeregRequest() {
    }

    public LvmtMerchantDeregRequest(Long requestId) {
        this.requestId = requestId;
    }

    public LvmtMerchantDeregRequest(Long requestId, long deviceId) {
        this.requestId = requestId;
        this.deviceId = deviceId;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
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

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
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

    public long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
        if (!(object instanceof LvmtMerchantDeregRequest)) {
            return false;
        }
        LvmtMerchantDeregRequest other = (LvmtMerchantDeregRequest) object;
        if ((this.requestId == null && other.requestId != null) || (this.requestId != null && !this.requestId.equals(other.requestId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtMerchantDeregRequest[ requestId=" + requestId + " ]";
    }
    
}
