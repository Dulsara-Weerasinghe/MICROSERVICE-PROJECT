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
@Table(name = "LVMT_MCC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtMcc.findAll", query = "SELECT l FROM LvmtMcc l"),
    @NamedQuery(name = "LvmtMcc.findByMcccode", query = "SELECT l FROM LvmtMcc l WHERE l.mcccode = :mcccode"),
    @NamedQuery(name = "LvmtMcc.findByDescription", query = "SELECT l FROM LvmtMcc l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtMcc.findByLastupdateddate", query = "SELECT l FROM LvmtMcc l WHERE l.lastupdateddate = :lastupdateddate"),
    @NamedQuery(name = "LvmtMcc.findByCreatedtime", query = "SELECT l FROM LvmtMcc l WHERE l.createdtime = :createdtime"),
    @NamedQuery(name = "LvmtMcc.findByLastupdateduser", query = "SELECT l FROM LvmtMcc l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtMcc.findByMerCommFlatPercentage", query = "SELECT l FROM LvmtMcc l WHERE l.merCommFlatPercentage = :merCommFlatPercentage"),
    @NamedQuery(name = "LvmtMcc.findByMerCommAmount", query = "SELECT l FROM LvmtMcc l WHERE l.merCommAmount = :merCommAmount"),
    @NamedQuery(name = "LvmtMcc.findByCusScFlatPercentage", query = "SELECT l FROM LvmtMcc l WHERE l.cusScFlatPercentage = :cusScFlatPercentage"),
    @NamedQuery(name = "LvmtMcc.findByCusScCommAmount", query = "SELECT l FROM LvmtMcc l WHERE l.cusScCommAmount = :cusScCommAmount"),
    @NamedQuery(name = "LvmtMcc.findByMobView", query = "SELECT l FROM LvmtMcc l WHERE l.mobView = :mobView")})
public class LvmtMcc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MCCCODE")
    private String mcccode;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LASTUPDATEDDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdateddate;
    @Column(name = "CREATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdtime;
    @Column(name = "LASTUPDATEDUSER")
    private String lastupdateduser;
    @Column(name = "MER_COMM_FLAT_PERCENTAGE")
    private String merCommFlatPercentage;
    @Column(name = "MER_COMM_AMOUNT")
    private String merCommAmount;
    @Column(name = "CUS_SC_FLAT_PERCENTAGE")
    private String cusScFlatPercentage;
    @Column(name = "CUS_SC_COMM_AMOUNT")
    private String cusScCommAmount;
    @Column(name = "MOB_VIEW")
    private String mobView;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;

    public LvmtMcc() {
    }

    public LvmtMcc(String mcccode) {
        this.mcccode = mcccode;
    }

    public LvmtMcc(String mcccode, String description) {
        this.mcccode = mcccode;
        this.description = description;
    }

    public String getMcccode() {
        return mcccode;
    }

    public void setMcccode(String mcccode) {
        this.mcccode = mcccode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLastupdateddate() {
        return lastupdateddate;
    }

    public void setLastupdateddate(Date lastupdateddate) {
        this.lastupdateddate = lastupdateddate;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public String getLastupdateduser() {
        return lastupdateduser;
    }

    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
    }

    public String getMerCommFlatPercentage() {
        return merCommFlatPercentage;
    }

    public void setMerCommFlatPercentage(String merCommFlatPercentage) {
        this.merCommFlatPercentage = merCommFlatPercentage;
    }

    public String getMerCommAmount() {
        return merCommAmount;
    }

    public void setMerCommAmount(String merCommAmount) {
        this.merCommAmount = merCommAmount;
    }

    public String getCusScFlatPercentage() {
        return cusScFlatPercentage;
    }

    public void setCusScFlatPercentage(String cusScFlatPercentage) {
        this.cusScFlatPercentage = cusScFlatPercentage;
    }

    public String getCusScCommAmount() {
        return cusScCommAmount;
    }

    public void setCusScCommAmount(String cusScCommAmount) {
        this.cusScCommAmount = cusScCommAmount;
    }

    public String getMobView() {
        return mobView;
    }

    public void setMobView(String mobView) {
        this.mobView = mobView;
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
        hash += (mcccode != null ? mcccode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtMcc)) {
            return false;
        }
        LvmtMcc other = (LvmtMcc) object;
        if ((this.mcccode == null && other.mcccode != null) || (this.mcccode != null && !this.mcccode.equals(other.mcccode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtMcc[ mcccode=" + mcccode + " ]";
    }
    
}
