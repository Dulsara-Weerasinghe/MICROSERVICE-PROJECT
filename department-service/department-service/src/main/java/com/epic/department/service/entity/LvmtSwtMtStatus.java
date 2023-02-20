/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_SWT_MT_STATUS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtMtStatus.findAll", query = "SELECT l FROM LvmtSwtMtStatus l"),
    @NamedQuery(name = "LvmtSwtMtStatus.findByCode", query = "SELECT l FROM LvmtSwtMtStatus l WHERE l.code = :code"),
    @NamedQuery(name = "LvmtSwtMtStatus.findByDescription", query = "SELECT l FROM LvmtSwtMtStatus l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtSwtMtStatus.findByCategoryCode", query = "SELECT l FROM LvmtSwtMtStatus l WHERE l.categoryCode = :categoryCode")})
public class LvmtSwtMtStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODE")
    private Long code;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "CATEGORY_CODE")
    private long categoryCode;
    @OneToMany(mappedBy = "status")
    private List<LvmtMerchantChannelType> lvmtMerchantChannelTypeList;
    @OneToMany(mappedBy = "status")
    private List<LvmtSwtMoPromotion> lvmtSwtMoPromotionList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "lvmtSwtMtStatus")
    private LvmtUpayCertHistory lvmtUpayCertHistory;
    @OneToMany(mappedBy = "status")
    private List<LvmtEpicCommissionType> lvmtEpicCommissionTypeList;
    @OneToMany(mappedBy = "status")
    private List<LvmtMobImgPromotion> lvmtMobImgPromotionList;
    @OneToMany(mappedBy = "status")
    private List<LvmtBillCategory> lvmtBillCategoryList;
    @OneToMany(mappedBy = "status")
    private List<LvmtMerchantCustomer> lvmtMerchantCustomerList;
    @OneToMany(mappedBy = "status")
    private List<LvmtProductRule> lvmtProductRuleList;
    @OneToMany(mappedBy = "status")
    private List<LvmtBillServiceProvider> lvmtBillServiceProviderList;
    @OneToMany(mappedBy = "status")
    private List<LvmtWbPendingtask> lvmtWbPendingtaskList;
    @OneToMany(mappedBy = "statuscode")
    private List<LvmtWbPortaluser> lvmtWbPortaluserList;
    @OneToMany(mappedBy = "status")
    private List<LvmtTerminalRequest> lvmtTerminalRequestList;
    @OneToMany(mappedBy = "status")
    private List<LvmtTerms123> lvmtTerms123List;
    @OneToMany(mappedBy = "status")
    private List<LvmtTerms> lvmtTermsList;
    @OneToMany(mappedBy = "status")
    private List<LvmtMcc> lvmtMccList;
    @OneToMany(mappedBy = "status")
    private List<LvmtSwtOtp> lvmtSwtOtpList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "status")
    private List<LvmtBillProfile> lvmtBillProfileList;
    @OneToMany(mappedBy = "status")
    private List<LvmtJpRequests> lvmtJpRequestsList;
    @OneToMany(mappedBy = "status")
    private List<LvmtSwtMtQuestion> lvmtSwtMtQuestionList;
    @OneToMany(mappedBy = "status")
    private List<LvmtBranch> lvmtBranchList;
    @OneToMany(mappedBy = "status")
    private List<LvmtTerminal> lvmtTerminalList;
    @OneToMany(mappedBy = "status")
    private List<LvmtQrChannel> lvmtQrChannelList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lvmtSwtMtStatus")
    private List<LvmtFtPayee> lvmtFtPayeeList;
    @OneToMany(mappedBy = "status")
    private List<LvmtSwtTxnLimit> lvmtSwtTxnLimitList;
    @OneToMany(mappedBy = "status")
    private List<LvmtJpChallangeReqHistory> lvmtJpChallangeReqHistoryList;
    @OneToMany(mappedBy = "status")
    private List<LvmtSwtTemplateSmsPush> lvmtSwtTemplateSmsPushList;
    @OneToMany(mappedBy = "status")
    private List<LvmtScheduleNotification> lvmtScheduleNotificationList;

    public LvmtSwtMtStatus() {
    }

    public LvmtSwtMtStatus(Long code) {
        this.code = code;
    }

    public LvmtSwtMtStatus(Long code, String description, long categoryCode) {
        this.code = code;
        this.description = description;
        this.categoryCode = categoryCode;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(long categoryCode) {
        this.categoryCode = categoryCode;
    }

    @XmlTransient
    public List<LvmtMerchantChannelType> getLvmtMerchantChannelTypeList() {
        return lvmtMerchantChannelTypeList;
    }

    public void setLvmtMerchantChannelTypeList(List<LvmtMerchantChannelType> lvmtMerchantChannelTypeList) {
        this.lvmtMerchantChannelTypeList = lvmtMerchantChannelTypeList;
    }

    @XmlTransient
    public List<LvmtSwtMoPromotion> getLvmtSwtMoPromotionList() {
        return lvmtSwtMoPromotionList;
    }

    public void setLvmtSwtMoPromotionList(List<LvmtSwtMoPromotion> lvmtSwtMoPromotionList) {
        this.lvmtSwtMoPromotionList = lvmtSwtMoPromotionList;
    }

    public LvmtUpayCertHistory getLvmtUpayCertHistory() {
        return lvmtUpayCertHistory;
    }

    public void setLvmtUpayCertHistory(LvmtUpayCertHistory lvmtUpayCertHistory) {
        this.lvmtUpayCertHistory = lvmtUpayCertHistory;
    }

    @XmlTransient
    public List<LvmtEpicCommissionType> getLvmtEpicCommissionTypeList() {
        return lvmtEpicCommissionTypeList;
    }

    public void setLvmtEpicCommissionTypeList(List<LvmtEpicCommissionType> lvmtEpicCommissionTypeList) {
        this.lvmtEpicCommissionTypeList = lvmtEpicCommissionTypeList;
    }

    @XmlTransient
    public List<LvmtMobImgPromotion> getLvmtMobImgPromotionList() {
        return lvmtMobImgPromotionList;
    }

    public void setLvmtMobImgPromotionList(List<LvmtMobImgPromotion> lvmtMobImgPromotionList) {
        this.lvmtMobImgPromotionList = lvmtMobImgPromotionList;
    }

    @XmlTransient
    public List<LvmtBillCategory> getLvmtBillCategoryList() {
        return lvmtBillCategoryList;
    }

    public void setLvmtBillCategoryList(List<LvmtBillCategory> lvmtBillCategoryList) {
        this.lvmtBillCategoryList = lvmtBillCategoryList;
    }

    @XmlTransient
    public List<LvmtMerchantCustomer> getLvmtMerchantCustomerList() {
        return lvmtMerchantCustomerList;
    }

    public void setLvmtMerchantCustomerList(List<LvmtMerchantCustomer> lvmtMerchantCustomerList) {
        this.lvmtMerchantCustomerList = lvmtMerchantCustomerList;
    }

    @XmlTransient
    public List<LvmtProductRule> getLvmtProductRuleList() {
        return lvmtProductRuleList;
    }

    public void setLvmtProductRuleList(List<LvmtProductRule> lvmtProductRuleList) {
        this.lvmtProductRuleList = lvmtProductRuleList;
    }

    @XmlTransient
    public List<LvmtBillServiceProvider> getLvmtBillServiceProviderList() {
        return lvmtBillServiceProviderList;
    }

    public void setLvmtBillServiceProviderList(List<LvmtBillServiceProvider> lvmtBillServiceProviderList) {
        this.lvmtBillServiceProviderList = lvmtBillServiceProviderList;
    }

    @XmlTransient
    public List<LvmtWbPendingtask> getLvmtWbPendingtaskList() {
        return lvmtWbPendingtaskList;
    }

    public void setLvmtWbPendingtaskList(List<LvmtWbPendingtask> lvmtWbPendingtaskList) {
        this.lvmtWbPendingtaskList = lvmtWbPendingtaskList;
    }

    @XmlTransient
    public List<LvmtWbPortaluser> getLvmtWbPortaluserList() {
        return lvmtWbPortaluserList;
    }

    public void setLvmtWbPortaluserList(List<LvmtWbPortaluser> lvmtWbPortaluserList) {
        this.lvmtWbPortaluserList = lvmtWbPortaluserList;
    }

    @XmlTransient
    public List<LvmtTerminalRequest> getLvmtTerminalRequestList() {
        return lvmtTerminalRequestList;
    }

    public void setLvmtTerminalRequestList(List<LvmtTerminalRequest> lvmtTerminalRequestList) {
        this.lvmtTerminalRequestList = lvmtTerminalRequestList;
    }

    @XmlTransient
    public List<LvmtTerms123> getLvmtTerms123List() {
        return lvmtTerms123List;
    }

    public void setLvmtTerms123List(List<LvmtTerms123> lvmtTerms123List) {
        this.lvmtTerms123List = lvmtTerms123List;
    }

    @XmlTransient
    public List<LvmtTerms> getLvmtTermsList() {
        return lvmtTermsList;
    }

    public void setLvmtTermsList(List<LvmtTerms> lvmtTermsList) {
        this.lvmtTermsList = lvmtTermsList;
    }

    @XmlTransient
    public List<LvmtMcc> getLvmtMccList() {
        return lvmtMccList;
    }

    public void setLvmtMccList(List<LvmtMcc> lvmtMccList) {
        this.lvmtMccList = lvmtMccList;
    }

    @XmlTransient
    public List<LvmtSwtOtp> getLvmtSwtOtpList() {
        return lvmtSwtOtpList;
    }

    public void setLvmtSwtOtpList(List<LvmtSwtOtp> lvmtSwtOtpList) {
        this.lvmtSwtOtpList = lvmtSwtOtpList;
    }

    @XmlTransient
    public List<LvmtBillProfile> getLvmtBillProfileList() {
        return lvmtBillProfileList;
    }

    public void setLvmtBillProfileList(List<LvmtBillProfile> lvmtBillProfileList) {
        this.lvmtBillProfileList = lvmtBillProfileList;
    }

    @XmlTransient
    public List<LvmtJpRequests> getLvmtJpRequestsList() {
        return lvmtJpRequestsList;
    }

    public void setLvmtJpRequestsList(List<LvmtJpRequests> lvmtJpRequestsList) {
        this.lvmtJpRequestsList = lvmtJpRequestsList;
    }

    @XmlTransient
    public List<LvmtSwtMtQuestion> getLvmtSwtMtQuestionList() {
        return lvmtSwtMtQuestionList;
    }

    public void setLvmtSwtMtQuestionList(List<LvmtSwtMtQuestion> lvmtSwtMtQuestionList) {
        this.lvmtSwtMtQuestionList = lvmtSwtMtQuestionList;
    }

    @XmlTransient
    public List<LvmtBranch> getLvmtBranchList() {
        return lvmtBranchList;
    }

    public void setLvmtBranchList(List<LvmtBranch> lvmtBranchList) {
        this.lvmtBranchList = lvmtBranchList;
    }

    @XmlTransient
    public List<LvmtTerminal> getLvmtTerminalList() {
        return lvmtTerminalList;
    }

    public void setLvmtTerminalList(List<LvmtTerminal> lvmtTerminalList) {
        this.lvmtTerminalList = lvmtTerminalList;
    }

    @XmlTransient
    public List<LvmtQrChannel> getLvmtQrChannelList() {
        return lvmtQrChannelList;
    }

    public void setLvmtQrChannelList(List<LvmtQrChannel> lvmtQrChannelList) {
        this.lvmtQrChannelList = lvmtQrChannelList;
    }

    @XmlTransient
    public List<LvmtFtPayee> getLvmtFtPayeeList() {
        return lvmtFtPayeeList;
    }

    public void setLvmtFtPayeeList(List<LvmtFtPayee> lvmtFtPayeeList) {
        this.lvmtFtPayeeList = lvmtFtPayeeList;
    }

    @XmlTransient
    public List<LvmtSwtTxnLimit> getLvmtSwtTxnLimitList() {
        return lvmtSwtTxnLimitList;
    }

    public void setLvmtSwtTxnLimitList(List<LvmtSwtTxnLimit> lvmtSwtTxnLimitList) {
        this.lvmtSwtTxnLimitList = lvmtSwtTxnLimitList;
    }

    @XmlTransient
    public List<LvmtJpChallangeReqHistory> getLvmtJpChallangeReqHistoryList() {
        return lvmtJpChallangeReqHistoryList;
    }

    public void setLvmtJpChallangeReqHistoryList(List<LvmtJpChallangeReqHistory> lvmtJpChallangeReqHistoryList) {
        this.lvmtJpChallangeReqHistoryList = lvmtJpChallangeReqHistoryList;
    }

    @XmlTransient
    public List<LvmtSwtTemplateSmsPush> getLvmtSwtTemplateSmsPushList() {
        return lvmtSwtTemplateSmsPushList;
    }

    public void setLvmtSwtTemplateSmsPushList(List<LvmtSwtTemplateSmsPush> lvmtSwtTemplateSmsPushList) {
        this.lvmtSwtTemplateSmsPushList = lvmtSwtTemplateSmsPushList;
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
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtMtStatus)) {
            return false;
        }
        LvmtSwtMtStatus other = (LvmtSwtMtStatus) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtMtStatus[ code=" + code + " ]";
    }
    
}
