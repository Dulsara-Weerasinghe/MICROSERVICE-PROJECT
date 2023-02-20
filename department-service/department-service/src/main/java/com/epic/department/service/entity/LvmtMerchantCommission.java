/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_MERCHANT_COMMISSION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtMerchantCommission.findAll", query = "SELECT l FROM LvmtMerchantCommission l"),
    @NamedQuery(name = "LvmtMerchantCommission.findByMid", query = "SELECT l FROM LvmtMerchantCommission l WHERE l.lvmtMerchantCommissionPK.mid = :mid"),
    @NamedQuery(name = "LvmtMerchantCommission.findByAccountType", query = "SELECT l FROM LvmtMerchantCommission l WHERE l.lvmtMerchantCommissionPK.accountType = :accountType"),
    @NamedQuery(name = "LvmtMerchantCommission.findByFlatPercentage", query = "SELECT l FROM LvmtMerchantCommission l WHERE l.flatPercentage = :flatPercentage"),
    @NamedQuery(name = "LvmtMerchantCommission.findByAmount", query = "SELECT l FROM LvmtMerchantCommission l WHERE l.amount = :amount"),
    @NamedQuery(name = "LvmtMerchantCommission.findByInstitute", query = "SELECT l FROM LvmtMerchantCommission l WHERE l.lvmtMerchantCommissionPK.institute = :institute"),
    @NamedQuery(name = "LvmtMerchantCommission.findByChannelType", query = "SELECT l FROM LvmtMerchantCommission l WHERE l.lvmtMerchantCommissionPK.channelType = :channelType")})
public class LvmtMerchantCommission implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LvmtMerchantCommissionPK lvmtMerchantCommissionPK;
    @Column(name = "FLAT_PERCENTAGE")
    private String flatPercentage;
    @Column(name = "AMOUNT")
    private String amount;

    public LvmtMerchantCommission() {
    }

    public LvmtMerchantCommission(LvmtMerchantCommissionPK lvmtMerchantCommissionPK) {
        this.lvmtMerchantCommissionPK = lvmtMerchantCommissionPK;
    }

    public LvmtMerchantCommission(String mid, String accountType, String institute, String channelType) {
        this.lvmtMerchantCommissionPK = new LvmtMerchantCommissionPK(mid, accountType, institute, channelType);
    }

    public LvmtMerchantCommissionPK getLvmtMerchantCommissionPK() {
        return lvmtMerchantCommissionPK;
    }

    public void setLvmtMerchantCommissionPK(LvmtMerchantCommissionPK lvmtMerchantCommissionPK) {
        this.lvmtMerchantCommissionPK = lvmtMerchantCommissionPK;
    }

    public String getFlatPercentage() {
        return flatPercentage;
    }

    public void setFlatPercentage(String flatPercentage) {
        this.flatPercentage = flatPercentage;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lvmtMerchantCommissionPK != null ? lvmtMerchantCommissionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtMerchantCommission)) {
            return false;
        }
        LvmtMerchantCommission other = (LvmtMerchantCommission) object;
        if ((this.lvmtMerchantCommissionPK == null && other.lvmtMerchantCommissionPK != null) || (this.lvmtMerchantCommissionPK != null && !this.lvmtMerchantCommissionPK.equals(other.lvmtMerchantCommissionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtMerchantCommission[ lvmtMerchantCommissionPK=" + lvmtMerchantCommissionPK + " ]";
    }
    
}
