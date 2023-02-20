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
@Table(name = "LVMT_EPIC_COMMISSION_TYPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtEpicCommissionType.findAll", query = "SELECT l FROM LvmtEpicCommissionType l"),
    @NamedQuery(name = "LvmtEpicCommissionType.findByType", query = "SELECT l FROM LvmtEpicCommissionType l WHERE l.type = :type"),
    @NamedQuery(name = "LvmtEpicCommissionType.findByDescription", query = "SELECT l FROM LvmtEpicCommissionType l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtEpicCommissionType.findByIssuerFee", query = "SELECT l FROM LvmtEpicCommissionType l WHERE l.issuerFee = :issuerFee"),
    @NamedQuery(name = "LvmtEpicCommissionType.findByTxnAcqFee", query = "SELECT l FROM LvmtEpicCommissionType l WHERE l.txnAcqFee = :txnAcqFee"),
    @NamedQuery(name = "LvmtEpicCommissionType.findByMerAcqFee", query = "SELECT l FROM LvmtEpicCommissionType l WHERE l.merAcqFee = :merAcqFee"),
    @NamedQuery(name = "LvmtEpicCommissionType.findByLcplFee", query = "SELECT l FROM LvmtEpicCommissionType l WHERE l.lcplFee = :lcplFee")})
public class LvmtEpicCommissionType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TYPE")
    private String type;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "ISSUER_FEE")
    private String issuerFee;
    @Column(name = "TXN_ACQ_FEE")
    private String txnAcqFee;
    @Column(name = "MER_ACQ_FEE")
    private String merAcqFee;
    @Column(name = "LCPL_FEE")
    private String lcplFee;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;

    public LvmtEpicCommissionType() {
    }

    public LvmtEpicCommissionType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIssuerFee() {
        return issuerFee;
    }

    public void setIssuerFee(String issuerFee) {
        this.issuerFee = issuerFee;
    }

    public String getTxnAcqFee() {
        return txnAcqFee;
    }

    public void setTxnAcqFee(String txnAcqFee) {
        this.txnAcqFee = txnAcqFee;
    }

    public String getMerAcqFee() {
        return merAcqFee;
    }

    public void setMerAcqFee(String merAcqFee) {
        this.merAcqFee = merAcqFee;
    }

    public String getLcplFee() {
        return lcplFee;
    }

    public void setLcplFee(String lcplFee) {
        this.lcplFee = lcplFee;
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
        hash += (type != null ? type.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtEpicCommissionType)) {
            return false;
        }
        LvmtEpicCommissionType other = (LvmtEpicCommissionType) object;
        if ((this.type == null && other.type != null) || (this.type != null && !this.type.equals(other.type))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtEpicCommissionType[ type=" + type + " ]";
    }
    
}
