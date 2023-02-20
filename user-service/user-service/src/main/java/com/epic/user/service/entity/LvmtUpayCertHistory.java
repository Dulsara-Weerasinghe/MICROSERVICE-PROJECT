/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_UPAY_CERT_HISTORY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtUpayCertHistory.findAll", query = "SELECT l FROM LvmtUpayCertHistory l"),
    @NamedQuery(name = "LvmtUpayCertHistory.findById", query = "SELECT l FROM LvmtUpayCertHistory l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtUpayCertHistory.findBySignCertId", query = "SELECT l FROM LvmtUpayCertHistory l WHERE l.signCertId = :signCertId"),
    @NamedQuery(name = "LvmtUpayCertHistory.findByEncryCertId", query = "SELECT l FROM LvmtUpayCertHistory l WHERE l.encryCertId = :encryCertId"),
    @NamedQuery(name = "LvmtUpayCertHistory.findByCreatedDatetime", query = "SELECT l FROM LvmtUpayCertHistory l WHERE l.createdDatetime = :createdDatetime"),
    @NamedQuery(name = "LvmtUpayCertHistory.findByLastUpdatedtime", query = "SELECT l FROM LvmtUpayCertHistory l WHERE l.lastUpdatedtime = :lastUpdatedtime"),
    @NamedQuery(name = "LvmtUpayCertHistory.findByStatus", query = "SELECT l FROM LvmtUpayCertHistory l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtUpayCertHistory.findBySignAlias", query = "SELECT l FROM LvmtUpayCertHistory l WHERE l.signAlias = :signAlias"),
    @NamedQuery(name = "LvmtUpayCertHistory.findByEncAlias", query = "SELECT l FROM LvmtUpayCertHistory l WHERE l.encAlias = :encAlias")})
public class LvmtUpayCertHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "SIGN_CERT_ID")
    private String signCertId;
    @Column(name = "ENCRY_CERT_ID")
    private String encryCertId;
    @Column(name = "CREATED_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDatetime;
    @Column(name = "LAST_UPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedtime;
    @Column(name = "STATUS")
    private BigInteger status;
    @Column(name = "SIGN_ALIAS")
    private String signAlias;
    @Column(name = "ENC_ALIAS")
    private String encAlias;
    @Lob
    @Column(name = "SIGN_CERT_NAME")
    private String signCertName;
    @Lob
    @Column(name = "ENC_CERT_NAME")
    private String encCertName;
    @JoinColumn(name = "ID", referencedColumnName = "CODE", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private LvmtSwtMtStatus lvmtSwtMtStatus;

    public LvmtUpayCertHistory() {
    }

    public LvmtUpayCertHistory(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getSignCertId() {
        return signCertId;
    }

    public void setSignCertId(String signCertId) {
        this.signCertId = signCertId;
    }

    public String getEncryCertId() {
        return encryCertId;
    }

    public void setEncryCertId(String encryCertId) {
        this.encryCertId = encryCertId;
    }

    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public Date getLastUpdatedtime() {
        return lastUpdatedtime;
    }

    public void setLastUpdatedtime(Date lastUpdatedtime) {
        this.lastUpdatedtime = lastUpdatedtime;
    }

    public BigInteger getStatus() {
        return status;
    }

    public void setStatus(BigInteger status) {
        this.status = status;
    }

    public String getSignAlias() {
        return signAlias;
    }

    public void setSignAlias(String signAlias) {
        this.signAlias = signAlias;
    }

    public String getEncAlias() {
        return encAlias;
    }

    public void setEncAlias(String encAlias) {
        this.encAlias = encAlias;
    }

    public String getSignCertName() {
        return signCertName;
    }

    public void setSignCertName(String signCertName) {
        this.signCertName = signCertName;
    }

    public String getEncCertName() {
        return encCertName;
    }

    public void setEncCertName(String encCertName) {
        this.encCertName = encCertName;
    }

    public LvmtSwtMtStatus getLvmtSwtMtStatus() {
        return lvmtSwtMtStatus;
    }

    public void setLvmtSwtMtStatus(LvmtSwtMtStatus lvmtSwtMtStatus) {
        this.lvmtSwtMtStatus = lvmtSwtMtStatus;
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
        if (!(object instanceof LvmtUpayCertHistory)) {
            return false;
        }
        LvmtUpayCertHistory other = (LvmtUpayCertHistory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtUpayCertHistory[ id=" + id + " ]";
    }
    
}
