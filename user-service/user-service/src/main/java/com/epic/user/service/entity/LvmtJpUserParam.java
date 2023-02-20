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
@Table(name = "LVMT_JP_USER_PARAM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtJpUserParam.findAll", query = "SELECT l FROM LvmtJpUserParam l"),
    @NamedQuery(name = "LvmtJpUserParam.findByParamCode", query = "SELECT l FROM LvmtJpUserParam l WHERE l.paramCode = :paramCode"),
    @NamedQuery(name = "LvmtJpUserParam.findByParamValue", query = "SELECT l FROM LvmtJpUserParam l WHERE l.paramValue = :paramValue"),
    @NamedQuery(name = "LvmtJpUserParam.findByDescription", query = "SELECT l FROM LvmtJpUserParam l WHERE l.description = :description")})
public class LvmtJpUserParam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARAM_CODE")
    private String paramCode;
    @Basic(optional = false)
    @Column(name = "PARAM_VALUE")
    private String paramValue;
    @Column(name = "DESCRIPTION")
    private String description;

    public LvmtJpUserParam() {
    }

    public LvmtJpUserParam(String paramCode) {
        this.paramCode = paramCode;
    }

    public LvmtJpUserParam(String paramCode, String paramValue) {
        this.paramCode = paramCode;
        this.paramValue = paramValue;
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
        if (!(object instanceof LvmtJpUserParam)) {
            return false;
        }
        LvmtJpUserParam other = (LvmtJpUserParam) object;
        if ((this.paramCode == null && other.paramCode != null) || (this.paramCode != null && !this.paramCode.equals(other.paramCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtJpUserParam[ paramCode=" + paramCode + " ]";
    }
    
}
