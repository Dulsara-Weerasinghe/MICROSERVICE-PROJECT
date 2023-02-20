/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_WB_USERROLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbUserrole.findAll", query = "SELECT l FROM LvmtWbUserrole l"),
    @NamedQuery(name = "LvmtWbUserrole.findByUserrolecode", query = "SELECT l FROM LvmtWbUserrole l WHERE l.userrolecode = :userrolecode"),
    @NamedQuery(name = "LvmtWbUserrole.findByDescription", query = "SELECT l FROM LvmtWbUserrole l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtWbUserrole.findByStatuscode", query = "SELECT l FROM LvmtWbUserrole l WHERE l.statuscode = :statuscode"),
    @NamedQuery(name = "LvmtWbUserrole.findByUserlevel", query = "SELECT l FROM LvmtWbUserrole l WHERE l.userlevel = :userlevel"),
    @NamedQuery(name = "LvmtWbUserrole.findByInstitute", query = "SELECT l FROM LvmtWbUserrole l WHERE l.institute = :institute"),
    @NamedQuery(name = "LvmtWbUserrole.findByLastupdateduser", query = "SELECT l FROM LvmtWbUserrole l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtWbUserrole.findByLastupdatedtime", query = "SELECT l FROM LvmtWbUserrole l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtWbUserrole.findByCreatedtime", query = "SELECT l FROM LvmtWbUserrole l WHERE l.createdtime = :createdtime")})
public class LvmtWbUserrole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USERROLECODE")
    private String userrolecode;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "STATUSCODE")
    private Long statuscode;
    @Column(name = "USERLEVEL")
    private Short userlevel;
    @Column(name = "INSTITUTE")
    private String institute;
    @Column(name = "LASTUPDATEDUSER")
    private String lastupdateduser;
    @Basic(optional = false)
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Basic(optional = false)
    @Column(name = "CREATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdtime;

    public LvmtWbUserrole() {
    }

    public LvmtWbUserrole(String userrolecode) {
        this.userrolecode = userrolecode;
    }

    public LvmtWbUserrole(String userrolecode, Date lastupdatedtime, Date createdtime) {
        this.userrolecode = userrolecode;
        this.lastupdatedtime = lastupdatedtime;
        this.createdtime = createdtime;
    }

    public String getUserrolecode() {
        return userrolecode;
    }

    public void setUserrolecode(String userrolecode) {
        this.userrolecode = userrolecode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(Long statuscode) {
        this.statuscode = statuscode;
    }

    public Short getUserlevel() {
        return userlevel;
    }

    public void setUserlevel(Short userlevel) {
        this.userlevel = userlevel;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getLastupdateduser() {
        return lastupdateduser;
    }

    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
    }

    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userrolecode != null ? userrolecode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtWbUserrole)) {
            return false;
        }
        LvmtWbUserrole other = (LvmtWbUserrole) object;
        if ((this.userrolecode == null && other.userrolecode != null) || (this.userrolecode != null && !this.userrolecode.equals(other.userrolecode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbUserrole[ userrolecode=" + userrolecode + " ]";
    }
    
}
