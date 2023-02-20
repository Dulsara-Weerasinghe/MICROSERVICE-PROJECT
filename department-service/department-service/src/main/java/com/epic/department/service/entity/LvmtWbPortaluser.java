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
@Table(name = "LVMT_WB_PORTALUSER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbPortaluser.findAll", query = "SELECT l FROM LvmtWbPortaluser l"),
    @NamedQuery(name = "LvmtWbPortaluser.findByUsername", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.username = :username"),
    @NamedQuery(name = "LvmtWbPortaluser.findByUserrolecode", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.userrolecode = :userrolecode"),
    @NamedQuery(name = "LvmtWbPortaluser.findByMerchantid", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.merchantid = :merchantid"),
    @NamedQuery(name = "LvmtWbPortaluser.findByFullname", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.fullname = :fullname"),
    @NamedQuery(name = "LvmtWbPortaluser.findByAddress", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.address = :address"),
    @NamedQuery(name = "LvmtWbPortaluser.findByAddress2", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.address2 = :address2"),
    @NamedQuery(name = "LvmtWbPortaluser.findByCity", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.city = :city"),
    @NamedQuery(name = "LvmtWbPortaluser.findByMobile", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.mobile = :mobile"),
    @NamedQuery(name = "LvmtWbPortaluser.findByTelno", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.telno = :telno"),
    @NamedQuery(name = "LvmtWbPortaluser.findByFax", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.fax = :fax"),
    @NamedQuery(name = "LvmtWbPortaluser.findByEmail", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.email = :email"),
    @NamedQuery(name = "LvmtWbPortaluser.findByPassword", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.password = :password"),
    @NamedQuery(name = "LvmtWbPortaluser.findByNoofinvlidattempt", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.noofinvlidattempt = :noofinvlidattempt"),
    @NamedQuery(name = "LvmtWbPortaluser.findByInitialloginstatus", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.initialloginstatus = :initialloginstatus"),
    @NamedQuery(name = "LvmtWbPortaluser.findByNic", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.nic = :nic"),
    @NamedQuery(name = "LvmtWbPortaluser.findByDateofbirth", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.dateofbirth = :dateofbirth"),
    @NamedQuery(name = "LvmtWbPortaluser.findByBranch", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.branch = :branch"),
    @NamedQuery(name = "LvmtWbPortaluser.findByLastupdateduser", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtWbPortaluser.findByExpirydate", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.expirydate = :expirydate"),
    @NamedQuery(name = "LvmtWbPortaluser.findByLastupdatedtime", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtWbPortaluser.findByLoggeddate", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.loggeddate = :loggeddate"),
    @NamedQuery(name = "LvmtWbPortaluser.findByCreatetime", query = "SELECT l FROM LvmtWbPortaluser l WHERE l.createtime = :createtime")})
public class LvmtWbPortaluser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "USERROLECODE")
    private String userrolecode;
    @Column(name = "MERCHANTID")
    private String merchantid;
    @Column(name = "FULLNAME")
    private String fullname;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "ADDRESS2")
    private String address2;
    @Column(name = "CITY")
    private String city;
    @Column(name = "MOBILE")
    private String mobile;
    @Column(name = "TELNO")
    private String telno;
    @Column(name = "FAX")
    private String fax;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "NOOFINVLIDATTEMPT")
    private Short noofinvlidattempt;
    @Column(name = "INITIALLOGINSTATUS")
    private Short initialloginstatus;
    @Column(name = "NIC")
    private String nic;
    @Column(name = "DATEOFBIRTH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateofbirth;
    @Column(name = "BRANCH")
    private String branch;
    @Column(name = "LASTUPDATEDUSER")
    private String lastupdateduser;
    @Column(name = "EXPIRYDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expirydate;
    @Basic(optional = false)
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Column(name = "LOGGEDDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loggeddate;
    @Basic(optional = false)
    @Column(name = "CREATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    @JoinColumn(name = "STATUSCODE", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus statuscode;

    public LvmtWbPortaluser() {
    }

    public LvmtWbPortaluser(String username) {
        this.username = username;
    }

    public LvmtWbPortaluser(String username, Date lastupdatedtime, Date createtime) {
        this.username = username;
        this.lastupdatedtime = lastupdatedtime;
        this.createtime = createtime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserrolecode() {
        return userrolecode;
    }

    public void setUserrolecode(String userrolecode) {
        this.userrolecode = userrolecode;
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Short getNoofinvlidattempt() {
        return noofinvlidattempt;
    }

    public void setNoofinvlidattempt(Short noofinvlidattempt) {
        this.noofinvlidattempt = noofinvlidattempt;
    }

    public Short getInitialloginstatus() {
        return initialloginstatus;
    }

    public void setInitialloginstatus(Short initialloginstatus) {
        this.initialloginstatus = initialloginstatus;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getLastupdateduser() {
        return lastupdateduser;
    }

    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
    }

    public Date getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
    }

    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public Date getLoggeddate() {
        return loggeddate;
    }

    public void setLoggeddate(Date loggeddate) {
        this.loggeddate = loggeddate;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public LvmtSwtMtStatus getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(LvmtSwtMtStatus statuscode) {
        this.statuscode = statuscode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtWbPortaluser)) {
            return false;
        }
        LvmtWbPortaluser other = (LvmtWbPortaluser) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbPortaluser[ username=" + username + " ]";
    }
    
}
