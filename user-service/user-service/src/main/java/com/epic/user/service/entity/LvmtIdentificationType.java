/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_IDENTIFICATION_TYPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtIdentificationType.findAll", query = "SELECT l FROM LvmtIdentificationType l"),
    @NamedQuery(name = "LvmtIdentificationType.findByCode", query = "SELECT l FROM LvmtIdentificationType l WHERE l.code = :code"),
    @NamedQuery(name = "LvmtIdentificationType.findByDescription", query = "SELECT l FROM LvmtIdentificationType l WHERE l.description = :description")})
public class LvmtIdentificationType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODE")
    private String code;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(mappedBy = "identificationType")
    private List<LvmtMerchantCustomer> lvmtMerchantCustomerList;

    public LvmtIdentificationType() {
    }

    public LvmtIdentificationType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public List<LvmtMerchantCustomer> getLvmtMerchantCustomerList() {
        return lvmtMerchantCustomerList;
    }

    public void setLvmtMerchantCustomerList(List<LvmtMerchantCustomer> lvmtMerchantCustomerList) {
        this.lvmtMerchantCustomerList = lvmtMerchantCustomerList;
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
        if (!(object instanceof LvmtIdentificationType)) {
            return false;
        }
        LvmtIdentificationType other = (LvmtIdentificationType) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtIdentificationType[ code=" + code + " ]";
    }
    
}
