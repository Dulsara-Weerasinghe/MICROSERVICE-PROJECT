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
@Table(name = "LVMT_SWT_MT_HEADER_SIZE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtMtHeaderSize.findAll", query = "SELECT l FROM LvmtSwtMtHeaderSize l"),
    @NamedQuery(name = "LvmtSwtMtHeaderSize.findById", query = "SELECT l FROM LvmtSwtMtHeaderSize l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtSwtMtHeaderSize.findByDescription", query = "SELECT l FROM LvmtSwtMtHeaderSize l WHERE l.description = :description")})
public class LvmtSwtMtHeaderSize implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;

    public LvmtSwtMtHeaderSize() {
    }

    public LvmtSwtMtHeaderSize(Long id) {
        this.id = id;
    }

    public LvmtSwtMtHeaderSize(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtMtHeaderSize)) {
            return false;
        }
        LvmtSwtMtHeaderSize other = (LvmtSwtMtHeaderSize) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtMtHeaderSize[ id=" + id + " ]";
    }
    
}
