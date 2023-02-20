/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "LVMT_WB_INSTITUTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbInstitute.findAll", query = "SELECT l FROM LvmtWbInstitute l"),
    @NamedQuery(name = "LvmtWbInstitute.findByCode", query = "SELECT l FROM LvmtWbInstitute l WHERE l.code = :code"),
    @NamedQuery(name = "LvmtWbInstitute.findByName", query = "SELECT l FROM LvmtWbInstitute l WHERE l.name = :name"),
    @NamedQuery(name = "LvmtWbInstitute.findByColour", query = "SELECT l FROM LvmtWbInstitute l WHERE l.colour = :colour"),
    @NamedQuery(name = "LvmtWbInstitute.findByStatus", query = "SELECT l FROM LvmtWbInstitute l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtWbInstitute.findByLastupdateduser", query = "SELECT l FROM LvmtWbInstitute l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtWbInstitute.findByLastupdatedtime", query = "SELECT l FROM LvmtWbInstitute l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtWbInstitute.findByCreatedtime", query = "SELECT l FROM LvmtWbInstitute l WHERE l.createdtime = :createdtime")})
public class LvmtWbInstitute implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODE")
    private String code;
    @Column(name = "NAME")
    private String name;
    @Column(name = "COLOUR")
    private String colour;
    @Column(name = "STATUS")
    private Long status;
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
    @Lob
    @Column(name = "LOGO")
    private Serializable logo;

    public LvmtWbInstitute() {
    }

    public LvmtWbInstitute(String code) {
        this.code = code;
    }

    public LvmtWbInstitute(String code, Date lastupdatedtime, Date createdtime) {
        this.code = code;
        this.lastupdatedtime = lastupdatedtime;
        this.createdtime = createdtime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
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

    public Serializable getLogo() {
        return logo;
    }

    public void setLogo(Serializable logo) {
        this.logo = logo;
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
        if (!(object instanceof LvmtWbInstitute)) {
            return false;
        }
        LvmtWbInstitute other = (LvmtWbInstitute) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbInstitute[ code=" + code + " ]";
    }
    
}
