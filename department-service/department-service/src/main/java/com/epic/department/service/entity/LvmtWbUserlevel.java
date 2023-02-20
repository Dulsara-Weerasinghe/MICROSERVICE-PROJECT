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
@Table(name = "LVMT_WB_USERLEVEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbUserlevel.findAll", query = "SELECT l FROM LvmtWbUserlevel l"),
    @NamedQuery(name = "LvmtWbUserlevel.findByLevelid", query = "SELECT l FROM LvmtWbUserlevel l WHERE l.levelid = :levelid"),
    @NamedQuery(name = "LvmtWbUserlevel.findByDescription", query = "SELECT l FROM LvmtWbUserlevel l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtWbUserlevel.findByInstitute", query = "SELECT l FROM LvmtWbUserlevel l WHERE l.institute = :institute")})
public class LvmtWbUserlevel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LEVELID")
    private Short levelid;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "INSTITUTE")
    private String institute;

    public LvmtWbUserlevel() {
    }

    public LvmtWbUserlevel(Short levelid) {
        this.levelid = levelid;
    }

    public Short getLevelid() {
        return levelid;
    }

    public void setLevelid(Short levelid) {
        this.levelid = levelid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (levelid != null ? levelid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtWbUserlevel)) {
            return false;
        }
        LvmtWbUserlevel other = (LvmtWbUserlevel) object;
        if ((this.levelid == null && other.levelid != null) || (this.levelid != null && !this.levelid.equals(other.levelid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbUserlevel[ levelid=" + levelid + " ]";
    }
    
}
