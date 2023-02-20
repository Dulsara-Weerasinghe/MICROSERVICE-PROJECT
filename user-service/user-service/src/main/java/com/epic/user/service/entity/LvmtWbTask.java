/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_WB_TASK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbTask.findAll", query = "SELECT l FROM LvmtWbTask l"),
    @NamedQuery(name = "LvmtWbTask.findByTaskcode", query = "SELECT l FROM LvmtWbTask l WHERE l.taskcode = :taskcode"),
    @NamedQuery(name = "LvmtWbTask.findByDescription", query = "SELECT l FROM LvmtWbTask l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtWbTask.findByStatus", query = "SELECT l FROM LvmtWbTask l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtWbTask.findByLastupdateduser", query = "SELECT l FROM LvmtWbTask l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtWbTask.findByLastupdatedtime", query = "SELECT l FROM LvmtWbTask l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtWbTask.findByCreatedtime", query = "SELECT l FROM LvmtWbTask l WHERE l.createdtime = :createdtime"),
    @NamedQuery(name = "LvmtWbTask.findBySortkey", query = "SELECT l FROM LvmtWbTask l WHERE l.sortkey = :sortkey"),
    @NamedQuery(name = "LvmtWbTask.findByInstitute", query = "SELECT l FROM LvmtWbTask l WHERE l.institute = :institute")})
public class LvmtWbTask implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TASKCODE")
    private String taskcode;
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
    @OneToMany(mappedBy = "task")
    private List<LvmtWbPendingtask> lvmtWbPendingtaskList;

    public LvmtWbTask() {
    }

    public LvmtWbTask(String taskcode) {
        this.taskcode = taskcode;
    }

    public LvmtWbTask(String taskcode, Date lastupdatedtime, Date createdtime) {
        this.taskcode = taskcode;
        this.lastupdatedtime = lastupdatedtime;
        this.createdtime = createdtime;
    }

    public String getTaskcode() {
        return taskcode;
    }

    public void setTaskcode(String taskcode) {
        this.taskcode = taskcode;
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

    @XmlTransient
    public List<LvmtWbPendingtask> getLvmtWbPendingtaskList() {
        return lvmtWbPendingtaskList;
    }

    public void setLvmtWbPendingtaskList(List<LvmtWbPendingtask> lvmtWbPendingtaskList) {
        this.lvmtWbPendingtaskList = lvmtWbPendingtaskList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taskcode != null ? taskcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtWbTask)) {
            return false;
        }
        LvmtWbTask other = (LvmtWbTask) object;
        if ((this.taskcode == null && other.taskcode != null) || (this.taskcode != null && !this.taskcode.equals(other.taskcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbTask[ taskcode=" + taskcode + " ]";
    }
    
}
