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
public class LvmtWbSectionpage1PK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USERROLECODE")
    private String userrolecode;
    @Basic(optional = false)
    @Column(name = "SECTIONCODE")
    private String sectioncode;
    @Basic(optional = false)
    @Column(name = "PAGECODE")
    private String pagecode;

    public LvmtWbSectionpage1PK() {
    }

    public LvmtWbSectionpage1PK(String userrolecode, String sectioncode, String pagecode) {
        this.userrolecode = userrolecode;
        this.sectioncode = sectioncode;
        this.pagecode = pagecode;
    }

    public String getUserrolecode() {
        return userrolecode;
    }

    public void setUserrolecode(String userrolecode) {
        this.userrolecode = userrolecode;
    }

    public String getSectioncode() {
        return sectioncode;
    }

    public void setSectioncode(String sectioncode) {
        this.sectioncode = sectioncode;
    }

    public String getPagecode() {
        return pagecode;
    }

    public void setPagecode(String pagecode) {
        this.pagecode = pagecode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userrolecode != null ? userrolecode.hashCode() : 0);
        hash += (sectioncode != null ? sectioncode.hashCode() : 0);
        hash += (pagecode != null ? pagecode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtWbSectionpage1PK)) {
            return false;
        }
        LvmtWbSectionpage1PK other = (LvmtWbSectionpage1PK) object;
        if ((this.userrolecode == null && other.userrolecode != null) || (this.userrolecode != null && !this.userrolecode.equals(other.userrolecode))) {
            return false;
        }
        if ((this.sectioncode == null && other.sectioncode != null) || (this.sectioncode != null && !this.sectioncode.equals(other.sectioncode))) {
            return false;
        }
        if ((this.pagecode == null && other.pagecode != null) || (this.pagecode != null && !this.pagecode.equals(other.pagecode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbSectionpage1PK[ userrolecode=" + userrolecode + ", sectioncode=" + sectioncode + ", pagecode=" + pagecode + " ]";
    }
    
}
