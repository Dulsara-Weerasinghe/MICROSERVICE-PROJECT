/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "LVMT_CUSTOMER_GROUP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtCustomerGroup.findAll", query = "SELECT l FROM LvmtCustomerGroup l"),
    @NamedQuery(name = "LvmtCustomerGroup.findByGroupId", query = "SELECT l FROM LvmtCustomerGroup l WHERE l.groupId = :groupId"),
    @NamedQuery(name = "LvmtCustomerGroup.findByDescription", query = "SELECT l FROM LvmtCustomerGroup l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtCustomerGroup.findByStatus", query = "SELECT l FROM LvmtCustomerGroup l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtCustomerGroup.findByCreatedtime", query = "SELECT l FROM LvmtCustomerGroup l WHERE l.createdtime = :createdtime"),
    @NamedQuery(name = "LvmtCustomerGroup.findByLastupdatedtime", query = "SELECT l FROM LvmtCustomerGroup l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtCustomerGroup.findByLastupdateduser", query = "SELECT l FROM LvmtCustomerGroup l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtCustomerGroup.findByBulkRecord", query = "SELECT l FROM LvmtCustomerGroup l WHERE l.bulkRecord = :bulkRecord")})
public class LvmtCustomerGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "GROUP_ID")
    private BigDecimal groupId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "STATUS")
    private Long status;
    @Column(name = "CREATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdtime;
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Column(name = "LASTUPDATEDUSER")
    private String lastupdateduser;
    @Column(name = "BULK_RECORD")
    private Short bulkRecord;
    @OneToMany(mappedBy = "groupId")
    private List<LvmtCustomerGroupData> lvmtCustomerGroupDataList;
    @OneToMany(mappedBy = "groupId")
    private List<LvmtScheduleNotification> lvmtScheduleNotificationList;

    public LvmtCustomerGroup() {
    }

    public LvmtCustomerGroup(BigDecimal groupId) {
        this.groupId = groupId;
    }

    public BigDecimal getGroupId() {
        return groupId;
    }

    public void setGroupId(BigDecimal groupId) {
        this.groupId = groupId;
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

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public String getLastupdateduser() {
        return lastupdateduser;
    }

    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
    }

    public Short getBulkRecord() {
        return bulkRecord;
    }

    public void setBulkRecord(Short bulkRecord) {
        this.bulkRecord = bulkRecord;
    }

    @XmlTransient
    public List<LvmtCustomerGroupData> getLvmtCustomerGroupDataList() {
        return lvmtCustomerGroupDataList;
    }

    public void setLvmtCustomerGroupDataList(List<LvmtCustomerGroupData> lvmtCustomerGroupDataList) {
        this.lvmtCustomerGroupDataList = lvmtCustomerGroupDataList;
    }

    @XmlTransient
    public List<LvmtScheduleNotification> getLvmtScheduleNotificationList() {
        return lvmtScheduleNotificationList;
    }

    public void setLvmtScheduleNotificationList(List<LvmtScheduleNotification> lvmtScheduleNotificationList) {
        this.lvmtScheduleNotificationList = lvmtScheduleNotificationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupId != null ? groupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtCustomerGroup)) {
            return false;
        }
        LvmtCustomerGroup other = (LvmtCustomerGroup) object;
        if ((this.groupId == null && other.groupId != null) || (this.groupId != null && !this.groupId.equals(other.groupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtCustomerGroup[ groupId=" + groupId + " ]";
    }
    
}
