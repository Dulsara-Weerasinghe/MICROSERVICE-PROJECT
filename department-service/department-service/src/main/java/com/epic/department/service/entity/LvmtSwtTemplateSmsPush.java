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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "LVMT_SWT_TEMPLATE_SMS_PUSH")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtTemplateSmsPush.findAll", query = "SELECT l FROM LvmtSwtTemplateSmsPush l"),
    @NamedQuery(name = "LvmtSwtTemplateSmsPush.findById", query = "SELECT l FROM LvmtSwtTemplateSmsPush l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtSwtTemplateSmsPush.findByDescription", query = "SELECT l FROM LvmtSwtTemplateSmsPush l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtSwtTemplateSmsPush.findByMessage", query = "SELECT l FROM LvmtSwtTemplateSmsPush l WHERE l.message = :message"),
    @NamedQuery(name = "LvmtSwtTemplateSmsPush.findByCreatedTime", query = "SELECT l FROM LvmtSwtTemplateSmsPush l WHERE l.createdTime = :createdTime"),
    @NamedQuery(name = "LvmtSwtTemplateSmsPush.findByLastUpdatedTime", query = "SELECT l FROM LvmtSwtTemplateSmsPush l WHERE l.lastUpdatedTime = :lastUpdatedTime"),
    @NamedQuery(name = "LvmtSwtTemplateSmsPush.findByLastUpdatedUser", query = "SELECT l FROM LvmtSwtTemplateSmsPush l WHERE l.lastUpdatedUser = :lastUpdatedUser")})
public class LvmtSwtTemplateSmsPush implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "MESSAGE")
    private String message;
    @Column(name = "CREATED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    @Column(name = "LAST_UPDATED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTime;
    @Column(name = "LAST_UPDATED_USER")
    private String lastUpdatedUser;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;

    public LvmtSwtTemplateSmsPush() {
    }

    public LvmtSwtTemplateSmsPush(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public String getLastUpdatedUser() {
        return lastUpdatedUser;
    }

    public void setLastUpdatedUser(String lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
    }

    public LvmtSwtMtStatus getStatus() {
        return status;
    }

    public void setStatus(LvmtSwtMtStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtTemplateSmsPush)) {
            return false;
        }
        LvmtSwtTemplateSmsPush other = (LvmtSwtTemplateSmsPush) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtTemplateSmsPush[ id=" + id + " ]";
    }
    
}
