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
@Table(name = "LVMT_JP_MT_RESPONSE_CODE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtJpMtResponseCode.findAll", query = "SELECT l FROM LvmtJpMtResponseCode l"),
    @NamedQuery(name = "LvmtJpMtResponseCode.findByCode", query = "SELECT l FROM LvmtJpMtResponseCode l WHERE l.code = :code"),
    @NamedQuery(name = "LvmtJpMtResponseCode.findByDescription", query = "SELECT l FROM LvmtJpMtResponseCode l WHERE l.description = :description")})
public class LvmtJpMtResponseCode implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODE")
    private String code;
    @Column(name = "DESCRIPTION")
    private String description;

    public LvmtJpMtResponseCode() {
    }

    public LvmtJpMtResponseCode(String code) {
        this.code = code;
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
        if (!(object instanceof LvmtJpMtResponseCode)) {
            return false;
        }
        LvmtJpMtResponseCode other = (LvmtJpMtResponseCode) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtJpMtResponseCode[ code=" + code + " ]";
    }
    
}
