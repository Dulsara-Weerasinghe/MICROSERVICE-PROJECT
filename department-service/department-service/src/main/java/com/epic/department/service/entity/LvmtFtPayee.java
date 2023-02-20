/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "LVMT_FT_PAYEE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtFtPayee.findAll", query = "SELECT l FROM LvmtFtPayee l"),
    @NamedQuery(name = "LvmtFtPayee.findByDeviceId", query = "SELECT l FROM LvmtFtPayee l WHERE l.lvmtFtPayeePK.deviceId = :deviceId"),
    @NamedQuery(name = "LvmtFtPayee.findByStatus", query = "SELECT l FROM LvmtFtPayee l WHERE l.lvmtFtPayeePK.status = :status"),
    @NamedQuery(name = "LvmtFtPayee.findByCreatedDate", query = "SELECT l FROM LvmtFtPayee l WHERE l.createdDate = :createdDate"),
    @NamedQuery(name = "LvmtFtPayee.findByAccNo", query = "SELECT l FROM LvmtFtPayee l WHERE l.lvmtFtPayeePK.accNo = :accNo"),
    @NamedQuery(name = "LvmtFtPayee.findByBankCode", query = "SELECT l FROM LvmtFtPayee l WHERE l.lvmtFtPayeePK.bankCode = :bankCode"),
    @NamedQuery(name = "LvmtFtPayee.findByNickName", query = "SELECT l FROM LvmtFtPayee l WHERE l.nickName = :nickName"),
    @NamedQuery(name = "LvmtFtPayee.findByCreatedDateTime", query = "SELECT l FROM LvmtFtPayee l WHERE l.createdDateTime = :createdDateTime"),
    @NamedQuery(name = "LvmtFtPayee.findByLastUpdatedDateTime", query = "SELECT l FROM LvmtFtPayee l WHERE l.lastUpdatedDateTime = :lastUpdatedDateTime"),
    @NamedQuery(name = "LvmtFtPayee.findByPayeeId", query = "SELECT l FROM LvmtFtPayee l WHERE l.payeeId = :payeeId"),
    @NamedQuery(name = "LvmtFtPayee.findByFavourite", query = "SELECT l FROM LvmtFtPayee l WHERE l.favourite = :favourite"),
    @NamedQuery(name = "LvmtFtPayee.findByBeneficiaryName", query = "SELECT l FROM LvmtFtPayee l WHERE l.beneficiaryName = :beneficiaryName"),
    @NamedQuery(name = "LvmtFtPayee.findByAccType", query = "SELECT l FROM LvmtFtPayee l WHERE l.accType = :accType")})
public class LvmtFtPayee implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LvmtFtPayeePK lvmtFtPayeePK;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "NICK_NAME")
    private String nickName;
    @Column(name = "CREATED_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;
    @Column(name = "LAST_UPDATED_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDateTime;
    @Column(name = "PAYEE_ID")
    private BigInteger payeeId;
    @Column(name = "FAVOURITE")
    private String favourite;
    @Column(name = "BENEFICIARY_NAME")
    private String beneficiaryName;
    @Column(name = "ACC_TYPE")
    private String accType;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private LvmtSwtMtStatus lvmtSwtMtStatus;

    public LvmtFtPayee() {
    }

    public LvmtFtPayee(LvmtFtPayeePK lvmtFtPayeePK) {
        this.lvmtFtPayeePK = lvmtFtPayeePK;
    }

    public LvmtFtPayee(long deviceId, long status, String accNo, String bankCode) {
        this.lvmtFtPayeePK = new LvmtFtPayeePK(deviceId, status, accNo, bankCode);
    }

    public LvmtFtPayeePK getLvmtFtPayeePK() {
        return lvmtFtPayeePK;
    }

    public void setLvmtFtPayeePK(LvmtFtPayeePK lvmtFtPayeePK) {
        this.lvmtFtPayeePK = lvmtFtPayeePK;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public Date getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    public void setLastUpdatedDateTime(Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    public BigInteger getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(BigInteger payeeId) {
        this.payeeId = payeeId;
    }

    public String getFavourite() {
        return favourite;
    }

    public void setFavourite(String favourite) {
        this.favourite = favourite;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
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
        hash += (lvmtFtPayeePK != null ? lvmtFtPayeePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtFtPayee)) {
            return false;
        }
        LvmtFtPayee other = (LvmtFtPayee) object;
        if ((this.lvmtFtPayeePK == null && other.lvmtFtPayeePK != null) || (this.lvmtFtPayeePK != null && !this.lvmtFtPayeePK.equals(other.lvmtFtPayeePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtFtPayee[ lvmtFtPayeePK=" + lvmtFtPayeePK + " ]";
    }
    
}
