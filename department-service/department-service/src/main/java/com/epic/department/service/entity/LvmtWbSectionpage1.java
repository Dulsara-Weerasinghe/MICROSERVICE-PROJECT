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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "LVMT_WB_SECTIONPAGE_1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbSectionpage1.findAll", query = "SELECT l FROM LvmtWbSectionpage1 l"),
    @NamedQuery(name = "LvmtWbSectionpage1.findByUserrolecode", query = "SELECT l FROM LvmtWbSectionpage1 l WHERE l.lvmtWbSectionpage1PK.userrolecode = :userrolecode"),
    @NamedQuery(name = "LvmtWbSectionpage1.findBySectioncode", query = "SELECT l FROM LvmtWbSectionpage1 l WHERE l.lvmtWbSectionpage1PK.sectioncode = :sectioncode"),
    @NamedQuery(name = "LvmtWbSectionpage1.findByPagecode", query = "SELECT l FROM LvmtWbSectionpage1 l WHERE l.lvmtWbSectionpage1PK.pagecode = :pagecode"),
    @NamedQuery(name = "LvmtWbSectionpage1.findByLastupdateduser", query = "SELECT l FROM LvmtWbSectionpage1 l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtWbSectionpage1.findByLastupdatedtime", query = "SELECT l FROM LvmtWbSectionpage1 l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtWbSectionpage1.findByCreatetime", query = "SELECT l FROM LvmtWbSectionpage1 l WHERE l.createtime = :createtime"),
    @NamedQuery(name = "LvmtWbSectionpage1.findByInstitute", query = "SELECT l FROM LvmtWbSectionpage1 l WHERE l.institute = :institute")})
public class LvmtWbSectionpage1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LvmtWbSectionpage1PK lvmtWbSectionpage1PK;
    @Column(name = "LASTUPDATEDUSER")
    private String lastupdateduser;
    @Basic(optional = false)
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Basic(optional = false)
    @Column(name = "CREATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    @Column(name = "INSTITUTE")
    private String institute;

    public LvmtWbSectionpage1() {
    }

    public LvmtWbSectionpage1(LvmtWbSectionpage1PK lvmtWbSectionpage1PK) {
        this.lvmtWbSectionpage1PK = lvmtWbSectionpage1PK;
    }

    public LvmtWbSectionpage1(LvmtWbSectionpage1PK lvmtWbSectionpage1PK, Date lastupdatedtime, Date createtime) {
        this.lvmtWbSectionpage1PK = lvmtWbSectionpage1PK;
        this.lastupdatedtime = lastupdatedtime;
        this.createtime = createtime;
    }

    public LvmtWbSectionpage1(String userrolecode, String sectioncode, String pagecode) {
        this.lvmtWbSectionpage1PK = new LvmtWbSectionpage1PK(userrolecode, sectioncode, pagecode);
    }

    public LvmtWbSectionpage1PK getLvmtWbSectionpage1PK() {
        return lvmtWbSectionpage1PK;
    }

    public void setLvmtWbSectionpage1PK(LvmtWbSectionpage1PK lvmtWbSectionpage1PK) {
        this.lvmtWbSectionpage1PK = lvmtWbSectionpage1PK;
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
        hash += (lvmtWbSectionpage1PK != null ? lvmtWbSectionpage1PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtWbSectionpage1)) {
            return false;
        }
        LvmtWbSectionpage1 other = (LvmtWbSectionpage1) object;
        if ((this.lvmtWbSectionpage1PK == null && other.lvmtWbSectionpage1PK != null) || (this.lvmtWbSectionpage1PK != null && !this.lvmtWbSectionpage1PK.equals(other.lvmtWbSectionpage1PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbSectionpage1[ lvmtWbSectionpage1PK=" + lvmtWbSectionpage1PK + " ]";
    }
    
}
