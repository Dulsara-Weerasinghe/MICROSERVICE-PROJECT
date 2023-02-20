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
@Table(name = "LVMT_WB_PAGETASK_1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbPagetask1.findAll", query = "SELECT l FROM LvmtWbPagetask1 l"),
    @NamedQuery(name = "LvmtWbPagetask1.findByUserrolecode", query = "SELECT l FROM LvmtWbPagetask1 l WHERE l.lvmtWbPagetask1PK.userrolecode = :userrolecode"),
    @NamedQuery(name = "LvmtWbPagetask1.findByPagecode", query = "SELECT l FROM LvmtWbPagetask1 l WHERE l.lvmtWbPagetask1PK.pagecode = :pagecode"),
    @NamedQuery(name = "LvmtWbPagetask1.findByTaskcode", query = "SELECT l FROM LvmtWbPagetask1 l WHERE l.lvmtWbPagetask1PK.taskcode = :taskcode"),
    @NamedQuery(name = "LvmtWbPagetask1.findByLastupdateduser", query = "SELECT l FROM LvmtWbPagetask1 l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtWbPagetask1.findByLastupdatedtime", query = "SELECT l FROM LvmtWbPagetask1 l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtWbPagetask1.findByCreatetime", query = "SELECT l FROM LvmtWbPagetask1 l WHERE l.createtime = :createtime"),
    @NamedQuery(name = "LvmtWbPagetask1.findByInstitute", query = "SELECT l FROM LvmtWbPagetask1 l WHERE l.institute = :institute")})
public class LvmtWbPagetask1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LvmtWbPagetask1PK lvmtWbPagetask1PK;
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

    public LvmtWbPagetask1() {
    }

    public LvmtWbPagetask1(LvmtWbPagetask1PK lvmtWbPagetask1PK) {
        this.lvmtWbPagetask1PK = lvmtWbPagetask1PK;
    }

    public LvmtWbPagetask1(LvmtWbPagetask1PK lvmtWbPagetask1PK, Date lastupdatedtime, Date createtime) {
        this.lvmtWbPagetask1PK = lvmtWbPagetask1PK;
        this.lastupdatedtime = lastupdatedtime;
        this.createtime = createtime;
    }

    public LvmtWbPagetask1(String userrolecode, String pagecode, String taskcode) {
        this.lvmtWbPagetask1PK = new LvmtWbPagetask1PK(userrolecode, pagecode, taskcode);
    }

    public LvmtWbPagetask1PK getLvmtWbPagetask1PK() {
        return lvmtWbPagetask1PK;
    }

    public void setLvmtWbPagetask1PK(LvmtWbPagetask1PK lvmtWbPagetask1PK) {
        this.lvmtWbPagetask1PK = lvmtWbPagetask1PK;
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
        hash += (lvmtWbPagetask1PK != null ? lvmtWbPagetask1PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtWbPagetask1)) {
            return false;
        }
        LvmtWbPagetask1 other = (LvmtWbPagetask1) object;
        if ((this.lvmtWbPagetask1PK == null && other.lvmtWbPagetask1PK != null) || (this.lvmtWbPagetask1PK != null && !this.lvmtWbPagetask1PK.equals(other.lvmtWbPagetask1PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbPagetask1[ lvmtWbPagetask1PK=" + lvmtWbPagetask1PK + " ]";
    }
    
}
