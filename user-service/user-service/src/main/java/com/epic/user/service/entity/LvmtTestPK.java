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
public class LvmtTestPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "DES")
    private String des;
    @Basic(optional = false)
    @Column(name = "DES2")
    private String des2;

    public LvmtTestPK() {
    }

    public LvmtTestPK(String id, String des, String des2) {
        this.id = id;
        this.des = des;
        this.des2 = des2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getDes2() {
        return des2;
    }

    public void setDes2(String des2) {
        this.des2 = des2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        hash += (des != null ? des.hashCode() : 0);
        hash += (des2 != null ? des2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtTestPK)) {
            return false;
        }
        LvmtTestPK other = (LvmtTestPK) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        if ((this.des == null && other.des != null) || (this.des != null && !this.des.equals(other.des))) {
            return false;
        }
        if ((this.des2 == null && other.des2 != null) || (this.des2 != null && !this.des2.equals(other.des2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtTestPK[ id=" + id + ", des=" + des + ", des2=" + des2 + " ]";
    }
    
}
