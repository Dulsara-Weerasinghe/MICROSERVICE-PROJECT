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
@Table(name = "LVMT_SWT_MT_OPERATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtMtOperation.findAll", query = "SELECT l FROM LvmtSwtMtOperation l"),
    @NamedQuery(name = "LvmtSwtMtOperation.findByCode", query = "SELECT l FROM LvmtSwtMtOperation l WHERE l.code = :code"),
    @NamedQuery(name = "LvmtSwtMtOperation.findByDescription", query = "SELECT l FROM LvmtSwtMtOperation l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtSwtMtOperation.findByOperationCategory", query = "SELECT l FROM LvmtSwtMtOperation l WHERE l.operationCategory = :operationCategory")})
public class LvmtSwtMtOperation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODE")
    private Long code;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "OPERATION_CATEGORY")
    private long operationCategory;

    public LvmtSwtMtOperation() {
    }

    public LvmtSwtMtOperation(Long code) {
        this.code = code;
    }

    public LvmtSwtMtOperation(Long code, String description, long operationCategory) {
        this.code = code;
        this.description = description;
        this.operationCategory = operationCategory;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getOperationCategory() {
        return operationCategory;
    }

    public void setOperationCategory(long operationCategory) {
        this.operationCategory = operationCategory;
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
        if (!(object instanceof LvmtSwtMtOperation)) {
            return false;
        }
        LvmtSwtMtOperation other = (LvmtSwtMtOperation) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtMtOperation[ code=" + code + " ]";
    }
    
}
