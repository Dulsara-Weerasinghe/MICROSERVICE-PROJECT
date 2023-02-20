/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "LVMT_MOB_IMG_PROMOTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtMobImgPromotion.findAll", query = "SELECT l FROM LvmtMobImgPromotion l"),
    @NamedQuery(name = "LvmtMobImgPromotion.findByCode", query = "SELECT l FROM LvmtMobImgPromotion l WHERE l.code = :code"),
    @NamedQuery(name = "LvmtMobImgPromotion.findByTitle", query = "SELECT l FROM LvmtMobImgPromotion l WHERE l.title = :title"),
    @NamedQuery(name = "LvmtMobImgPromotion.findByImgUrl", query = "SELECT l FROM LvmtMobImgPromotion l WHERE l.imgUrl = :imgUrl"),
    @NamedQuery(name = "LvmtMobImgPromotion.findByDescription", query = "SELECT l FROM LvmtMobImgPromotion l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtMobImgPromotion.findByHomeDisplay", query = "SELECT l FROM LvmtMobImgPromotion l WHERE l.homeDisplay = :homeDisplay"),
    @NamedQuery(name = "LvmtMobImgPromotion.findBySortOrder", query = "SELECT l FROM LvmtMobImgPromotion l WHERE l.sortOrder = :sortOrder"),
    @NamedQuery(name = "LvmtMobImgPromotion.findByExpDate", query = "SELECT l FROM LvmtMobImgPromotion l WHERE l.expDate = :expDate"),
    @NamedQuery(name = "LvmtMobImgPromotion.findByCreatedTime", query = "SELECT l FROM LvmtMobImgPromotion l WHERE l.createdTime = :createdTime"),
    @NamedQuery(name = "LvmtMobImgPromotion.findByUpdatedTime", query = "SELECT l FROM LvmtMobImgPromotion l WHERE l.updatedTime = :updatedTime"),
    @NamedQuery(name = "LvmtMobImgPromotion.findByTermsandcondition", query = "SELECT l FROM LvmtMobImgPromotion l WHERE l.termsandcondition = :termsandcondition")})
public class LvmtMobImgPromotion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODE")
    private String code;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "IMG_URL")
    private String imgUrl;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "HOME_DISPLAY")
    private Short homeDisplay;
    @Column(name = "SORT_ORDER")
    private BigInteger sortOrder;
    @Column(name = "EXP_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expDate;
    @Column(name = "CREATED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    @Column(name = "UPDATED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTime;
    @Column(name = "TERMSANDCONDITION")
    private String termsandcondition;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;

    public LvmtMobImgPromotion() {
    }

    public LvmtMobImgPromotion(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Short getHomeDisplay() {
        return homeDisplay;
    }

    public void setHomeDisplay(Short homeDisplay) {
        this.homeDisplay = homeDisplay;
    }

    public BigInteger getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(BigInteger sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getTermsandcondition() {
        return termsandcondition;
    }

    public void setTermsandcondition(String termsandcondition) {
        this.termsandcondition = termsandcondition;
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
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtMobImgPromotion)) {
            return false;
        }
        LvmtMobImgPromotion other = (LvmtMobImgPromotion) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtMobImgPromotion[ code=" + code + " ]";
    }
    
}
