/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "LVMT_PRODUCT_RULE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtProductRule.findAll", query = "SELECT l FROM LvmtProductRule l"),
    @NamedQuery(name = "LvmtProductRule.findByCode", query = "SELECT l FROM LvmtProductRule l WHERE l.lvmtProductRulePK.code = :code"),
    @NamedQuery(name = "LvmtProductRule.findByName", query = "SELECT l FROM LvmtProductRule l WHERE l.name = :name"),
    @NamedQuery(name = "LvmtProductRule.findByCreatedtime", query = "SELECT l FROM LvmtProductRule l WHERE l.createdtime = :createdtime"),
    @NamedQuery(name = "LvmtProductRule.findByLastupdatedtime", query = "SELECT l FROM LvmtProductRule l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtProductRule.findByLastupdateduser", query = "SELECT l FROM LvmtProductRule l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtProductRule.findByCategory", query = "SELECT l FROM LvmtProductRule l WHERE l.lvmtProductRulePK.category = :category")})
public class LvmtProductRule implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LvmtProductRulePK lvmtProductRulePK;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "CREATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdtime;
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Column(name = "LASTUPDATEDUSER")
    private String lastupdateduser;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;

    public LvmtProductRule() {
    }

    public LvmtProductRule(LvmtProductRulePK lvmtProductRulePK) {
        this.lvmtProductRulePK = lvmtProductRulePK;
    }

    public LvmtProductRule(LvmtProductRulePK lvmtProductRulePK, String name) {
        this.lvmtProductRulePK = lvmtProductRulePK;
        this.name = name;
    }

    public LvmtProductRule(String code, String category) {
        this.lvmtProductRulePK = new LvmtProductRulePK(code, category);
    }

    public LvmtProductRulePK getLvmtProductRulePK() {
        return lvmtProductRulePK;
    }

    public void setLvmtProductRulePK(LvmtProductRulePK lvmtProductRulePK) {
        this.lvmtProductRulePK = lvmtProductRulePK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getLastupdateduser() {
        return lastupdateduser;
    }

    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
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
        hash += (lvmtProductRulePK != null ? lvmtProductRulePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtProductRule)) {
            return false;
        }
        LvmtProductRule other = (LvmtProductRule) object;
        if ((this.lvmtProductRulePK == null && other.lvmtProductRulePK != null) || (this.lvmtProductRulePK != null && !this.lvmtProductRulePK.equals(other.lvmtProductRulePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtProductRule[ lvmtProductRulePK=" + lvmtProductRulePK + " ]";
    }
    
}
