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
@Table(name = "LVMT_WB_PAGETASK_TEMPLATE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbPagetaskTemplate.findAll", query = "SELECT l FROM LvmtWbPagetaskTemplate l"),
    @NamedQuery(name = "LvmtWbPagetaskTemplate.findByPagecode", query = "SELECT l FROM LvmtWbPagetaskTemplate l WHERE l.lvmtWbPagetaskTemplatePK.pagecode = :pagecode"),
    @NamedQuery(name = "LvmtWbPagetaskTemplate.findByTaskcode", query = "SELECT l FROM LvmtWbPagetaskTemplate l WHERE l.lvmtWbPagetaskTemplatePK.taskcode = :taskcode"),
    @NamedQuery(name = "LvmtWbPagetaskTemplate.findByLastupdateduser", query = "SELECT l FROM LvmtWbPagetaskTemplate l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtWbPagetaskTemplate.findByLastupdatedtime", query = "SELECT l FROM LvmtWbPagetaskTemplate l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtWbPagetaskTemplate.findByCreatetime", query = "SELECT l FROM LvmtWbPagetaskTemplate l WHERE l.createtime = :createtime"),
    @NamedQuery(name = "LvmtWbPagetaskTemplate.findByInstitute", query = "SELECT l FROM LvmtWbPagetaskTemplate l WHERE l.institute = :institute")})
public class LvmtWbPagetaskTemplate implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LvmtWbPagetaskTemplatePK lvmtWbPagetaskTemplatePK;
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

    public LvmtWbPagetaskTemplate() {
    }

    public LvmtWbPagetaskTemplate(LvmtWbPagetaskTemplatePK lvmtWbPagetaskTemplatePK) {
        this.lvmtWbPagetaskTemplatePK = lvmtWbPagetaskTemplatePK;
    }

    public LvmtWbPagetaskTemplate(LvmtWbPagetaskTemplatePK lvmtWbPagetaskTemplatePK, Date lastupdatedtime, Date createtime) {
        this.lvmtWbPagetaskTemplatePK = lvmtWbPagetaskTemplatePK;
        this.lastupdatedtime = lastupdatedtime;
        this.createtime = createtime;
    }

    public LvmtWbPagetaskTemplate(String pagecode, String taskcode) {
        this.lvmtWbPagetaskTemplatePK = new LvmtWbPagetaskTemplatePK(pagecode, taskcode);
    }

    public LvmtWbPagetaskTemplatePK getLvmtWbPagetaskTemplatePK() {
        return lvmtWbPagetaskTemplatePK;
    }

    public void setLvmtWbPagetaskTemplatePK(LvmtWbPagetaskTemplatePK lvmtWbPagetaskTemplatePK) {
        this.lvmtWbPagetaskTemplatePK = lvmtWbPagetaskTemplatePK;
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
        hash += (lvmtWbPagetaskTemplatePK != null ? lvmtWbPagetaskTemplatePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtWbPagetaskTemplate)) {
            return false;
        }
        LvmtWbPagetaskTemplate other = (LvmtWbPagetaskTemplate) object;
        if ((this.lvmtWbPagetaskTemplatePK == null && other.lvmtWbPagetaskTemplatePK != null) || (this.lvmtWbPagetaskTemplatePK != null && !this.lvmtWbPagetaskTemplatePK.equals(other.lvmtWbPagetaskTemplatePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbPagetaskTemplate[ lvmtWbPagetaskTemplatePK=" + lvmtWbPagetaskTemplatePK + " ]";
    }
    
}
