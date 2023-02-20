/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

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
@Table(name = "LVMT_SWT_ST_CUSTOMER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtStCustomer.findAll", query = "SELECT l FROM LvmtSwtStCustomer l"),
    @NamedQuery(name = "LvmtSwtStCustomer.findByCusId", query = "SELECT l FROM LvmtSwtStCustomer l WHERE l.cusId = :cusId"),
    @NamedQuery(name = "LvmtSwtStCustomer.findByNic", query = "SELECT l FROM LvmtSwtStCustomer l WHERE l.nic = :nic"),
    @NamedQuery(name = "LvmtSwtStCustomer.findByName", query = "SELECT l FROM LvmtSwtStCustomer l WHERE l.name = :name"),
    @NamedQuery(name = "LvmtSwtStCustomer.findByAddress", query = "SELECT l FROM LvmtSwtStCustomer l WHERE l.address = :address"),
    @NamedQuery(name = "LvmtSwtStCustomer.findByMobile", query = "SELECT l FROM LvmtSwtStCustomer l WHERE l.mobile = :mobile"),
    @NamedQuery(name = "LvmtSwtStCustomer.findByStatus", query = "SELECT l FROM LvmtSwtStCustomer l WHERE l.status = :status")})
public class LvmtSwtStCustomer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUS_ID")
    private Long cusId;
    @Basic(optional = false)
    @Column(name = "NIC")
    private String nic;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "ADDRESS")
    private String address;
    @Basic(optional = false)
    @Column(name = "MOBILE")
    private String mobile;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private long status;

    public LvmtSwtStCustomer() {
    }

    public LvmtSwtStCustomer(Long cusId) {
        this.cusId = cusId;
    }

    public LvmtSwtStCustomer(Long cusId, String nic, String name, String mobile, long status) {
        this.cusId = cusId;
        this.nic = nic;
        this.name = name;
        this.mobile = mobile;
        this.status = status;
    }

    public Long getCusId() {
        return cusId;
    }

    public void setCusId(Long cusId) {
        this.cusId = cusId;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cusId != null ? cusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtStCustomer)) {
            return false;
        }
        LvmtSwtStCustomer other = (LvmtSwtStCustomer) object;
        if ((this.cusId == null && other.cusId != null) || (this.cusId != null && !this.cusId.equals(other.cusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtStCustomer[ cusId=" + cusId + " ]";
    }
    
}
