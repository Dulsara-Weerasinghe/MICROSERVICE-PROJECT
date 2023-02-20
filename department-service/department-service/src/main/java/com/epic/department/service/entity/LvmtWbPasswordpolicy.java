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
@Table(name = "LVMT_WB_PASSWORDPOLICY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbPasswordpolicy.findAll", query = "SELECT l FROM LvmtWbPasswordpolicy l"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByPasswordpolicyid", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.passwordpolicyid = :passwordpolicyid"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByMinimumlength", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.minimumlength = :minimumlength"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByMaximumlength", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.maximumlength = :maximumlength"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByMinimumspecialcharacters", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.minimumspecialcharacters = :minimumspecialcharacters"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByMinimumuppercasecharacters", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.minimumuppercasecharacters = :minimumuppercasecharacters"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByMinimumnumericalcharacters", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.minimumnumericalcharacters = :minimumnumericalcharacters"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByMinimumlowercasecharacters", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.minimumlowercasecharacters = :minimumlowercasecharacters"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByNoofinvalidloginattempt", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.noofinvalidloginattempt = :noofinvalidloginattempt"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByRepeatcharactersallow", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.repeatcharactersallow = :repeatcharactersallow"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByInitialpasswordexpirystatus", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.initialpasswordexpirystatus = :initialpasswordexpirystatus"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByPasswordexpiryperiod", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.passwordexpiryperiod = :passwordexpiryperiod"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByNoofhistorypassword", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.noofhistorypassword = :noofhistorypassword"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByMinimumpasswordchangeperiod", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.minimumpasswordchangeperiod = :minimumpasswordchangeperiod"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByIdleaccountexpiryperiod", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.idleaccountexpiryperiod = :idleaccountexpiryperiod"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByDescription", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByLastupdateduser", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByLastupdatedtime", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByCreatetime", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.createtime = :createtime"),
    @NamedQuery(name = "LvmtWbPasswordpolicy.findByInstitute", query = "SELECT l FROM LvmtWbPasswordpolicy l WHERE l.institute = :institute")})
public class LvmtWbPasswordpolicy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PASSWORDPOLICYID")
    private Long passwordpolicyid;
    @Column(name = "MINIMUMLENGTH")
    private Long minimumlength;
    @Column(name = "MAXIMUMLENGTH")
    private Long maximumlength;
    @Column(name = "MINIMUMSPECIALCHARACTERS")
    private Long minimumspecialcharacters;
    @Column(name = "MINIMUMUPPERCASECHARACTERS")
    private Long minimumuppercasecharacters;
    @Column(name = "MINIMUMNUMERICALCHARACTERS")
    private Long minimumnumericalcharacters;
    @Column(name = "MINIMUMLOWERCASECHARACTERS")
    private Long minimumlowercasecharacters;
    @Column(name = "NOOFINVALIDLOGINATTEMPT")
    private Long noofinvalidloginattempt;
    @Column(name = "REPEATCHARACTERSALLOW")
    private Long repeatcharactersallow;
    @Column(name = "INITIALPASSWORDEXPIRYSTATUS")
    private Long initialpasswordexpirystatus;
    @Column(name = "PASSWORDEXPIRYPERIOD")
    private Long passwordexpiryperiod;
    @Column(name = "NOOFHISTORYPASSWORD")
    private Long noofhistorypassword;
    @Column(name = "MINIMUMPASSWORDCHANGEPERIOD")
    private Long minimumpasswordchangeperiod;
    @Column(name = "IDLEACCOUNTEXPIRYPERIOD")
    private Long idleaccountexpiryperiod;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LASTUPDATEDUSER")
    private String lastupdateduser;
    @Basic(optional = false)
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Basic(optional = false)
    @Column(name = "CREATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    @Column(name = "INSTITUTE")
    private String institute;

    public LvmtWbPasswordpolicy() {
    }

    public LvmtWbPasswordpolicy(Long passwordpolicyid) {
        this.passwordpolicyid = passwordpolicyid;
    }

    public LvmtWbPasswordpolicy(Long passwordpolicyid, Date lastupdatedtime, Date createtime) {
        this.passwordpolicyid = passwordpolicyid;
        this.lastupdatedtime = lastupdatedtime;
        this.createtime = createtime;
    }

    public Long getPasswordpolicyid() {
        return passwordpolicyid;
    }

    public void setPasswordpolicyid(Long passwordpolicyid) {
        this.passwordpolicyid = passwordpolicyid;
    }

    public Long getMinimumlength() {
        return minimumlength;
    }

    public void setMinimumlength(Long minimumlength) {
        this.minimumlength = minimumlength;
    }

    public Long getMaximumlength() {
        return maximumlength;
    }

    public void setMaximumlength(Long maximumlength) {
        this.maximumlength = maximumlength;
    }

    public Long getMinimumspecialcharacters() {
        return minimumspecialcharacters;
    }

    public void setMinimumspecialcharacters(Long minimumspecialcharacters) {
        this.minimumspecialcharacters = minimumspecialcharacters;
    }

    public Long getMinimumuppercasecharacters() {
        return minimumuppercasecharacters;
    }

    public void setMinimumuppercasecharacters(Long minimumuppercasecharacters) {
        this.minimumuppercasecharacters = minimumuppercasecharacters;
    }

    public Long getMinimumnumericalcharacters() {
        return minimumnumericalcharacters;
    }

    public void setMinimumnumericalcharacters(Long minimumnumericalcharacters) {
        this.minimumnumericalcharacters = minimumnumericalcharacters;
    }

    public Long getMinimumlowercasecharacters() {
        return minimumlowercasecharacters;
    }

    public void setMinimumlowercasecharacters(Long minimumlowercasecharacters) {
        this.minimumlowercasecharacters = minimumlowercasecharacters;
    }

    public Long getNoofinvalidloginattempt() {
        return noofinvalidloginattempt;
    }

    public void setNoofinvalidloginattempt(Long noofinvalidloginattempt) {
        this.noofinvalidloginattempt = noofinvalidloginattempt;
    }

    public Long getRepeatcharactersallow() {
        return repeatcharactersallow;
    }

    public void setRepeatcharactersallow(Long repeatcharactersallow) {
        this.repeatcharactersallow = repeatcharactersallow;
    }

    public Long getInitialpasswordexpirystatus() {
        return initialpasswordexpirystatus;
    }

    public void setInitialpasswordexpirystatus(Long initialpasswordexpirystatus) {
        this.initialpasswordexpirystatus = initialpasswordexpirystatus;
    }

    public Long getPasswordexpiryperiod() {
        return passwordexpiryperiod;
    }

    public void setPasswordexpiryperiod(Long passwordexpiryperiod) {
        this.passwordexpiryperiod = passwordexpiryperiod;
    }

    public Long getNoofhistorypassword() {
        return noofhistorypassword;
    }

    public void setNoofhistorypassword(Long noofhistorypassword) {
        this.noofhistorypassword = noofhistorypassword;
    }

    public Long getMinimumpasswordchangeperiod() {
        return minimumpasswordchangeperiod;
    }

    public void setMinimumpasswordchangeperiod(Long minimumpasswordchangeperiod) {
        this.minimumpasswordchangeperiod = minimumpasswordchangeperiod;
    }

    public Long getIdleaccountexpiryperiod() {
        return idleaccountexpiryperiod;
    }

    public void setIdleaccountexpiryperiod(Long idleaccountexpiryperiod) {
        this.idleaccountexpiryperiod = idleaccountexpiryperiod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (passwordpolicyid != null ? passwordpolicyid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtWbPasswordpolicy)) {
            return false;
        }
        LvmtWbPasswordpolicy other = (LvmtWbPasswordpolicy) object;
        if ((this.passwordpolicyid == null && other.passwordpolicyid != null) || (this.passwordpolicyid != null && !this.passwordpolicyid.equals(other.passwordpolicyid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbPasswordpolicy[ passwordpolicyid=" + passwordpolicyid + " ]";
    }
    
}
