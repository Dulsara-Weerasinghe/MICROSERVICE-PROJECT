/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author randula_w
 */
@Embeddable
public class LvmtFtPayeePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "DEVICE_ID")
    private long deviceId;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private long status;
    @Basic(optional = false)
    @Column(name = "ACC_NO")
    private String accNo;
    @Basic(optional = false)
    @Column(name = "BANK_CODE")
    private String bankCode;

    public LvmtFtPayeePK() {
    }

    public LvmtFtPayeePK(long deviceId, long status, String accNo, String bankCode) {
        this.deviceId = deviceId;
        this.status = status;
        this.accNo = accNo;
        this.bankCode = bankCode;
    }

    public long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) deviceId;
        hash += (int) status;
        hash += (accNo != null ? accNo.hashCode() : 0);
        hash += (bankCode != null ? bankCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtFtPayeePK)) {
            return false;
        }
        LvmtFtPayeePK other = (LvmtFtPayeePK) object;
        if (this.deviceId != other.deviceId) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if ((this.accNo == null && other.accNo != null) || (this.accNo != null && !this.accNo.equals(other.accNo))) {
            return false;
        }
        if ((this.bankCode == null && other.bankCode != null) || (this.bankCode != null && !this.bankCode.equals(other.bankCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtFtPayeePK[ deviceId=" + deviceId + ", status=" + status + ", accNo=" + accNo + ", bankCode=" + bankCode + " ]";
    }
    
}
