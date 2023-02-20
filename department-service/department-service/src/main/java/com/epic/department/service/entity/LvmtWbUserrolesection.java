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
@Table(name = "LVMT_WB_USERROLESECTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbUserrolesection.findAll", query = "SELECT l FROM LvmtWbUserrolesection l"),
    @NamedQuery(name = "LvmtWbUserrolesection.findByUserrolecode", query = "SELECT l FROM LvmtWbUserrolesection l WHERE l.lvmtWbUserrolesectionPK.userrolecode = :userrolecode"),
    @NamedQuery(name = "LvmtWbUserrolesection.findBySectioncode", query = "SELECT l FROM LvmtWbUserrolesection l WHERE l.lvmtWbUserrolesectionPK.sectioncode = :sectioncode"),
    @NamedQuery(name = "LvmtWbUserrolesection.findByLastupdateduser", query = "SELECT l FROM LvmtWbUserrolesection l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtWbUserrolesection.findByLastupdatedtime", query = "SELECT l FROM LvmtWbUserrolesection l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtWbUserrolesection.findByCreatetime", query = "SELECT l FROM LvmtWbUserrolesection l WHERE l.createtime = :createtime"),
    @NamedQuery(name = "LvmtWbUserrolesection.findByInstitute", query = "SELECT l FROM LvmtWbUserrolesection l WHERE l.institute = :institute")})
public class LvmtWbUserrolesection implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LvmtWbUserrolesectionPK lvmtWbUserrolesectionPK;
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

    public LvmtWbUserrolesection() {
    }

    public LvmtWbUserrolesection(LvmtWbUserrolesectionPK lvmtWbUserrolesectionPK) {
        this.lvmtWbUserrolesectionPK = lvmtWbUserrolesectionPK;
    }

    public LvmtWbUserrolesection(LvmtWbUserrolesectionPK lvmtWbUserrolesectionPK, Date lastupdatedtime, Date createtime) {
        this.lvmtWbUserrolesectionPK = lvmtWbUserrolesectionPK;
        this.lastupdatedtime = lastupdatedtime;
        this.createtime = createtime;
    }

    public LvmtWbUserrolesection(String userrolecode, String sectioncode) {
        this.lvmtWbUserrolesectionPK = new LvmtWbUserrolesectionPK(userrolecode, sectioncode);
    }

    public LvmtWbUserrolesectionPK getLvmtWbUserrolesectionPK() {
        return lvmtWbUserrolesectionPK;
    }

    public void setLvmtWbUserrolesectionPK(LvmtWbUserrolesectionPK lvmtWbUserrolesectionPK) {
        this.lvmtWbUserrolesectionPK = lvmtWbUserrolesectionPK;
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
        hash += (lvmtWbUserrolesectionPK != null ? lvmtWbUserrolesectionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtWbUserrolesection)) {
            return false;
        }
        LvmtWbUserrolesection other = (LvmtWbUserrolesection) object;
        if ((this.lvmtWbUserrolesectionPK == null && other.lvmtWbUserrolesectionPK != null) || (this.lvmtWbUserrolesectionPK != null && !this.lvmtWbUserrolesectionPK.equals(other.lvmtWbUserrolesectionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbUserrolesection[ lvmtWbUserrolesectionPK=" + lvmtWbUserrolesectionPK + " ]";
    }
    
}
