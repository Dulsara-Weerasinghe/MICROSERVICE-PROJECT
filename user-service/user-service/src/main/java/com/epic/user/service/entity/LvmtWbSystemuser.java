/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "LVMT_WB_SYSTEMUSER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbSystemuser.findAll", query = "SELECT l FROM LvmtWbSystemuser l"),
    @NamedQuery(name = "LvmtWbSystemuser.findByUsername", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.username = :username"),
    @NamedQuery(name = "LvmtWbSystemuser.findByUserrolecode", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.userrolecode = :userrolecode"),
    @NamedQuery(name = "LvmtWbSystemuser.findByEmpid", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.empid = :empid"),
    @NamedQuery(name = "LvmtWbSystemuser.findByFullname", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.fullname = :fullname"),
    @NamedQuery(name = "LvmtWbSystemuser.findByAddress", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.address = :address"),
    @NamedQuery(name = "LvmtWbSystemuser.findByAddress2", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.address2 = :address2"),
    @NamedQuery(name = "LvmtWbSystemuser.findByCity", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.city = :city"),
    @NamedQuery(name = "LvmtWbSystemuser.findByMobile", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.mobile = :mobile"),
    @NamedQuery(name = "LvmtWbSystemuser.findByTelno", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.telno = :telno"),
    @NamedQuery(name = "LvmtWbSystemuser.findByFax", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.fax = :fax"),
    @NamedQuery(name = "LvmtWbSystemuser.findByEmail", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.email = :email"),
    @NamedQuery(name = "LvmtWbSystemuser.findBySessionid", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.sessionid = :sessionid"),
    @NamedQuery(name = "LvmtWbSystemuser.findByDualauthuserrole", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.dualauthuserrole = :dualauthuserrole"),
    @NamedQuery(name = "LvmtWbSystemuser.findByStatuscode", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.statuscode = :statuscode"),
    @NamedQuery(name = "LvmtWbSystemuser.findByPassword", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.password = :password"),
    @NamedQuery(name = "LvmtWbSystemuser.findByNoofinvlidattempt", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.noofinvlidattempt = :noofinvlidattempt"),
    @NamedQuery(name = "LvmtWbSystemuser.findByInitialloginstatus", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.initialloginstatus = :initialloginstatus"),
    @NamedQuery(name = "LvmtWbSystemuser.findByInstitute", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.institute = :institute"),
    @NamedQuery(name = "LvmtWbSystemuser.findByNic", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.nic = :nic"),
    @NamedQuery(name = "LvmtWbSystemuser.findByLastupdateduser", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtWbSystemuser.findByLastupdatedtime", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtWbSystemuser.findByExpirydate", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.expirydate = :expirydate"),
    @NamedQuery(name = "LvmtWbSystemuser.findByLoggeddate", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.loggeddate = :loggeddate"),
    @NamedQuery(name = "LvmtWbSystemuser.findByDateofbirth", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.dateofbirth = :dateofbirth"),
    @NamedQuery(name = "LvmtWbSystemuser.findByCreatetime", query = "SELECT l FROM LvmtWbSystemuser l WHERE l.createtime = :createtime")})
public class LvmtWbSystemuser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "USERROLECODE")
    private String userrolecode;
    @Column(name = "EMPID")
    private String empid;
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
    @Column(name = "SESSIONID")
    private String sessionid;
    @Column(name = "DUALAUTHUSERROLE")
    private String dualauthuserrole;
    @Column(name = "STATUSCODE")
    private Long statuscode;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "NOOFINVLIDATTEMPT")
    private Short noofinvlidattempt;
    @Column(name = "INITIALLOGINSTATUS")
    private Short initialloginstatus;
    @Column(name = "INSTITUTE")
    private String institute;
    @Column(name = "NIC")
    private String nic;
    @Column(name = "LASTUPDATEDUSER")
    private String lastupdateduser;
    @Basic(optional = false)
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Column(name = "EXPIRYDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expirydate;
    @Column(name = "LOGGEDDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loggeddate;
    @Column(name = "DATEOFBIRTH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateofbirth;
    @Basic(optional = false)
    @Column(name = "CREATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    @OneToMany(mappedBy = "createduser")
    private List<LvmtWbPendingtask> lvmtWbPendingtaskList;
    @JoinColumn(name = "BRANCH", referencedColumnName = "BRANCHCODE")
    @ManyToOne
    private LvmtBranch branch;

    public LvmtWbSystemuser() {
    }

    public LvmtWbSystemuser(String username) {
        this.username = username;
    }

    public LvmtWbSystemuser(String username, Date lastupdatedtime, Date createtime) {
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

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
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

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getDualauthuserrole() {
        return dualauthuserrole;
    }

    public void setDualauthuserrole(String dualauthuserrole) {
        this.dualauthuserrole = dualauthuserrole;
    }

    public Long getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(Long statuscode) {
        this.statuscode = statuscode;
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

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getLastupdateduser() {
        return lastupdateduser;
    }

    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
    }

    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public Date getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
    }

    public Date getLoggeddate() {
        return loggeddate;
    }

    public void setLoggeddate(Date loggeddate) {
        this.loggeddate = loggeddate;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @XmlTransient
    public List<LvmtWbPendingtask> getLvmtWbPendingtaskList() {
        return lvmtWbPendingtaskList;
    }

    public void setLvmtWbPendingtaskList(List<LvmtWbPendingtask> lvmtWbPendingtaskList) {
        this.lvmtWbPendingtaskList = lvmtWbPendingtaskList;
    }

    public LvmtBranch getBranch() {
        return branch;
    }

    public void setBranch(LvmtBranch branch) {
        this.branch = branch;
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
        if (!(object instanceof LvmtWbSystemuser)) {
            return false;
        }
        LvmtWbSystemuser other = (LvmtWbSystemuser) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbSystemuser[ username=" + username + " ]";
    }
    
}
