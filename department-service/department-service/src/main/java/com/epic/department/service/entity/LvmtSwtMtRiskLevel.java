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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_SWT_MT_RISK_LEVEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtMtRiskLevel.findAll", query = "SELECT l FROM LvmtSwtMtRiskLevel l"),
    @NamedQuery(name = "LvmtSwtMtRiskLevel.findByRiskCode", query = "SELECT l FROM LvmtSwtMtRiskLevel l WHERE l.riskCode = :riskCode"),
    @NamedQuery(name = "LvmtSwtMtRiskLevel.findByDescription", query = "SELECT l FROM LvmtSwtMtRiskLevel l WHERE l.description = :description")})
public class LvmtSwtMtRiskLevel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RISK_CODE")
    private Long riskCode;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;

    public LvmtSwtMtRiskLevel() {
    }

    public LvmtSwtMtRiskLevel(Long riskCode) {
        this.riskCode = riskCode;
    }

    public LvmtSwtMtRiskLevel(Long riskCode, String description) {
        this.riskCode = riskCode;
        this.description = description;
    }

    public Long getRiskCode() {
        return riskCode;
    }

    public void setRiskCode(Long riskCode) {
        this.riskCode = riskCode;
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
        hash += (riskCode != null ? riskCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtMtRiskLevel)) {
            return false;
        }
        LvmtSwtMtRiskLevel other = (LvmtSwtMtRiskLevel) object;
        if ((this.riskCode == null && other.riskCode != null) || (this.riskCode != null && !this.riskCode.equals(other.riskCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtMtRiskLevel[ riskCode=" + riskCode + " ]";
    }
    
}
