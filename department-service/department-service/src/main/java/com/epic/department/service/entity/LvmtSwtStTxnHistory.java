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
@Table(name = "LVMT_SWT_ST_TXN_HISTORY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtStTxnHistory.findAll", query = "SELECT l FROM LvmtSwtStTxnHistory l"),
    @NamedQuery(name = "LvmtSwtStTxnHistory.findByTxnId", query = "SELECT l FROM LvmtSwtStTxnHistory l WHERE l.txnId = :txnId"),
    @NamedQuery(name = "LvmtSwtStTxnHistory.findByStatus", query = "SELECT l FROM LvmtSwtStTxnHistory l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtSwtStTxnHistory.findById", query = "SELECT l FROM LvmtSwtStTxnHistory l WHERE l.id = :id")})
public class LvmtSwtStTxnHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "TXN_ID")
    private String txnId;
    @Column(name = "STATUS")
    private Long status;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    public LvmtSwtStTxnHistory() {
    }

    public LvmtSwtStTxnHistory(Long id) {
        this.id = id;
    }

    public LvmtSwtStTxnHistory(Long id, String txnId) {
        this.id = id;
        this.txnId = txnId;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtStTxnHistory)) {
            return false;
        }
        LvmtSwtStTxnHistory other = (LvmtSwtStTxnHistory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtStTxnHistory[ id=" + id + " ]";
    }
    
}
