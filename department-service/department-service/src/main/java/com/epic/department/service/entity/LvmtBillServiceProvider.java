/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "LVMT_BILL_SERVICE_PROVIDER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtBillServiceProvider.findAll", query = "SELECT l FROM LvmtBillServiceProvider l"),
    @NamedQuery(name = "LvmtBillServiceProvider.findByProviderId", query = "SELECT l FROM LvmtBillServiceProvider l WHERE l.providerId = :providerId"),
    @NamedQuery(name = "LvmtBillServiceProvider.findByProviderName", query = "SELECT l FROM LvmtBillServiceProvider l WHERE l.providerName = :providerName"),
    @NamedQuery(name = "LvmtBillServiceProvider.findByDescription", query = "SELECT l FROM LvmtBillServiceProvider l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtBillServiceProvider.findByImageUrl", query = "SELECT l FROM LvmtBillServiceProvider l WHERE l.imageUrl = :imageUrl"),
    @NamedQuery(name = "LvmtBillServiceProvider.findByDisplayName", query = "SELECT l FROM LvmtBillServiceProvider l WHERE l.displayName = :displayName"),
    @NamedQuery(name = "LvmtBillServiceProvider.findByCollectionAccount", query = "SELECT l FROM LvmtBillServiceProvider l WHERE l.collectionAccount = :collectionAccount"),
    @NamedQuery(name = "LvmtBillServiceProvider.findByCreatedtime", query = "SELECT l FROM LvmtBillServiceProvider l WHERE l.createdtime = :createdtime"),
    @NamedQuery(name = "LvmtBillServiceProvider.findByLastupdatedtime", query = "SELECT l FROM LvmtBillServiceProvider l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtBillServiceProvider.findByCurrency", query = "SELECT l FROM LvmtBillServiceProvider l WHERE l.currency = :currency"),
    @NamedQuery(name = "LvmtBillServiceProvider.findByCommissionType", query = "SELECT l FROM LvmtBillServiceProvider l WHERE l.commissionType = :commissionType"),
    @NamedQuery(name = "LvmtBillServiceProvider.findByCommissionAmount", query = "SELECT l FROM LvmtBillServiceProvider l WHERE l.commissionAmount = :commissionAmount"),
    @NamedQuery(name = "LvmtBillServiceProvider.findByCusCommission", query = "SELECT l FROM LvmtBillServiceProvider l WHERE l.cusCommission = :cusCommission"),
    @NamedQuery(name = "LvmtBillServiceProvider.findByValidation", query = "SELECT l FROM LvmtBillServiceProvider l WHERE l.validation = :validation"),
    @NamedQuery(name = "LvmtBillServiceProvider.findByBillCategoryCode", query = "SELECT l FROM LvmtBillServiceProvider l WHERE l.billCategoryCode = :billCategoryCode"),
    @NamedQuery(name = "LvmtBillServiceProvider.findByInappView", query = "SELECT l FROM LvmtBillServiceProvider l WHERE l.inappView = :inappView"),
    @NamedQuery(name = "LvmtBillServiceProvider.findByIsInapp", query = "SELECT l FROM LvmtBillServiceProvider l WHERE l.isInapp = :isInapp")})
public class LvmtBillServiceProvider implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROVIDER_ID")
    private String providerId;
    @Column(name = "PROVIDER_NAME")
    private String providerName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "IMAGE_URL")
    private String imageUrl;
    @Column(name = "DISPLAY_NAME")
    private String displayName;
    @Column(name = "COLLECTION_ACCOUNT")
    private String collectionAccount;
    @Column(name = "CREATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdtime;
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Column(name = "CURRENCY")
    private String currency;
    @Column(name = "COMMISSION_TYPE")
    private String commissionType;
    @Column(name = "COMMISSION_AMOUNT")
    private String commissionAmount;
    @Column(name = "CUS_COMMISSION")
    private Short cusCommission;
    @Column(name = "VALIDATION")
    private Short validation;
    @Column(name = "BILL_CATEGORY_CODE")
    private String billCategoryCode;
    @Column(name = "INAPP_VIEW")
    private Short inappView;
    @Column(name = "IS_INAPP")
    private Short isInapp;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "serviceProviderId")
    private List<LvmtBillProfile> lvmtBillProfileList;
    @OneToMany(mappedBy = "providerId")
    private List<LvmtBillCustomField> lvmtBillCustomFieldList;
    @OneToMany(mappedBy = "serviceProvider")
    private List<LvmtMerchant> lvmtMerchantList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lvmtBillServiceProvider")
    private List<LvmtBillLimit> lvmtBillLimitList;

    public LvmtBillServiceProvider() {
    }

    public LvmtBillServiceProvider(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getCollectionAccount() {
        return collectionAccount;
    }

    public void setCollectionAccount(String collectionAccount) {
        this.collectionAccount = collectionAccount;
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(String commissionType) {
        this.commissionType = commissionType;
    }

    public String getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(String commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public Short getCusCommission() {
        return cusCommission;
    }

    public void setCusCommission(Short cusCommission) {
        this.cusCommission = cusCommission;
    }

    public Short getValidation() {
        return validation;
    }

    public void setValidation(Short validation) {
        this.validation = validation;
    }

    public String getBillCategoryCode() {
        return billCategoryCode;
    }

    public void setBillCategoryCode(String billCategoryCode) {
        this.billCategoryCode = billCategoryCode;
    }

    public Short getInappView() {
        return inappView;
    }

    public void setInappView(Short inappView) {
        this.inappView = inappView;
    }

    public Short getIsInapp() {
        return isInapp;
    }

    public void setIsInapp(Short isInapp) {
        this.isInapp = isInapp;
    }

    public LvmtSwtMtStatus getStatus() {
        return status;
    }

    public void setStatus(LvmtSwtMtStatus status) {
        this.status = status;
    }

    @XmlTransient
    public List<LvmtBillProfile> getLvmtBillProfileList() {
        return lvmtBillProfileList;
    }

    public void setLvmtBillProfileList(List<LvmtBillProfile> lvmtBillProfileList) {
        this.lvmtBillProfileList = lvmtBillProfileList;
    }

    @XmlTransient
    public List<LvmtBillCustomField> getLvmtBillCustomFieldList() {
        return lvmtBillCustomFieldList;
    }

    public void setLvmtBillCustomFieldList(List<LvmtBillCustomField> lvmtBillCustomFieldList) {
        this.lvmtBillCustomFieldList = lvmtBillCustomFieldList;
    }

    @XmlTransient
    public List<LvmtMerchant> getLvmtMerchantList() {
        return lvmtMerchantList;
    }

    public void setLvmtMerchantList(List<LvmtMerchant> lvmtMerchantList) {
        this.lvmtMerchantList = lvmtMerchantList;
    }

    @XmlTransient
    public List<LvmtBillLimit> getLvmtBillLimitList() {
        return lvmtBillLimitList;
    }

    public void setLvmtBillLimitList(List<LvmtBillLimit> lvmtBillLimitList) {
        this.lvmtBillLimitList = lvmtBillLimitList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (providerId != null ? providerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtBillServiceProvider)) {
            return false;
        }
        LvmtBillServiceProvider other = (LvmtBillServiceProvider) object;
        if ((this.providerId == null && other.providerId != null) || (this.providerId != null && !this.providerId.equals(other.providerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtBillServiceProvider[ providerId=" + providerId + " ]";
    }
    
}
