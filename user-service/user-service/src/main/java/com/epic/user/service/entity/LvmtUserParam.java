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
@Table(name = "LVMT_USER_PARAM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtUserParam.findAll", query = "SELECT l FROM LvmtUserParam l"),
    @NamedQuery(name = "LvmtUserParam.findByParamCode", query = "SELECT l FROM LvmtUserParam l WHERE l.paramCode = :paramCode"),
    @NamedQuery(name = "LvmtUserParam.findByParamValue", query = "SELECT l FROM LvmtUserParam l WHERE l.paramValue = :paramValue"),
    @NamedQuery(name = "LvmtUserParam.findByDescription", query = "SELECT l FROM LvmtUserParam l WHERE l.description = :description")})
public class LvmtUserParam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARAM_CODE")
    private String paramCode;
    @Basic(optional = false)
    @Column(name = "PARAM_VALUE")
    private String paramValue;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;

    public LvmtUserParam() {
    }

    public LvmtUserParam(String paramCode) {
        this.paramCode = paramCode;
    }

    public LvmtUserParam(String paramCode, String paramValue, String description) {
        this.paramCode = paramCode;
        this.paramValue = paramValue;
        this.description = description;
    }

    public String getParamCode() {
        return paramCode;
    }

    public void setParamCode(String paramCode) {
        this.paramCode = paramCode;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
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
        hash += (paramCode != null ? paramCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtUserParam)) {
            return false;
        }
        LvmtUserParam other = (LvmtUserParam) object;
        if ((this.paramCode == null && other.paramCode != null) || (this.paramCode != null && !this.paramCode.equals(other.paramCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtUserParam[ paramCode=" + paramCode + " ]";
    }
    
}
