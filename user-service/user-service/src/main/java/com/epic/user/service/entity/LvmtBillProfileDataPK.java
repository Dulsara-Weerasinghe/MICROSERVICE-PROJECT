/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author randula_w
 */
@Embeddable
public class LvmtBillProfileDataPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PROFILE_ID")
    private BigInteger profileId;
    @Basic(optional = false)
    @Column(name = "FIELD_ID")
    private BigInteger fieldId;

    public LvmtBillProfileDataPK() {
    }

    public LvmtBillProfileDataPK(BigInteger profileId, BigInteger fieldId) {
        this.profileId = profileId;
        this.fieldId = fieldId;
    }

    public BigInteger getProfileId() {
        return profileId;
    }

    public void setProfileId(BigInteger profileId) {
        this.profileId = profileId;
    }

    public BigInteger getFieldId() {
        return fieldId;
    }

    public void setFieldId(BigInteger fieldId) {
        this.fieldId = fieldId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (profileId != null ? profileId.hashCode() : 0);
        hash += (fieldId != null ? fieldId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtBillProfileDataPK)) {
            return false;
        }
        LvmtBillProfileDataPK other = (LvmtBillProfileDataPK) object;
        if ((this.profileId == null && other.profileId != null) || (this.profileId != null && !this.profileId.equals(other.profileId))) {
            return false;
        }
        if ((this.fieldId == null && other.fieldId != null) || (this.fieldId != null && !this.fieldId.equals(other.fieldId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtBillProfileDataPK[ profileId=" + profileId + ", fieldId=" + fieldId + " ]";
    }
    
}
