/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "LVMT_SWT_ANSWERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtAnswers.findAll", query = "SELECT l FROM LvmtSwtAnswers l"),
    @NamedQuery(name = "LvmtSwtAnswers.findById", query = "SELECT l FROM LvmtSwtAnswers l WHERE l.lvmtSwtAnswersPK.id = :id"),
    @NamedQuery(name = "LvmtSwtAnswers.findByQuestionId", query = "SELECT l FROM LvmtSwtAnswers l WHERE l.lvmtSwtAnswersPK.questionId = :questionId"),
    @NamedQuery(name = "LvmtSwtAnswers.findByAnswer", query = "SELECT l FROM LvmtSwtAnswers l WHERE l.answer = :answer"),
    @NamedQuery(name = "LvmtSwtAnswers.findByStatus", query = "SELECT l FROM LvmtSwtAnswers l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtSwtAnswers.findByCreateDate", query = "SELECT l FROM LvmtSwtAnswers l WHERE l.createDate = :createDate"),
    @NamedQuery(name = "LvmtSwtAnswers.findByDeviceId", query = "SELECT l FROM LvmtSwtAnswers l WHERE l.deviceId = :deviceId")})
public class LvmtSwtAnswers implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LvmtSwtAnswersPK lvmtSwtAnswersPK;
    @Column(name = "ANSWER")
    private String answer;
    @Column(name = "STATUS")
    private BigInteger status;
    @Basic(optional = false)
    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @Column(name = "DEVICE_ID")
    private BigInteger deviceId;
    @JoinColumn(name = "QUESTION_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private LvmtSwtMtQuestion lvmtSwtMtQuestion;

    public LvmtSwtAnswers() {
    }

    public LvmtSwtAnswers(LvmtSwtAnswersPK lvmtSwtAnswersPK) {
        this.lvmtSwtAnswersPK = lvmtSwtAnswersPK;
    }

    public LvmtSwtAnswers(LvmtSwtAnswersPK lvmtSwtAnswersPK, Date createDate, BigInteger deviceId) {
        this.lvmtSwtAnswersPK = lvmtSwtAnswersPK;
        this.createDate = createDate;
        this.deviceId = deviceId;
    }

    public LvmtSwtAnswers(BigInteger id, BigInteger questionId) {
        this.lvmtSwtAnswersPK = new LvmtSwtAnswersPK(id, questionId);
    }

    public LvmtSwtAnswersPK getLvmtSwtAnswersPK() {
        return lvmtSwtAnswersPK;
    }

    public void setLvmtSwtAnswersPK(LvmtSwtAnswersPK lvmtSwtAnswersPK) {
        this.lvmtSwtAnswersPK = lvmtSwtAnswersPK;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public BigInteger getStatus() {
        return status;
    }

    public void setStatus(BigInteger status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public BigInteger getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(BigInteger deviceId) {
        this.deviceId = deviceId;
    }

    public LvmtSwtMtQuestion getLvmtSwtMtQuestion() {
        return lvmtSwtMtQuestion;
    }

    public void setLvmtSwtMtQuestion(LvmtSwtMtQuestion lvmtSwtMtQuestion) {
        this.lvmtSwtMtQuestion = lvmtSwtMtQuestion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lvmtSwtAnswersPK != null ? lvmtSwtAnswersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtAnswers)) {
            return false;
        }
        LvmtSwtAnswers other = (LvmtSwtAnswers) object;
        if ((this.lvmtSwtAnswersPK == null && other.lvmtSwtAnswersPK != null) || (this.lvmtSwtAnswersPK != null && !this.lvmtSwtAnswersPK.equals(other.lvmtSwtAnswersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtAnswers[ lvmtSwtAnswersPK=" + lvmtSwtAnswersPK + " ]";
    }
    
}
