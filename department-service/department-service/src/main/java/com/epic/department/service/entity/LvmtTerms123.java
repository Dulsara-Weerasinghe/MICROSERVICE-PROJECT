/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_TERMS123")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtTerms123.findAll", query = "SELECT l FROM LvmtTerms123 l"),
    @NamedQuery(name = "LvmtTerms123.findByVersionNo", query = "SELECT l FROM LvmtTerms123 l WHERE l.versionNo = :versionNo"),
    @NamedQuery(name = "LvmtTerms123.findByCategory", query = "SELECT l FROM LvmtTerms123 l WHERE l.category = :category")})
public class LvmtTerms123 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "TERMS")
    private String terms;
    @Id
    @Basic(optional = false)
    @Column(name = "VERSION_NO")
    private String versionNo;
    @Column(name = "CATEGORY")
    private String category;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;

    public LvmtTerms123() {
    }

    public LvmtTerms123(String versionNo) {
        this.versionNo = versionNo;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
        hash += (versionNo != null ? versionNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtTerms123)) {
            return false;
        }
        LvmtTerms123 other = (LvmtTerms123) object;
        if ((this.versionNo == null && other.versionNo != null) || (this.versionNo != null && !this.versionNo.equals(other.versionNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtTerms123[ versionNo=" + versionNo + " ]";
    }
    
}
