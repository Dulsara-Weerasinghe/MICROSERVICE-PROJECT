/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_ISSUER_BANKS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtIssuerBanks.findAll", query = "SELECT l FROM LvmtIssuerBanks l"),
    @NamedQuery(name = "LvmtIssuerBanks.findByCode", query = "SELECT l FROM LvmtIssuerBanks l WHERE l.code = :code"),
    @NamedQuery(name = "LvmtIssuerBanks.findByInstitute", query = "SELECT l FROM LvmtIssuerBanks l WHERE l.institute = :institute"),
    @NamedQuery(name = "LvmtIssuerBanks.findByName", query = "SELECT l FROM LvmtIssuerBanks l WHERE l.name = :name"),
    @NamedQuery(name = "LvmtIssuerBanks.findByBankCode", query = "SELECT l FROM LvmtIssuerBanks l WHERE l.bankCode = :bankCode"),
    @NamedQuery(name = "LvmtIssuerBanks.findByDisplayName", query = "SELECT l FROM LvmtIssuerBanks l WHERE l.displayName = :displayName"),
    @NamedQuery(name = "LvmtIssuerBanks.findByStatus", query = "SELECT l FROM LvmtIssuerBanks l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtIssuerBanks.findByMerchantStatus", query = "SELECT l FROM LvmtIssuerBanks l WHERE l.merchantStatus = :merchantStatus"),
    @NamedQuery(name = "LvmtIssuerBanks.findByConnectIp", query = "SELECT l FROM LvmtIssuerBanks l WHERE l.connectIp = :connectIp"),
    @NamedQuery(name = "LvmtIssuerBanks.findByConnectPort", query = "SELECT l FROM LvmtIssuerBanks l WHERE l.connectPort = :connectPort"),
    @NamedQuery(name = "LvmtIssuerBanks.findByImageUrl", query = "SELECT l FROM LvmtIssuerBanks l WHERE l.imageUrl = :imageUrl"),
    @NamedQuery(name = "LvmtIssuerBanks.findByIsPayee", query = "SELECT l FROM LvmtIssuerBanks l WHERE l.isPayee = :isPayee")})
public class LvmtIssuerBanks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODE")
    private String code;
    @Column(name = "INSTITUTE")
    private String institute;
    @Column(name = "NAME")
    private String name;
    @Column(name = "BANK_CODE")
    private String bankCode;
    @Column(name = "DISPLAY_NAME")
    private String displayName;
    @Column(name = "STATUS")
    private Long status;
    @Column(name = "MERCHANT_STATUS")
    private Long merchantStatus;
    @Column(name = "CONNECT_IP")
    private String connectIp;
    @Column(name = "CONNECT_PORT")
    private String connectPort;
    @Column(name = "IMAGE_URL")
    private String imageUrl;
    @Column(name = "IS_PAYEE")
    private String isPayee;

    public LvmtIssuerBanks() {
    }

    public LvmtIssuerBanks(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(Long merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public String getConnectIp() {
        return connectIp;
    }

    public void setConnectIp(String connectIp) {
        this.connectIp = connectIp;
    }

    public String getConnectPort() {
        return connectPort;
    }

    public void setConnectPort(String connectPort) {
        this.connectPort = connectPort;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getIsPayee() {
        return isPayee;
    }

    public void setIsPayee(String isPayee) {
        this.isPayee = isPayee;
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
        if (!(object instanceof LvmtIssuerBanks)) {
            return false;
        }
        LvmtIssuerBanks other = (LvmtIssuerBanks) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtIssuerBanks[ code=" + code + " ]";
    }
    
}
