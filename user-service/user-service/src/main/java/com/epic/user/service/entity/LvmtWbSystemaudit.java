/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "LVMT_WB_SYSTEMAUDIT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbSystemaudit.findAll", query = "SELECT l FROM LvmtWbSystemaudit l"),
    @NamedQuery(name = "LvmtWbSystemaudit.findBySystemauditid", query = "SELECT l FROM LvmtWbSystemaudit l WHERE l.systemauditid = :systemauditid"),
    @NamedQuery(name = "LvmtWbSystemaudit.findByUserrolecode", query = "SELECT l FROM LvmtWbSystemaudit l WHERE l.userrolecode = :userrolecode"),
    @NamedQuery(name = "LvmtWbSystemaudit.findByDescription", query = "SELECT l FROM LvmtWbSystemaudit l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtWbSystemaudit.findBySectioncode", query = "SELECT l FROM LvmtWbSystemaudit l WHERE l.sectioncode = :sectioncode"),
    @NamedQuery(name = "LvmtWbSystemaudit.findByPagecode", query = "SELECT l FROM LvmtWbSystemaudit l WHERE l.pagecode = :pagecode"),
    @NamedQuery(name = "LvmtWbSystemaudit.findByTaskcode", query = "SELECT l FROM LvmtWbSystemaudit l WHERE l.taskcode = :taskcode"),
    @NamedQuery(name = "LvmtWbSystemaudit.findByRemarks", query = "SELECT l FROM LvmtWbSystemaudit l WHERE l.remarks = :remarks"),
    @NamedQuery(name = "LvmtWbSystemaudit.findByIp", query = "SELECT l FROM LvmtWbSystemaudit l WHERE l.ip = :ip"),
    @NamedQuery(name = "LvmtWbSystemaudit.findByLastupdateduser", query = "SELECT l FROM LvmtWbSystemaudit l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtWbSystemaudit.findByLastupdatedtime", query = "SELECT l FROM LvmtWbSystemaudit l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtWbSystemaudit.findByCreatetime", query = "SELECT l FROM LvmtWbSystemaudit l WHERE l.createtime = :createtime"),
    @NamedQuery(name = "LvmtWbSystemaudit.findByOldvalue", query = "SELECT l FROM LvmtWbSystemaudit l WHERE l.oldvalue = :oldvalue"),
    @NamedQuery(name = "LvmtWbSystemaudit.findByNewvalue", query = "SELECT l FROM LvmtWbSystemaudit l WHERE l.newvalue = :newvalue"),
    @NamedQuery(name = "LvmtWbSystemaudit.findByInstitute", query = "SELECT l FROM LvmtWbSystemaudit l WHERE l.institute = :institute"),
    @NamedQuery(name = "LvmtWbSystemaudit.findByBranch", query = "SELECT l FROM LvmtWbSystemaudit l WHERE l.branch = :branch")})
public class LvmtWbSystemaudit implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "SYSTEMAUDITID")
    private BigDecimal systemauditid;
    @Basic(optional = false)
    @Column(name = "USERROLECODE")
    private String userrolecode;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "SECTIONCODE")
    private String sectioncode;
    @Column(name = "PAGECODE")
    private String pagecode;
    @Column(name = "TASKCODE")
    private String taskcode;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "IP")
    private String ip;
    @Column(name = "LASTUPDATEDUSER")
    private String lastupdateduser;
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Column(name = "CREATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    @Column(name = "OLDVALUE")
    private String oldvalue;
    @Column(name = "NEWVALUE")
    private String newvalue;
    @Column(name = "INSTITUTE")
    private String institute;
    @Column(name = "BRANCH")
    private String branch;

    public LvmtWbSystemaudit() {
    }

    public LvmtWbSystemaudit(BigDecimal systemauditid) {
        this.systemauditid = systemauditid;
    }

    public LvmtWbSystemaudit(BigDecimal systemauditid, String userrolecode, String description) {
        this.systemauditid = systemauditid;
        this.userrolecode = userrolecode;
        this.description = description;
    }

    public BigDecimal getSystemauditid() {
        return systemauditid;
    }

    public void setSystemauditid(BigDecimal systemauditid) {
        this.systemauditid = systemauditid;
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

    public String getSectioncode() {
        return sectioncode;
    }

    public void setSectioncode(String sectioncode) {
        this.sectioncode = sectioncode;
    }

    public String getPagecode() {
        return pagecode;
    }

    public void setPagecode(String pagecode) {
        this.pagecode = pagecode;
    }

    public String getTaskcode() {
        return taskcode;
    }

    public void setTaskcode(String taskcode) {
        this.taskcode = taskcode;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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

    public String getOldvalue() {
        return oldvalue;
    }

    public void setOldvalue(String oldvalue) {
        this.oldvalue = oldvalue;
    }

    public String getNewvalue() {
        return newvalue;
    }

    public void setNewvalue(String newvalue) {
        this.newvalue = newvalue;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (systemauditid != null ? systemauditid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtWbSystemaudit)) {
            return false;
        }
        LvmtWbSystemaudit other = (LvmtWbSystemaudit) object;
        if ((this.systemauditid == null && other.systemauditid != null) || (this.systemauditid != null && !this.systemauditid.equals(other.systemauditid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbSystemaudit[ systemauditid=" + systemauditid + " ]";
    }
    
}
