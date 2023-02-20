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
@Table(name = "LVMT_BRANCH")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtBranch.findAll", query = "SELECT l FROM LvmtBranch l"),
    @NamedQuery(name = "LvmtBranch.findByBranchcode", query = "SELECT l FROM LvmtBranch l WHERE l.branchcode = :branchcode"),
    @NamedQuery(name = "LvmtBranch.findByDescription", query = "SELECT l FROM LvmtBranch l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtBranch.findByLastupdateddate", query = "SELECT l FROM LvmtBranch l WHERE l.lastupdateddate = :lastupdateddate"),
    @NamedQuery(name = "LvmtBranch.findByCreatedtime", query = "SELECT l FROM LvmtBranch l WHERE l.createdtime = :createdtime"),
    @NamedQuery(name = "LvmtBranch.findByLastupdateduser", query = "SELECT l FROM LvmtBranch l WHERE l.lastupdateduser = :lastupdateduser")})
public class LvmtBranch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BRANCHCODE")
    private String branchcode;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LASTUPDATEDDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdateddate;
    @Column(name = "CREATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdtime;
    @Column(name = "LASTUPDATEDUSER")
    private String lastupdateduser;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;
    @OneToMany(mappedBy = "branch")
    private List<LvmtWbSystemuser> lvmtWbSystemuserList;
    @OneToMany(mappedBy = "branchCode")
    private List<LvmtMerchant> lvmtMerchantList;

    public LvmtBranch() {
    }

    public LvmtBranch(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLastupdateddate() {
        return lastupdateddate;
    }

    public void setLastupdateddate(Date lastupdateddate) {
        this.lastupdateddate = lastupdateddate;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public String getLastupdateduser() {
        return lastupdateduser;
    }

    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
    }

    public LvmtSwtMtStatus getStatus() {
        return status;
    }

    public void setStatus(LvmtSwtMtStatus status) {
        this.status = status;
    }

    @XmlTransient
    public List<LvmtWbSystemuser> getLvmtWbSystemuserList() {
        return lvmtWbSystemuserList;
    }

    public void setLvmtWbSystemuserList(List<LvmtWbSystemuser> lvmtWbSystemuserList) {
        this.lvmtWbSystemuserList = lvmtWbSystemuserList;
    }

    @XmlTransient
    public List<LvmtMerchant> getLvmtMerchantList() {
        return lvmtMerchantList;
    }

    public void setLvmtMerchantList(List<LvmtMerchant> lvmtMerchantList) {
        this.lvmtMerchantList = lvmtMerchantList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (branchcode != null ? branchcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtBranch)) {
            return false;
        }
        LvmtBranch other = (LvmtBranch) object;
        if ((this.branchcode == null && other.branchcode != null) || (this.branchcode != null && !this.branchcode.equals(other.branchcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtBranch[ branchcode=" + branchcode + " ]";
    }
    
}
