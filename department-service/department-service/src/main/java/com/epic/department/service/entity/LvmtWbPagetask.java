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
@Table(name = "LVMT_WB_PAGETASK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbPagetask.findAll", query = "SELECT l FROM LvmtWbPagetask l"),
    @NamedQuery(name = "LvmtWbPagetask.findByUserrolecode", query = "SELECT l FROM LvmtWbPagetask l WHERE l.lvmtWbPagetaskPK.userrolecode = :userrolecode"),
    @NamedQuery(name = "LvmtWbPagetask.findByPagecode", query = "SELECT l FROM LvmtWbPagetask l WHERE l.lvmtWbPagetaskPK.pagecode = :pagecode"),
    @NamedQuery(name = "LvmtWbPagetask.findByTaskcode", query = "SELECT l FROM LvmtWbPagetask l WHERE l.lvmtWbPagetaskPK.taskcode = :taskcode"),
    @NamedQuery(name = "LvmtWbPagetask.findByLastupdateduser", query = "SELECT l FROM LvmtWbPagetask l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtWbPagetask.findByLastupdatedtime", query = "SELECT l FROM LvmtWbPagetask l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtWbPagetask.findByCreatetime", query = "SELECT l FROM LvmtWbPagetask l WHERE l.createtime = :createtime"),
    @NamedQuery(name = "LvmtWbPagetask.findByInstitute", query = "SELECT l FROM LvmtWbPagetask l WHERE l.institute = :institute")})
public class LvmtWbPagetask implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LvmtWbPagetaskPK lvmtWbPagetaskPK;
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

    public LvmtWbPagetask() {
    }

    public LvmtWbPagetask(LvmtWbPagetaskPK lvmtWbPagetaskPK) {
        this.lvmtWbPagetaskPK = lvmtWbPagetaskPK;
    }

    public LvmtWbPagetask(LvmtWbPagetaskPK lvmtWbPagetaskPK, Date lastupdatedtime, Date createtime) {
        this.lvmtWbPagetaskPK = lvmtWbPagetaskPK;
        this.lastupdatedtime = lastupdatedtime;
        this.createtime = createtime;
    }

    public LvmtWbPagetask(String userrolecode, String pagecode, String taskcode) {
        this.lvmtWbPagetaskPK = new LvmtWbPagetaskPK(userrolecode, pagecode, taskcode);
    }

    public LvmtWbPagetaskPK getLvmtWbPagetaskPK() {
        return lvmtWbPagetaskPK;
    }

    public void setLvmtWbPagetaskPK(LvmtWbPagetaskPK lvmtWbPagetaskPK) {
        this.lvmtWbPagetaskPK = lvmtWbPagetaskPK;
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
        hash += (lvmtWbPagetaskPK != null ? lvmtWbPagetaskPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtWbPagetask)) {
            return false;
        }
        LvmtWbPagetask other = (LvmtWbPagetask) object;
        if ((this.lvmtWbPagetaskPK == null && other.lvmtWbPagetaskPK != null) || (this.lvmtWbPagetaskPK != null && !this.lvmtWbPagetaskPK.equals(other.lvmtWbPagetaskPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbPagetask[ lvmtWbPagetaskPK=" + lvmtWbPagetaskPK + " ]";
    }
    
}
