/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_SWT_MT_STATUS_CATEGORY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtMtStatusCategory.findAll", query = "SELECT l FROM LvmtSwtMtStatusCategory l"),
    @NamedQuery(name = "LvmtSwtMtStatusCategory.findByCategoryCode", query = "SELECT l FROM LvmtSwtMtStatusCategory l WHERE l.categoryCode = :categoryCode"),
    @NamedQuery(name = "LvmtSwtMtStatusCategory.findByDescription", query = "SELECT l FROM LvmtSwtMtStatusCategory l WHERE l.description = :description")})
public class LvmtSwtMtStatusCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CATEGORY_CODE")
    private Long categoryCode;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;

    public LvmtSwtMtStatusCategory() {
    }

    public LvmtSwtMtStatusCategory(Long categoryCode) {
        this.categoryCode = categoryCode;
    }

    public LvmtSwtMtStatusCategory(Long categoryCode, String description) {
        this.categoryCode = categoryCode;
        this.description = description;
    }

    public Long getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(Long categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoryCode != null ? categoryCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtMtStatusCategory)) {
            return false;
        }
        LvmtSwtMtStatusCategory other = (LvmtSwtMtStatusCategory) object;
        if ((this.categoryCode == null && other.categoryCode != null) || (this.categoryCode != null && !this.categoryCode.equals(other.categoryCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtMtStatusCategory[ categoryCode=" + categoryCode + " ]";
    }
    
}
