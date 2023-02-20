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
@Table(name = "LVMT_QR_CHANNEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtQrChannel.findAll", query = "SELECT l FROM LvmtQrChannel l"),
    @NamedQuery(name = "LvmtQrChannel.findByCode", query = "SELECT l FROM LvmtQrChannel l WHERE l.code = :code"),
    @NamedQuery(name = "LvmtQrChannel.findByDescription", query = "SELECT l FROM LvmtQrChannel l WHERE l.description = :description")})
public class LvmtQrChannel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODE")
    private Short code;
    @Column(name = "DESCRIPTION")
    private String description;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;

    public LvmtQrChannel() {
    }

    public LvmtQrChannel(Short code) {
        this.code = code;
    }

    public Short getCode() {
        return code;
    }

    public void setCode(Short code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtQrChannel)) {
            return false;
        }
        LvmtQrChannel other = (LvmtQrChannel) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtQrChannel[ code=" + code + " ]";
    }
    
}
