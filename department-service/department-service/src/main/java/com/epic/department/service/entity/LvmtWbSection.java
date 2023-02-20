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
@Table(name = "LVMT_WB_SECTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbSection.findAll", query = "SELECT l FROM LvmtWbSection l"),
    @NamedQuery(name = "LvmtWbSection.findBySectioncode", query = "SELECT l FROM LvmtWbSection l WHERE l.sectioncode = :sectioncode"),
    @NamedQuery(name = "LvmtWbSection.findByDescription", query = "SELECT l FROM LvmtWbSection l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtWbSection.findByStatus", query = "SELECT l FROM LvmtWbSection l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtWbSection.findByLastupdateduser", query = "SELECT l FROM LvmtWbSection l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtWbSection.findByLastupdatedtime", query = "SELECT l FROM LvmtWbSection l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtWbSection.findByCreatedtime", query = "SELECT l FROM LvmtWbSection l WHERE l.createdtime = :createdtime"),
    @NamedQuery(name = "LvmtWbSection.findBySortkey", query = "SELECT l FROM LvmtWbSection l WHERE l.sortkey = :sortkey"),
    @NamedQuery(name = "LvmtWbSection.findByInstitute", query = "SELECT l FROM LvmtWbSection l WHERE l.institute = :institute")})
public class LvmtWbSection implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SECTIONCODE")
    private String sectioncode;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @Column(name = "SORTKEY")
    private Short sortkey;
    @Column(name = "INSTITUTE")
    private String institute;

    public LvmtWbSection() {
    }

    public LvmtWbSection(String sectioncode) {
        this.sectioncode = sectioncode;
    }

    public LvmtWbSection(String sectioncode, Date lastupdatedtime, Date createdtime) {
        this.sectioncode = sectioncode;
        this.lastupdatedtime = lastupdatedtime;
        this.createdtime = createdtime;
    }

    public String getSectioncode() {
        return sectioncode;
    }

    public void setSectioncode(String sectioncode) {
        this.sectioncode = sectioncode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Short getSortkey() {
        return sortkey;
    }

    public void setSortkey(Short sortkey) {
        this.sortkey = sortkey;
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
        hash += (sectioncode != null ? sectioncode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtWbSection)) {
            return false;
        }
        LvmtWbSection other = (LvmtWbSection) object;
        if ((this.sectioncode == null && other.sectioncode != null) || (this.sectioncode != null && !this.sectioncode.equals(other.sectioncode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbSection[ sectioncode=" + sectioncode + " ]";
    }
    
}
