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
public class LvmtBillLimitPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PROVIDER_ID")
    private String providerId;
    @Basic(optional = false)
    @Column(name = "TXN_TYPE")
    private String txnType;

    public LvmtBillLimitPK() {
    }

    public LvmtBillLimitPK(String providerId, String txnType) {
        this.providerId = providerId;
        this.txnType = txnType;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getTxnType() {
        return txnType;
    }

    public void setTxnType(String txnType) {
        this.txnType = txnType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (providerId != null ? providerId.hashCode() : 0);
        hash += (txnType != null ? txnType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtBillLimitPK)) {
            return false;
        }
        LvmtBillLimitPK other = (LvmtBillLimitPK) object;
        if ((this.providerId == null && other.providerId != null) || (this.providerId != null && !this.providerId.equals(other.providerId))) {
            return false;
        }
        if ((this.txnType == null && other.txnType != null) || (this.txnType != null && !this.txnType.equals(other.txnType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtBillLimitPK[ providerId=" + providerId + ", txnType=" + txnType + " ]";
    }
    
}
