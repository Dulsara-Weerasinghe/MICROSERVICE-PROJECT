/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "LVMT_SWT_MT_QUESTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtMtQuestion.findAll", query = "SELECT l FROM LvmtSwtMtQuestion l"),
    @NamedQuery(name = "LvmtSwtMtQuestion.findById", query = "SELECT l FROM LvmtSwtMtQuestion l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtSwtMtQuestion.findByQuestion", query = "SELECT l FROM LvmtSwtMtQuestion l WHERE l.question = :question"),
    @NamedQuery(name = "LvmtSwtMtQuestion.findByCreatetime", query = "SELECT l FROM LvmtSwtMtQuestion l WHERE l.createtime = :createtime"),
    @NamedQuery(name = "LvmtSwtMtQuestion.findByLastupdatedtime", query = "SELECT l FROM LvmtSwtMtQuestion l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtSwtMtQuestion.findByLastupdateduser", query = "SELECT l FROM LvmtSwtMtQuestion l WHERE l.lastupdateduser = :lastupdateduser")})
public class LvmtSwtMtQuestion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "QUESTION")
    private String question;
    @Column(name = "CREATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Column(name = "LASTUPDATEDUSER")
    private String lastupdateduser;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lvmtSwtMtQuestion")
    private List<LvmtSwtAnswers> lvmtSwtAnswersList;

    public LvmtSwtMtQuestion() {
    }

    public LvmtSwtMtQuestion(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
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
    public List<LvmtSwtAnswers> getLvmtSwtAnswersList() {
        return lvmtSwtAnswersList;
    }

    public void setLvmtSwtAnswersList(List<LvmtSwtAnswers> lvmtSwtAnswersList) {
        this.lvmtSwtAnswersList = lvmtSwtAnswersList;
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
        if (!(object instanceof LvmtSwtMtQuestion)) {
            return false;
        }
        LvmtSwtMtQuestion other = (LvmtSwtMtQuestion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtMtQuestion[ id=" + id + " ]";
    }
    
}
