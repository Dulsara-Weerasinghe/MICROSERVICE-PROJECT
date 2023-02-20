/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author randula_w
 */
@Embeddable
public class LvmtMerchantPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MID")
    private String mid;
    @Basic(optional = false)
    @Column(name = "INSTITUTE")
    private String institute;

    public LvmtMerchantPK() {
    }

    public LvmtMerchantPK(String mid, String institute) {
        this.mid = mid;
        this.institute = institute;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mid != null ? mid.hashCode() : 0);
        hash += (institute != null ? institute.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtMerchantPK)) {
            return false;
        }
        LvmtMerchantPK other = (LvmtMerchantPK) object;
        if ((this.mid == null && other.mid != null) || (this.mid != null && !this.mid.equals(other.mid))) {
            return false;
        }
        if ((this.institute == null && other.institute != null) || (this.institute != null && !this.institute.equals(other.institute))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtMerchantPK[ mid=" + mid + ", institute=" + institute + " ]";
    }
    
}
