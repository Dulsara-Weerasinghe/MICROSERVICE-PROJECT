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
@Table(name = "LVMT_SWT_MO_OPERATION_ALERT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtMoOperationAlert.findAll", query = "SELECT l FROM LvmtSwtMoOperationAlert l"),
    @NamedQuery(name = "LvmtSwtMoOperationAlert.findById", query = "SELECT l FROM LvmtSwtMoOperationAlert l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtSwtMoOperationAlert.findByOpCode", query = "SELECT l FROM LvmtSwtMoOperationAlert l WHERE l.opCode = :opCode"),
    @NamedQuery(name = "LvmtSwtMoOperationAlert.findByDescription", query = "SELECT l FROM LvmtSwtMoOperationAlert l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtSwtMoOperationAlert.findByStatus", query = "SELECT l FROM LvmtSwtMoOperationAlert l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtSwtMoOperationAlert.findByInstitute", query = "SELECT l FROM LvmtSwtMoOperationAlert l WHERE l.institute = :institute")})
public class LvmtSwtMoOperationAlert implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "OP_CODE")
    private long opCode;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private long status;
    @Column(name = "INSTITUTE")
    private String institute;

    public LvmtSwtMoOperationAlert() {
    }

    public LvmtSwtMoOperationAlert(Long id) {
        this.id = id;
    }

    public LvmtSwtMoOperationAlert(Long id, long opCode, String description, long status) {
        this.id = id;
        this.opCode = opCode;
        this.description = description;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getOpCode() {
        return opCode;
    }

    public void setOpCode(long opCode) {
        this.opCode = opCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
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
        if (!(object instanceof LvmtSwtMoOperationAlert)) {
            return false;
        }
        LvmtSwtMoOperationAlert other = (LvmtSwtMoOperationAlert) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtMoOperationAlert[ id=" + id + " ]";
    }
    
}
