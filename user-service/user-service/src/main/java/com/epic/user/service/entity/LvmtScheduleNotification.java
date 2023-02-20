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
@Table(name = "LVMT_SCHEDULE_NOTIFICATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtScheduleNotification.findAll", query = "SELECT l FROM LvmtScheduleNotification l"),
    @NamedQuery(name = "LvmtScheduleNotification.findById", query = "SELECT l FROM LvmtScheduleNotification l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtScheduleNotification.findByTitle", query = "SELECT l FROM LvmtScheduleNotification l WHERE l.title = :title"),
    @NamedQuery(name = "LvmtScheduleNotification.findByContent", query = "SELECT l FROM LvmtScheduleNotification l WHERE l.content = :content"),
    @NamedQuery(name = "LvmtScheduleNotification.findByType", query = "SELECT l FROM LvmtScheduleNotification l WHERE l.type = :type"),
    @NamedQuery(name = "LvmtScheduleNotification.findByFrequency", query = "SELECT l FROM LvmtScheduleNotification l WHERE l.frequency = :frequency"),
    @NamedQuery(name = "LvmtScheduleNotification.findByFromdate", query = "SELECT l FROM LvmtScheduleNotification l WHERE l.fromdate = :fromdate"),
    @NamedQuery(name = "LvmtScheduleNotification.findByTodate", query = "SELECT l FROM LvmtScheduleNotification l WHERE l.todate = :todate"),
    @NamedQuery(name = "LvmtScheduleNotification.findByCreatedtime", query = "SELECT l FROM LvmtScheduleNotification l WHERE l.createdtime = :createdtime"),
    @NamedQuery(name = "LvmtScheduleNotification.findByLastupdatedtime", query = "SELECT l FROM LvmtScheduleNotification l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtScheduleNotification.findByLastupdateduser", query = "SELECT l FROM LvmtScheduleNotification l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtScheduleNotification.findByNextSendDate", query = "SELECT l FROM LvmtScheduleNotification l WHERE l.nextSendDate = :nextSendDate"),
    @NamedQuery(name = "LvmtScheduleNotification.findByStartTime", query = "SELECT l FROM LvmtScheduleNotification l WHERE l.startTime = :startTime")})
public class LvmtScheduleNotification implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @Column(name = "CONTENT")
    private String content;
    @Basic(optional = false)
    @Column(name = "TYPE")
    private String type;
    @Basic(optional = false)
    @Column(name = "FREQUENCY")
    private String frequency;
    @Column(name = "FROMDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromdate;
    @Column(name = "TODATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date todate;
    @Column(name = "CREATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdtime;
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Column(name = "LASTUPDATEDUSER")
    private String lastupdateduser;
    @Column(name = "NEXT_SEND_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nextSendDate;
    @Column(name = "START_TIME")
    private String startTime;
    @JoinColumn(name = "GROUP_ID", referencedColumnName = "GROUP_ID")
    @ManyToOne
    private LvmtCustomerGroup groupId;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;

    public LvmtScheduleNotification() {
    }

    public LvmtScheduleNotification(BigDecimal id) {
        this.id = id;
    }

    public LvmtScheduleNotification(BigDecimal id, String title, String content, String type, String frequency) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.type = type;
        this.frequency = frequency;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
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

    public Date getNextSendDate() {
        return nextSendDate;
    }

    public void setNextSendDate(Date nextSendDate) {
        this.nextSendDate = nextSendDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public LvmtCustomerGroup getGroupId() {
        return groupId;
    }

    public void setGroupId(LvmtCustomerGroup groupId) {
        this.groupId = groupId;
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
        if (!(object instanceof LvmtScheduleNotification)) {
            return false;
        }
        LvmtScheduleNotification other = (LvmtScheduleNotification) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtScheduleNotification[ id=" + id + " ]";
    }
    
}
