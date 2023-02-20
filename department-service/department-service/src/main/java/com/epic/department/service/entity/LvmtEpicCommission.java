/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "LVMT_EPIC_COMMISSION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtEpicCommission.findAll", query = "SELECT l FROM LvmtEpicCommission l"),
    @NamedQuery(name = "LvmtEpicCommission.findByCode", query = "SELECT l FROM LvmtEpicCommission l WHERE l.code = :code"),
    @NamedQuery(name = "LvmtEpicCommission.findByInitCommission", query = "SELECT l FROM LvmtEpicCommission l WHERE l.initCommission = :initCommission"),
    @NamedQuery(name = "LvmtEpicCommission.findByGovTax", query = "SELECT l FROM LvmtEpicCommission l WHERE l.govTax = :govTax"),
    @NamedQuery(name = "LvmtEpicCommission.findBySlab1", query = "SELECT l FROM LvmtEpicCommission l WHERE l.slab1 = :slab1"),
    @NamedQuery(name = "LvmtEpicCommission.findBySlab2", query = "SELECT l FROM LvmtEpicCommission l WHERE l.slab2 = :slab2"),
    @NamedQuery(name = "LvmtEpicCommission.findBySlab3", query = "SELECT l FROM LvmtEpicCommission l WHERE l.slab3 = :slab3"),
    @NamedQuery(name = "LvmtEpicCommission.findBySlab4", query = "SELECT l FROM LvmtEpicCommission l WHERE l.slab4 = :slab4")})
public class LvmtEpicCommission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODE")
    private String code;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "INIT_COMMISSION")
    private BigDecimal initCommission;
    @Column(name = "GOV_TAX")
    private BigDecimal govTax;
    @Column(name = "SLAB_1")
    private BigDecimal slab1;
    @Column(name = "SLAB_2")
    private BigDecimal slab2;
    @Column(name = "SLAB_3")
    private BigDecimal slab3;
    @Column(name = "SLAB_4")
    private BigDecimal slab4;

    public LvmtEpicCommission() {
    }

    public LvmtEpicCommission(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getInitCommission() {
        return initCommission;
    }

    public void setInitCommission(BigDecimal initCommission) {
        this.initCommission = initCommission;
    }

    public BigDecimal getGovTax() {
        return govTax;
    }

    public void setGovTax(BigDecimal govTax) {
        this.govTax = govTax;
    }

    public BigDecimal getSlab1() {
        return slab1;
    }

    public void setSlab1(BigDecimal slab1) {
        this.slab1 = slab1;
    }

    public BigDecimal getSlab2() {
        return slab2;
    }

    public void setSlab2(BigDecimal slab2) {
        this.slab2 = slab2;
    }

    public BigDecimal getSlab3() {
        return slab3;
    }

    public void setSlab3(BigDecimal slab3) {
        this.slab3 = slab3;
    }

    public BigDecimal getSlab4() {
        return slab4;
    }

    public void setSlab4(BigDecimal slab4) {
        this.slab4 = slab4;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtEpicCommission)) {
            return false;
        }
        LvmtEpicCommission other = (LvmtEpicCommission) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtEpicCommission[ code=" + code + " ]";
    }
    
}
