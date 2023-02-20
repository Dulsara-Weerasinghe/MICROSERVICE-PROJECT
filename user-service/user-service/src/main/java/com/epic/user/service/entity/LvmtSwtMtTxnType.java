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
@Table(name = "LVMT_SWT_MT_TXN_TYPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtMtTxnType.findAll", query = "SELECT l FROM LvmtSwtMtTxnType l"),
    @NamedQuery(name = "LvmtSwtMtTxnType.findByCode", query = "SELECT l FROM LvmtSwtMtTxnType l WHERE l.code = :code"),
    @NamedQuery(name = "LvmtSwtMtTxnType.findByDescription", query = "SELECT l FROM LvmtSwtMtTxnType l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtSwtMtTxnType.findByHistoryVisibility", query = "SELECT l FROM LvmtSwtMtTxnType l WHERE l.historyVisibility = :historyVisibility"),
    @NamedQuery(name = "LvmtSwtMtTxnType.findByMerchantTxnType", query = "SELECT l FROM LvmtSwtMtTxnType l WHERE l.merchantTxnType = :merchantTxnType")})
public class LvmtSwtMtTxnType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODE")
    private String code;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "HISTORY_VISIBILITY")
    private long historyVisibility;
    @Basic(optional = false)
    @Column(name = "MERCHANT_TXN_TYPE")
    private long merchantTxnType;

    public LvmtSwtMtTxnType() {
    }

    public LvmtSwtMtTxnType(String code) {
        this.code = code;
    }

    public LvmtSwtMtTxnType(String code, String description, long historyVisibility, long merchantTxnType) {
        this.code = code;
        this.description = description;
        this.historyVisibility = historyVisibility;
        this.merchantTxnType = merchantTxnType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getHistoryVisibility() {
        return historyVisibility;
    }

    public void setHistoryVisibility(long historyVisibility) {
        this.historyVisibility = historyVisibility;
    }

    public long getMerchantTxnType() {
        return merchantTxnType;
    }

    public void setMerchantTxnType(long merchantTxnType) {
        this.merchantTxnType = merchantTxnType;
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
        if (!(object instanceof LvmtSwtMtTxnType)) {
            return false;
        }
        LvmtSwtMtTxnType other = (LvmtSwtMtTxnType) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtMtTxnType[ code=" + code + " ]";
    }
    
}
