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
@Table(name = "LVMT_SWT_MO_ERROR_ALERTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtMoErrorAlerts.findAll", query = "SELECT l FROM LvmtSwtMoErrorAlerts l"),
    @NamedQuery(name = "LvmtSwtMoErrorAlerts.findById", query = "SELECT l FROM LvmtSwtMoErrorAlerts l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtSwtMoErrorAlerts.findByRiskLevel", query = "SELECT l FROM LvmtSwtMoErrorAlerts l WHERE l.riskLevel = :riskLevel"),
    @NamedQuery(name = "LvmtSwtMoErrorAlerts.findBySystemCategory", query = "SELECT l FROM LvmtSwtMoErrorAlerts l WHERE l.systemCategory = :systemCategory"),
    @NamedQuery(name = "LvmtSwtMoErrorAlerts.findByDescription", query = "SELECT l FROM LvmtSwtMoErrorAlerts l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtSwtMoErrorAlerts.findByInstitute", query = "SELECT l FROM LvmtSwtMoErrorAlerts l WHERE l.institute = :institute"),
    @NamedQuery(name = "LvmtSwtMoErrorAlerts.findByReadStatus", query = "SELECT l FROM LvmtSwtMoErrorAlerts l WHERE l.readStatus = :readStatus"),
    @NamedQuery(name = "LvmtSwtMoErrorAlerts.findByCreatetime", query = "SELECT l FROM LvmtSwtMoErrorAlerts l WHERE l.createtime = :createtime")})
public class LvmtSwtMoErrorAlerts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "RISK_LEVEL")
    private Long riskLevel;
    @Column(name = "SYSTEM_CATEGORY")
    private Long systemCategory;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "INSTITUTE")
    private String institute;
    @Column(name = "READ_STATUS")
    private Long readStatus;
    @Basic(optional = false)
    @Column(name = "CREATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;

    public LvmtSwtMoErrorAlerts() {
    }

    public LvmtSwtMoErrorAlerts(Long id) {
        this.id = id;
    }

    public LvmtSwtMoErrorAlerts(Long id, Date createtime) {
        this.id = id;
        this.createtime = createtime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Long riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Long getSystemCategory() {
        return systemCategory;
    }

    public void setSystemCategory(Long systemCategory) {
        this.systemCategory = systemCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public Long getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(Long readStatus) {
        this.readStatus = readStatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
        if (!(object instanceof LvmtSwtMoErrorAlerts)) {
            return false;
        }
        LvmtSwtMoErrorAlerts other = (LvmtSwtMoErrorAlerts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtMoErrorAlerts[ id=" + id + " ]";
    }
    
}
