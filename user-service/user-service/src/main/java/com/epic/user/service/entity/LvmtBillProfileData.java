/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "LVMT_BILL_PROFILE_DATA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtBillProfileData.findAll", query = "SELECT l FROM LvmtBillProfileData l"),
    @NamedQuery(name = "LvmtBillProfileData.findByProfileId", query = "SELECT l FROM LvmtBillProfileData l WHERE l.lvmtBillProfileDataPK.profileId = :profileId"),
    @NamedQuery(name = "LvmtBillProfileData.findByCreatedDateTime", query = "SELECT l FROM LvmtBillProfileData l WHERE l.createdDateTime = :createdDateTime"),
    @NamedQuery(name = "LvmtBillProfileData.findByLastUpdatedDateTime", query = "SELECT l FROM LvmtBillProfileData l WHERE l.lastUpdatedDateTime = :lastUpdatedDateTime"),
    @NamedQuery(name = "LvmtBillProfileData.findByFieldId", query = "SELECT l FROM LvmtBillProfileData l WHERE l.lvmtBillProfileDataPK.fieldId = :fieldId"),
    @NamedQuery(name = "LvmtBillProfileData.findByFieldValue", query = "SELECT l FROM LvmtBillProfileData l WHERE l.fieldValue = :fieldValue")})
public class LvmtBillProfileData implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LvmtBillProfileDataPK lvmtBillProfileDataPK;
    @Column(name = "CREATED_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;
    @Column(name = "LAST_UPDATED_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDateTime;
    @Column(name = "FIELD_VALUE")
    private String fieldValue;

    public LvmtBillProfileData() {
    }

    public LvmtBillProfileData(LvmtBillProfileDataPK lvmtBillProfileDataPK) {
        this.lvmtBillProfileDataPK = lvmtBillProfileDataPK;
    }

    public LvmtBillProfileData(BigInteger profileId, BigInteger fieldId) {
        this.lvmtBillProfileDataPK = new LvmtBillProfileDataPK(profileId, fieldId);
    }

    public LvmtBillProfileDataPK getLvmtBillProfileDataPK() {
        return lvmtBillProfileDataPK;
    }

    public void setLvmtBillProfileDataPK(LvmtBillProfileDataPK lvmtBillProfileDataPK) {
        this.lvmtBillProfileDataPK = lvmtBillProfileDataPK;
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

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lvmtBillProfileDataPK != null ? lvmtBillProfileDataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtBillProfileData)) {
            return false;
        }
        LvmtBillProfileData other = (LvmtBillProfileData) object;
        if ((this.lvmtBillProfileDataPK == null && other.lvmtBillProfileDataPK != null) || (this.lvmtBillProfileDataPK != null && !this.lvmtBillProfileDataPK.equals(other.lvmtBillProfileDataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtBillProfileData[ lvmtBillProfileDataPK=" + lvmtBillProfileDataPK + " ]";
    }
    
}
