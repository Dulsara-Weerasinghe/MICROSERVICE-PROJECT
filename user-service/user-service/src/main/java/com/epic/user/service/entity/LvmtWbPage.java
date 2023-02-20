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
@Table(name = "LVMT_WB_PAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbPage.findAll", query = "SELECT l FROM LvmtWbPage l"),
    @NamedQuery(name = "LvmtWbPage.findByPagecode", query = "SELECT l FROM LvmtWbPage l WHERE l.pagecode = :pagecode"),
    @NamedQuery(name = "LvmtWbPage.findByDescription", query = "SELECT l FROM LvmtWbPage l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtWbPage.findByUrl", query = "SELECT l FROM LvmtWbPage l WHERE l.url = :url"),
    @NamedQuery(name = "LvmtWbPage.findByStatus", query = "SELECT l FROM LvmtWbPage l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtWbPage.findByLastupdateduser", query = "SELECT l FROM LvmtWbPage l WHERE l.lastupdateduser = :lastupdateduser"),
    @NamedQuery(name = "LvmtWbPage.findByLastupdatedtime", query = "SELECT l FROM LvmtWbPage l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtWbPage.findByCreatetime", query = "SELECT l FROM LvmtWbPage l WHERE l.createtime = :createtime"),
    @NamedQuery(name = "LvmtWbPage.findBySortkey", query = "SELECT l FROM LvmtWbPage l WHERE l.sortkey = :sortkey"),
    @NamedQuery(name = "LvmtWbPage.findByInstitute", query = "SELECT l FROM LvmtWbPage l WHERE l.institute = :institute")})
public class LvmtWbPage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAGECODE")
    private String pagecode;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "URL")
    private String url;
    @Column(name = "STATUS")
    private Long status;
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
    @Column(name = "SORTKEY")
    private Short sortkey;
    @Column(name = "INSTITUTE")
    private String institute;
    @OneToMany(mappedBy = "pagecode")
    private List<LvmtWbPendingtask> lvmtWbPendingtaskList;

    public LvmtWbPage() {
    }

    public LvmtWbPage(String pagecode) {
        this.pagecode = pagecode;
    }

    public LvmtWbPage(String pagecode, Date lastupdatedtime, Date createtime) {
        this.pagecode = pagecode;
        this.lastupdatedtime = lastupdatedtime;
        this.createtime = createtime;
    }

    public String getPagecode() {
        return pagecode;
    }

    public void setPagecode(String pagecode) {
        this.pagecode = pagecode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
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

    public Short getSortkey() {
        return sortkey;
    }

    public void setSortkey(Short sortkey) {
        this.sortkey = sortkey;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    @XmlTransient
    public List<LvmtWbPendingtask> getLvmtWbPendingtaskList() {
        return lvmtWbPendingtaskList;
    }

    public void setLvmtWbPendingtaskList(List<LvmtWbPendingtask> lvmtWbPendingtaskList) {
        this.lvmtWbPendingtaskList = lvmtWbPendingtaskList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pagecode != null ? pagecode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtWbPage)) {
            return false;
        }
        LvmtWbPage other = (LvmtWbPage) object;
        if ((this.pagecode == null && other.pagecode != null) || (this.pagecode != null && !this.pagecode.equals(other.pagecode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbPage[ pagecode=" + pagecode + " ]";
    }
    
}
