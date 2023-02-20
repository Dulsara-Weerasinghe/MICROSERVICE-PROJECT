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
@Table(name = "LVMT_WB_SECTIONPAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbSectionpage.findAll", query = "SELECT l FROM LvmtWbSectionpage l"),
    @NamedQuery(name = "LvmtWbSectionpage.findByUserrolecode", query = "SELECT l FROM LvmtWbSectionpage l WHERE l.lvmtWbSectionpagePK.userrolecode = :userrolecode"),
    @NamedQuery(name = "LvmtWbSectionpage.findBySectioncode", query = "SELECT l FROM LvmtWbSectionpage l WHERE l.lvmtWbSectionpagePK.sectioncode = :sectioncode"),
    @NamedQuery(name = "LvmtWbSectionpage.findByPagecode", query = "SELECT l FROM LvmtWbSectionpage l WHERE l.lvmtWbSectionpagePK.pagecode = :pagecode"),
    @NamedQuery(name = "LvmtWbSectionpage.findByLastupdateduser", query = "SELECT l FROM LvmtWbSectionpage l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtWbSectionpage.findByLastupdatedtime", query = "SELECT l FROM LvmtWbSectionpage l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtWbSectionpage.findByCreatetime", query = "SELECT l FROM LvmtWbSectionpage l WHERE l.createtime = :createtime"),
    @NamedQuery(name = "LvmtWbSectionpage.findByInstitute", query = "SELECT l FROM LvmtWbSectionpage l WHERE l.institute = :institute")})
public class LvmtWbSectionpage implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LvmtWbSectionpagePK lvmtWbSectionpagePK;
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

    public LvmtWbSectionpage() {
    }

    public LvmtWbSectionpage(LvmtWbSectionpagePK lvmtWbSectionpagePK) {
        this.lvmtWbSectionpagePK = lvmtWbSectionpagePK;
    }

    public LvmtWbSectionpage(LvmtWbSectionpagePK lvmtWbSectionpagePK, Date lastupdatedtime, Date createtime) {
        this.lvmtWbSectionpagePK = lvmtWbSectionpagePK;
        this.lastupdatedtime = lastupdatedtime;
        this.createtime = createtime;
    }

    public LvmtWbSectionpage(String userrolecode, String sectioncode, String pagecode) {
        this.lvmtWbSectionpagePK = new LvmtWbSectionpagePK(userrolecode, sectioncode, pagecode);
    }

    public LvmtWbSectionpagePK getLvmtWbSectionpagePK() {
        return lvmtWbSectionpagePK;
    }

    public void setLvmtWbSectionpagePK(LvmtWbSectionpagePK lvmtWbSectionpagePK) {
        this.lvmtWbSectionpagePK = lvmtWbSectionpagePK;
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
        hash += (lvmtWbSectionpagePK != null ? lvmtWbSectionpagePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtWbSectionpage)) {
            return false;
        }
        LvmtWbSectionpage other = (LvmtWbSectionpage) object;
        if ((this.lvmtWbSectionpagePK == null && other.lvmtWbSectionpagePK != null) || (this.lvmtWbSectionpagePK != null && !this.lvmtWbSectionpagePK.equals(other.lvmtWbSectionpagePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbSectionpage[ lvmtWbSectionpagePK=" + lvmtWbSectionpagePK + " ]";
    }
    
}
