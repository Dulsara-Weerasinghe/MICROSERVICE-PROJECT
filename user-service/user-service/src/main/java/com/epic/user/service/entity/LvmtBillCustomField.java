/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_BILL_CUSTOM_FIELD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtBillCustomField.findAll", query = "SELECT l FROM LvmtBillCustomField l"),
    @NamedQuery(name = "LvmtBillCustomField.findByFieldId", query = "SELECT l FROM LvmtBillCustomField l WHERE l.fieldId = :fieldId"),
    @NamedQuery(name = "LvmtBillCustomField.findByFieldValue", query = "SELECT l FROM LvmtBillCustomField l WHERE l.fieldValue = :fieldValue"),
    @NamedQuery(name = "LvmtBillCustomField.findByFieldName", query = "SELECT l FROM LvmtBillCustomField l WHERE l.fieldName = :fieldName"),
    @NamedQuery(name = "LvmtBillCustomField.findByFieldValidation", query = "SELECT l FROM LvmtBillCustomField l WHERE l.fieldValidation = :fieldValidation"),
    @NamedQuery(name = "LvmtBillCustomField.findByFieldLength", query = "SELECT l FROM LvmtBillCustomField l WHERE l.fieldLength = :fieldLength"),
    @NamedQuery(name = "LvmtBillCustomField.findByPlaceHolder", query = "SELECT l FROM LvmtBillCustomField l WHERE l.placeHolder = :placeHolder"),
    @NamedQuery(name = "LvmtBillCustomField.findBySendsms", query = "SELECT l FROM LvmtBillCustomField l WHERE l.sendsms = :sendsms")})
public class LvmtBillCustomField implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "FIELD_ID")
    private BigDecimal fieldId;
    @Column(name = "FIELD_VALUE")
    private String fieldValue;
    @Column(name = "FIELD_NAME")
    private String fieldName;
    @Column(name = "FIELD_VALIDATION")
    private String fieldValidation;
    @Column(name = "FIELD_LENGTH")
    private String fieldLength;
    @Column(name = "PLACE_HOLDER")
    private String placeHolder;
    @Column(name = "SENDSMS")
    private Short sendsms;
    @JoinColumn(name = "PROVIDER_ID", referencedColumnName = "PROVIDER_ID")
    @ManyToOne
    private LvmtBillServiceProvider providerId;

    public LvmtBillCustomField() {
    }

    public LvmtBillCustomField(BigDecimal fieldId) {
        this.fieldId = fieldId;
    }

    public BigDecimal getFieldId() {
        return fieldId;
    }

    public void setFieldId(BigDecimal fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValidation() {
        return fieldValidation;
    }

    public void setFieldValidation(String fieldValidation) {
        this.fieldValidation = fieldValidation;
    }

    public String getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(String fieldLength) {
        this.fieldLength = fieldLength;
    }

    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
    }

    public Short getSendsms() {
        return sendsms;
    }

    public void setSendsms(Short sendsms) {
        this.sendsms = sendsms;
    }

    public LvmtBillServiceProvider getProviderId() {
        return providerId;
    }

    public void setProviderId(LvmtBillServiceProvider providerId) {
        this.providerId = providerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldId != null ? fieldId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtBillCustomField)) {
            return false;
        }
        LvmtBillCustomField other = (LvmtBillCustomField) object;
        if ((this.fieldId == null && other.fieldId != null) || (this.fieldId != null && !this.fieldId.equals(other.fieldId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtBillCustomField[ fieldId=" + fieldId + " ]";
    }
    
}
