/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "LVMT_BILL_LIMIT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtBillLimit.findAll", query = "SELECT l FROM LvmtBillLimit l"),
    @NamedQuery(name = "LvmtBillLimit.findByProviderId", query = "SELECT l FROM LvmtBillLimit l WHERE l.lvmtBillLimitPK.providerId = :providerId"),
    @NamedQuery(name = "LvmtBillLimit.findByTxnType", query = "SELECT l FROM LvmtBillLimit l WHERE l.lvmtBillLimitPK.txnType = :txnType"),
    @NamedQuery(name = "LvmtBillLimit.findByMinLimit", query = "SELECT l FROM LvmtBillLimit l WHERE l.minLimit = :minLimit"),
    @NamedQuery(name = "LvmtBillLimit.findByMaxLimit", query = "SELECT l FROM LvmtBillLimit l WHERE l.maxLimit = :maxLimit")})
public class LvmtBillLimit implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LvmtBillLimitPK lvmtBillLimitPK;
    @Column(name = "MIN_LIMIT")
    private BigInteger minLimit;
    @Column(name = "MAX_LIMIT")
    private BigInteger maxLimit;
    @JoinColumn(name = "PROVIDER_ID", referencedColumnName = "PROVIDER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private LvmtBillServiceProvider lvmtBillServiceProvider;

    public LvmtBillLimit() {
    }

    public LvmtBillLimit(LvmtBillLimitPK lvmtBillLimitPK) {
        this.lvmtBillLimitPK = lvmtBillLimitPK;
    }

    public LvmtBillLimit(String providerId, String txnType) {
        this.lvmtBillLimitPK = new LvmtBillLimitPK(providerId, txnType);
    }

    public LvmtBillLimitPK getLvmtBillLimitPK() {
        return lvmtBillLimitPK;
    }

    public void setLvmtBillLimitPK(LvmtBillLimitPK lvmtBillLimitPK) {
        this.lvmtBillLimitPK = lvmtBillLimitPK;
    }

    public BigInteger getMinLimit() {
        return minLimit;
    }

    public void setMinLimit(BigInteger minLimit) {
        this.minLimit = minLimit;
    }

    public BigInteger getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(BigInteger maxLimit) {
        this.maxLimit = maxLimit;
    }

    public LvmtBillServiceProvider getLvmtBillServiceProvider() {
        return lvmtBillServiceProvider;
    }

    public void setLvmtBillServiceProvider(LvmtBillServiceProvider lvmtBillServiceProvider) {
        this.lvmtBillServiceProvider = lvmtBillServiceProvider;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lvmtBillLimitPK != null ? lvmtBillLimitPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtBillLimit)) {
            return false;
        }
        LvmtBillLimit other = (LvmtBillLimit) object;
        if ((this.lvmtBillLimitPK == null && other.lvmtBillLimitPK != null) || (this.lvmtBillLimitPK != null && !this.lvmtBillLimitPK.equals(other.lvmtBillLimitPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtBillLimit[ lvmtBillLimitPK=" + lvmtBillLimitPK + " ]";
    }
    
}
