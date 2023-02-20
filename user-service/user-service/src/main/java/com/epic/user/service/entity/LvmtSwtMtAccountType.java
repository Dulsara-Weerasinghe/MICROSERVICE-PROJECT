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
@Table(name = "LVMT_SWT_MT_ACCOUNT_TYPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtMtAccountType.findAll", query = "SELECT l FROM LvmtSwtMtAccountType l"),
    @NamedQuery(name = "LvmtSwtMtAccountType.findByCode", query = "SELECT l FROM LvmtSwtMtAccountType l WHERE l.code = :code"),
    @NamedQuery(name = "LvmtSwtMtAccountType.findByDescription", query = "SELECT l FROM LvmtSwtMtAccountType l WHERE l.description = :description")})
public class LvmtSwtMtAccountType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODE")
    private String code;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;

    public LvmtSwtMtAccountType() {
    }

    public LvmtSwtMtAccountType(String code) {
        this.code = code;
    }

    public LvmtSwtMtAccountType(String code, String description) {
        this.code = code;
        this.description = description;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtMtAccountType)) {
            return false;
        }
        LvmtSwtMtAccountType other = (LvmtSwtMtAccountType) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtMtAccountType[ code=" + code + " ]";
    }
    
}
