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
@Table(name = "LVMT_CUSTOMER_GROUP_DATA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtCustomerGroupData.findAll", query = "SELECT l FROM LvmtCustomerGroupData l"),
    @NamedQuery(name = "LvmtCustomerGroupData.findById", query = "SELECT l FROM LvmtCustomerGroupData l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtCustomerGroupData.findByMobile", query = "SELECT l FROM LvmtCustomerGroupData l WHERE l.mobile = :mobile")})
public class LvmtCustomerGroupData implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "MOBILE")
    private String mobile;
    @JoinColumn(name = "GROUP_ID", referencedColumnName = "GROUP_ID")
    @ManyToOne
    private LvmtCustomerGroup groupId;

    public LvmtCustomerGroupData() {
    }

    public LvmtCustomerGroupData(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public LvmtCustomerGroup getGroupId() {
        return groupId;
    }

    public void setGroupId(LvmtCustomerGroup groupId) {
        this.groupId = groupId;
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
        if (!(object instanceof LvmtCustomerGroupData)) {
            return false;
        }
        LvmtCustomerGroupData other = (LvmtCustomerGroupData) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtCustomerGroupData[ id=" + id + " ]";
    }
    
}
