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
@Table(name = "LVMT_SWT_EOD_SCHEDULE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtEodSchedule.findAll", query = "SELECT l FROM LvmtSwtEodSchedule l"),
    @NamedQuery(name = "LvmtSwtEodSchedule.findById", query = "SELECT l FROM LvmtSwtEodSchedule l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtSwtEodSchedule.findByPreviousDate", query = "SELECT l FROM LvmtSwtEodSchedule l WHERE l.previousDate = :previousDate"),
    @NamedQuery(name = "LvmtSwtEodSchedule.findByBusinessDate", query = "SELECT l FROM LvmtSwtEodSchedule l WHERE l.businessDate = :businessDate"),
    @NamedQuery(name = "LvmtSwtEodSchedule.findByProcessingFlag", query = "SELECT l FROM LvmtSwtEodSchedule l WHERE l.processingFlag = :processingFlag")})
public class LvmtSwtEodSchedule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "PREVIOUS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date previousDate;
    @Basic(optional = false)
    @Column(name = "BUSINESS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date businessDate;
    @Basic(optional = false)
    @Column(name = "PROCESSING_FLAG")
    private String processingFlag;

    public LvmtSwtEodSchedule() {
    }

    public LvmtSwtEodSchedule(String id) {
        this.id = id;
    }

    public LvmtSwtEodSchedule(String id, Date previousDate, Date businessDate, String processingFlag) {
        this.id = id;
        this.previousDate = previousDate;
        this.businessDate = businessDate;
        this.processingFlag = processingFlag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getPreviousDate() {
        return previousDate;
    }

    public void setPreviousDate(Date previousDate) {
        this.previousDate = previousDate;
    }

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    public String getProcessingFlag() {
        return processingFlag;
    }

    public void setProcessingFlag(String processingFlag) {
        this.processingFlag = processingFlag;
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
        if (!(object instanceof LvmtSwtEodSchedule)) {
            return false;
        }
        LvmtSwtEodSchedule other = (LvmtSwtEodSchedule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtEodSchedule[ id=" + id + " ]";
    }
    
}
