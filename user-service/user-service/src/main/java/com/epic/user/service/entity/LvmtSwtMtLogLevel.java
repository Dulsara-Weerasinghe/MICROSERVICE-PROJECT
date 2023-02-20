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
@Table(name = "LVMT_SWT_MT_LOG_LEVEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtMtLogLevel.findAll", query = "SELECT l FROM LvmtSwtMtLogLevel l"),
    @NamedQuery(name = "LvmtSwtMtLogLevel.findByLevel", query = "SELECT l FROM LvmtSwtMtLogLevel l WHERE l.level = :level"),
    @NamedQuery(name = "LvmtSwtMtLogLevel.findByDescription", query = "SELECT l FROM LvmtSwtMtLogLevel l WHERE l.description = :description")})
public class LvmtSwtMtLogLevel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LEVEL")
    private Long level;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;

    public LvmtSwtMtLogLevel() {
    }

    public LvmtSwtMtLogLevel(Long level) {
        this.level = level;
    }

    public LvmtSwtMtLogLevel(Long level, String description) {
        this.level = level;
        this.description = description;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
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
        hash += (level != null ? level.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtMtLogLevel)) {
            return false;
        }
        LvmtSwtMtLogLevel other = (LvmtSwtMtLogLevel) object;
        if ((this.level == null && other.level != null) || (this.level != null && !this.level.equals(other.level))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtMtLogLevel[ level=" + level + " ]";
    }
    
}
