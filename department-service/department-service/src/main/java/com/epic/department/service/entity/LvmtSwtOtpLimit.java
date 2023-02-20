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
@Table(name = "LVMT_SWT_OTP_LIMIT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtOtpLimit.findAll", query = "SELECT l FROM LvmtSwtOtpLimit l"),
    @NamedQuery(name = "LvmtSwtOtpLimit.findByMobileno", query = "SELECT l FROM LvmtSwtOtpLimit l WHERE l.mobileno = :mobileno"),
    @NamedQuery(name = "LvmtSwtOtpLimit.findByCreatedTime", query = "SELECT l FROM LvmtSwtOtpLimit l WHERE l.createdTime = :createdTime")})
public class LvmtSwtOtpLimit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MOBILENO")
    private String mobileno;
    @Column(name = "CREATED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;

    public LvmtSwtOtpLimit() {
    }

    public LvmtSwtOtpLimit(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mobileno != null ? mobileno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtOtpLimit)) {
            return false;
        }
        LvmtSwtOtpLimit other = (LvmtSwtOtpLimit) object;
        if ((this.mobileno == null && other.mobileno != null) || (this.mobileno != null && !this.mobileno.equals(other.mobileno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtOtpLimit[ mobileno=" + mobileno + " ]";
    }
    
}
