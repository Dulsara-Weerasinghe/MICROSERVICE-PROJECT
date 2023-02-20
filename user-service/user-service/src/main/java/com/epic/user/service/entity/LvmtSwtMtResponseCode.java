/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name = "LVMT_SWT_MT_RESPONSE_CODE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtMtResponseCode.findAll", query = "SELECT l FROM LvmtSwtMtResponseCode l"),
    @NamedQuery(name = "LvmtSwtMtResponseCode.findByCode", query = "SELECT l FROM LvmtSwtMtResponseCode l WHERE l.lvmtSwtMtResponseCodePK.code = :code"),
    @NamedQuery(name = "LvmtSwtMtResponseCode.findByDescription", query = "SELECT l FROM LvmtSwtMtResponseCode l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtSwtMtResponseCode.findByCategory", query = "SELECT l FROM LvmtSwtMtResponseCode l WHERE l.lvmtSwtMtResponseCodePK.category = :category")})
public class LvmtSwtMtResponseCode implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LvmtSwtMtResponseCodePK lvmtSwtMtResponseCodePK;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @JoinColumn(name = "CATEGORY", referencedColumnName = "CODE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private LvmtSwtStResCodeCategory lvmtSwtStResCodeCategory;

    public LvmtSwtMtResponseCode() {
    }

    public LvmtSwtMtResponseCode(LvmtSwtMtResponseCodePK lvmtSwtMtResponseCodePK) {
        this.lvmtSwtMtResponseCodePK = lvmtSwtMtResponseCodePK;
    }

    public LvmtSwtMtResponseCode(LvmtSwtMtResponseCodePK lvmtSwtMtResponseCodePK, String description) {
        this.lvmtSwtMtResponseCodePK = lvmtSwtMtResponseCodePK;
        this.description = description;
    }

    public LvmtSwtMtResponseCode(String code, String category) {
        this.lvmtSwtMtResponseCodePK = new LvmtSwtMtResponseCodePK(code, category);
    }

    public LvmtSwtMtResponseCodePK getLvmtSwtMtResponseCodePK() {
        return lvmtSwtMtResponseCodePK;
    }

    public void setLvmtSwtMtResponseCodePK(LvmtSwtMtResponseCodePK lvmtSwtMtResponseCodePK) {
        this.lvmtSwtMtResponseCodePK = lvmtSwtMtResponseCodePK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LvmtSwtStResCodeCategory getLvmtSwtStResCodeCategory() {
        return lvmtSwtStResCodeCategory;
    }

    public void setLvmtSwtStResCodeCategory(LvmtSwtStResCodeCategory lvmtSwtStResCodeCategory) {
        this.lvmtSwtStResCodeCategory = lvmtSwtStResCodeCategory;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lvmtSwtMtResponseCodePK != null ? lvmtSwtMtResponseCodePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtMtResponseCode)) {
            return false;
        }
        LvmtSwtMtResponseCode other = (LvmtSwtMtResponseCode) object;
        if ((this.lvmtSwtMtResponseCodePK == null && other.lvmtSwtMtResponseCodePK != null) || (this.lvmtSwtMtResponseCodePK != null && !this.lvmtSwtMtResponseCodePK.equals(other.lvmtSwtMtResponseCodePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtMtResponseCode[ lvmtSwtMtResponseCodePK=" + lvmtSwtMtResponseCodePK + " ]";
    }
    
}
