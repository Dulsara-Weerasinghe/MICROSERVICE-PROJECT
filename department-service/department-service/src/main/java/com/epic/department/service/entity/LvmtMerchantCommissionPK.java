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
public class LvmtMerchantCommissionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MID")
    private String mid;
    @Basic(optional = false)
    @Column(name = "ACCOUNT_TYPE")
    private String accountType;
    @Basic(optional = false)
    @Column(name = "INSTITUTE")
    private String institute;
    @Basic(optional = false)
    @Column(name = "CHANNEL_TYPE")
    private String channelType;

    public LvmtMerchantCommissionPK() {
    }

    public LvmtMerchantCommissionPK(String mid, String accountType, String institute, String channelType) {
        this.mid = mid;
        this.accountType = accountType;
        this.institute = institute;
        this.channelType = channelType;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mid != null ? mid.hashCode() : 0);
        hash += (accountType != null ? accountType.hashCode() : 0);
        hash += (institute != null ? institute.hashCode() : 0);
        hash += (channelType != null ? channelType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtMerchantCommissionPK)) {
            return false;
        }
        LvmtMerchantCommissionPK other = (LvmtMerchantCommissionPK) object;
        if ((this.mid == null && other.mid != null) || (this.mid != null && !this.mid.equals(other.mid))) {
            return false;
        }
        if ((this.accountType == null && other.accountType != null) || (this.accountType != null && !this.accountType.equals(other.accountType))) {
            return false;
        }
        if ((this.institute == null && other.institute != null) || (this.institute != null && !this.institute.equals(other.institute))) {
            return false;
        }
        if ((this.channelType == null && other.channelType != null) || (this.channelType != null && !this.channelType.equals(other.channelType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtMerchantCommissionPK[ mid=" + mid + ", accountType=" + accountType + ", institute=" + institute + ", channelType=" + channelType + " ]";
    }
    
}
