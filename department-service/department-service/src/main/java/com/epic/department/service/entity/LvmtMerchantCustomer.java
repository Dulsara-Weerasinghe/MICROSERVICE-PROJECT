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
@Table(name = "LVMT_MERCHANT_CUSTOMER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtMerchantCustomer.findAll", query = "SELECT l FROM LvmtMerchantCustomer l"),
    @NamedQuery(name = "LvmtMerchantCustomer.findByMerchantCusId", query = "SELECT l FROM LvmtMerchantCustomer l WHERE l.merchantCusId = :merchantCusId"),
    @NamedQuery(name = "LvmtMerchantCustomer.findByMerchantCusName", query = "SELECT l FROM LvmtMerchantCustomer l WHERE l.merchantCusName = :merchantCusName"),
    @NamedQuery(name = "LvmtMerchantCustomer.findByEmail", query = "SELECT l FROM LvmtMerchantCustomer l WHERE l.email = :email"),
    @NamedQuery(name = "LvmtMerchantCustomer.findByMobile", query = "SELECT l FROM LvmtMerchantCustomer l WHERE l.mobile = :mobile"),
    @NamedQuery(name = "LvmtMerchantCustomer.findByRemark", query = "SELECT l FROM LvmtMerchantCustomer l WHERE l.remark = :remark"),
    @NamedQuery(name = "LvmtMerchantCustomer.findByUsername", query = "SELECT l FROM LvmtMerchantCustomer l WHERE l.username = :username"),
    @NamedQuery(name = "LvmtMerchantCustomer.findByCreatetime", query = "SELECT l FROM LvmtMerchantCustomer l WHERE l.createtime = :createtime"),
    @NamedQuery(name = "LvmtMerchantCustomer.findByLastupdatedtime", query = "SELECT l FROM LvmtMerchantCustomer l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtMerchantCustomer.findByLastupdateduser", query = "SELECT l FROM LvmtMerchantCustomer l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtMerchantCustomer.findByIdentificationVal", query = "SELECT l FROM LvmtMerchantCustomer l WHERE l.identificationVal = :identificationVal"),
    @NamedQuery(name = "LvmtMerchantCustomer.findByUserpassGen", query = "SELECT l FROM LvmtMerchantCustomer l WHERE l.userpassGen = :userpassGen")})
public class LvmtMerchantCustomer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MERCHANT_CUS_ID")
    private String merchantCusId;
    @Column(name = "MERCHANT_CUS_NAME")
    private String merchantCusName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "MOBILE")
    private String mobile;
    @Column(name = "REMARK")
    private String remark;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "CREATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Column(name = "LASTUPDATEDUSER")
    private String lastupdateduser;
    @Column(name = "IDENTIFICATION_VAL")
    private String identificationVal;
    @Column(name = "USERPASS_GEN")
    private Short userpassGen;
    @JoinColumn(name = "IDENTIFICATION_TYPE", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtIdentificationType identificationType;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;

    public LvmtMerchantCustomer() {
    }

    public LvmtMerchantCustomer(String merchantCusId) {
        this.merchantCusId = merchantCusId;
    }

    public String getMerchantCusId() {
        return merchantCusId;
    }

    public void setMerchantCusId(String merchantCusId) {
        this.merchantCusId = merchantCusId;
    }

    public String getMerchantCusName() {
        return merchantCusName;
    }

    public void setMerchantCusName(String merchantCusName) {
        this.merchantCusName = merchantCusName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public String getLastupdateduser() {
        return lastupdateduser;
    }

    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
    }

    public String getIdentificationVal() {
        return identificationVal;
    }

    public void setIdentificationVal(String identificationVal) {
        this.identificationVal = identificationVal;
    }

    public Short getUserpassGen() {
        return userpassGen;
    }

    public void setUserpassGen(Short userpassGen) {
        this.userpassGen = userpassGen;
    }

    public LvmtIdentificationType getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(LvmtIdentificationType identificationType) {
        this.identificationType = identificationType;
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
        hash += (merchantCusId != null ? merchantCusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtMerchantCustomer)) {
            return false;
        }
        LvmtMerchantCustomer other = (LvmtMerchantCustomer) object;
        if ((this.merchantCusId == null && other.merchantCusId != null) || (this.merchantCusId != null && !this.merchantCusId.equals(other.merchantCusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtMerchantCustomer[ merchantCusId=" + merchantCusId + " ]";
    }
    
}
