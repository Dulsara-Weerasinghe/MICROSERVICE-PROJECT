/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "LVMT_BILL_CATEGORY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtBillCategory.findAll", query = "SELECT l FROM LvmtBillCategory l"),
    @NamedQuery(name = "LvmtBillCategory.findByCategoryCode", query = "SELECT l FROM LvmtBillCategory l WHERE l.categoryCode = :categoryCode"),
    @NamedQuery(name = "LvmtBillCategory.findByCategoryName", query = "SELECT l FROM LvmtBillCategory l WHERE l.categoryName = :categoryName"),
    @NamedQuery(name = "LvmtBillCategory.findByCategoryDescription", query = "SELECT l FROM LvmtBillCategory l WHERE l.categoryDescription = :categoryDescription"),
    @NamedQuery(name = "LvmtBillCategory.findByCreatedtime", query = "SELECT l FROM LvmtBillCategory l WHERE l.createdtime = :createdtime"),
    @NamedQuery(name = "LvmtBillCategory.findByLastupdatedtime", query = "SELECT l FROM LvmtBillCategory l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtBillCategory.findBySortOrder", query = "SELECT l FROM LvmtBillCategory l WHERE l.sortOrder = :sortOrder")})
public class LvmtBillCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CATEGORY_CODE")
    private String categoryCode;
    @Column(name = "CATEGORY_NAME")
    private String categoryName;
    @Column(name = "CATEGORY_DESCRIPTION")
    private String categoryDescription;
    @Column(name = "CREATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdtime;
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Column(name = "SORT_ORDER")
    private BigInteger sortOrder;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;

    public LvmtBillCategory() {
    }

    public LvmtBillCategory(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public BigInteger getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(BigInteger sortOrder) {
        this.sortOrder = sortOrder;
    }

    public LvmtSwtMtStatus getStatus() {
        return status;
    }

    public void setStatus(LvmtSwtMtStatus status) {
        this.status = status;
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
        if (!(object instanceof LvmtBillCategory)) {
            return false;
        }
        LvmtBillCategory other = (LvmtBillCategory) object;
        if ((this.categoryCode == null && other.categoryCode != null) || (this.categoryCode != null && !this.categoryCode.equals(other.categoryCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtBillCategory[ categoryCode=" + categoryCode + " ]";
    }
    
}
