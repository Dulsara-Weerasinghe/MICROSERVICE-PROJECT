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
@Table(name = "LVMT_SWT_MT_OPERATION_CATEGORY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtMtOperationCategory.findAll", query = "SELECT l FROM LvmtSwtMtOperationCategory l"),
    @NamedQuery(name = "LvmtSwtMtOperationCategory.findByCode", query = "SELECT l FROM LvmtSwtMtOperationCategory l WHERE l.code = :code"),
    @NamedQuery(name = "LvmtSwtMtOperationCategory.findByDescription", query = "SELECT l FROM LvmtSwtMtOperationCategory l WHERE l.description = :description")})
public class LvmtSwtMtOperationCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODE")
    private Long code;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;

    public LvmtSwtMtOperationCategory() {
    }

    public LvmtSwtMtOperationCategory(Long code) {
        this.code = code;
    }

    public LvmtSwtMtOperationCategory(Long code, String description) {
        this.code = code;
        this.description = description;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtMtOperationCategory)) {
            return false;
        }
        LvmtSwtMtOperationCategory other = (LvmtSwtMtOperationCategory) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtMtOperationCategory[ code=" + code + " ]";
    }
    
}
