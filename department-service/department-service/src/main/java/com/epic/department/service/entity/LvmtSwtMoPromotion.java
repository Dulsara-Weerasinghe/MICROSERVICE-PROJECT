/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "LVMT_SWT_MO_PROMOTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtMoPromotion.findAll", query = "SELECT l FROM LvmtSwtMoPromotion l"),
    @NamedQuery(name = "LvmtSwtMoPromotion.findByPromotionId", query = "SELECT l FROM LvmtSwtMoPromotion l WHERE l.promotionId = :promotionId"),
    @NamedQuery(name = "LvmtSwtMoPromotion.findByTitle", query = "SELECT l FROM LvmtSwtMoPromotion l WHERE l.title = :title"),
    @NamedQuery(name = "LvmtSwtMoPromotion.findByDescription", query = "SELECT l FROM LvmtSwtMoPromotion l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtSwtMoPromotion.findByTabImgName", query = "SELECT l FROM LvmtSwtMoPromotion l WHERE l.tabImgName = :tabImgName"),
    @NamedQuery(name = "LvmtSwtMoPromotion.findByPageUrl", query = "SELECT l FROM LvmtSwtMoPromotion l WHERE l.pageUrl = :pageUrl"),
    @NamedQuery(name = "LvmtSwtMoPromotion.findByExpDate", query = "SELECT l FROM LvmtSwtMoPromotion l WHERE l.expDate = :expDate"),
    @NamedQuery(name = "LvmtSwtMoPromotion.findBySortOrder", query = "SELECT l FROM LvmtSwtMoPromotion l WHERE l.sortOrder = :sortOrder"),
    @NamedQuery(name = "LvmtSwtMoPromotion.findByCreateTime", query = "SELECT l FROM LvmtSwtMoPromotion l WHERE l.createTime = :createTime"),
    @NamedQuery(name = "LvmtSwtMoPromotion.findByUpdatedTime", query = "SELECT l FROM LvmtSwtMoPromotion l WHERE l.updatedTime = :updatedTime"),
    @NamedQuery(name = "LvmtSwtMoPromotion.findByStartDate", query = "SELECT l FROM LvmtSwtMoPromotion l WHERE l.startDate = :startDate"),
    @NamedQuery(name = "LvmtSwtMoPromotion.findByMobImgName", query = "SELECT l FROM LvmtSwtMoPromotion l WHERE l.mobImgName = :mobImgName")})
public class LvmtSwtMoPromotion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PROMOTION_ID")
    private BigDecimal promotionId;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "TAB_IMG_NAME")
    private String tabImgName;
    @Column(name = "PAGE_URL")
    private String pageUrl;
    @Column(name = "EXP_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expDate;
    @Column(name = "SORT_ORDER")
    private Integer sortOrder;
    @Basic(optional = false)
    @Column(name = "CREATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Column(name = "UPDATED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTime;
    @Column(name = "START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "MOB_IMG_NAME")
    private String mobImgName;
    @Lob
    @Column(name = "MOB_IMG")
    private Serializable mobImg;
    @Lob
    @Column(name = "TAB_IMG")
    private Serializable tabImg;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;

    public LvmtSwtMoPromotion() {
    }

    public LvmtSwtMoPromotion(BigDecimal promotionId) {
        this.promotionId = promotionId;
    }

    public LvmtSwtMoPromotion(BigDecimal promotionId, Date createTime) {
        this.promotionId = promotionId;
        this.createTime = createTime;
    }

    public BigDecimal getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(BigDecimal promotionId) {
        this.promotionId = promotionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTabImgName() {
        return tabImgName;
    }

    public void setTabImgName(String tabImgName) {
        this.tabImgName = tabImgName;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getMobImgName() {
        return mobImgName;
    }

    public void setMobImgName(String mobImgName) {
        this.mobImgName = mobImgName;
    }

    public Serializable getMobImg() {
        return mobImg;
    }

    public void setMobImg(Serializable mobImg) {
        this.mobImg = mobImg;
    }

    public Serializable getTabImg() {
        return tabImg;
    }

    public void setTabImg(Serializable tabImg) {
        this.tabImg = tabImg;
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
        hash += (promotionId != null ? promotionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtMoPromotion)) {
            return false;
        }
        LvmtSwtMoPromotion other = (LvmtSwtMoPromotion) object;
        if ((this.promotionId == null && other.promotionId != null) || (this.promotionId != null && !this.promotionId.equals(other.promotionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtMoPromotion[ promotionId=" + promotionId + " ]";
    }
    
}
