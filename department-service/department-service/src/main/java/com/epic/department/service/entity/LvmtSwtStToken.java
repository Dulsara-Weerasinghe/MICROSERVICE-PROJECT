/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_SWT_ST_TOKEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtStToken.findAll", query = "SELECT l FROM LvmtSwtStToken l"),
    @NamedQuery(name = "LvmtSwtStToken.findByToken", query = "SELECT l FROM LvmtSwtStToken l WHERE l.token = :token"),
    @NamedQuery(name = "LvmtSwtStToken.findByInstrumrntType", query = "SELECT l FROM LvmtSwtStToken l WHERE l.instrumrntType = :instrumrntType"),
    @NamedQuery(name = "LvmtSwtStToken.findByCardNo", query = "SELECT l FROM LvmtSwtStToken l WHERE l.cardNo = :cardNo"),
    @NamedQuery(name = "LvmtSwtStToken.findByExpireDate", query = "SELECT l FROM LvmtSwtStToken l WHERE l.expireDate = :expireDate"),
    @NamedQuery(name = "LvmtSwtStToken.findByCvv", query = "SELECT l FROM LvmtSwtStToken l WHERE l.cvv = :cvv"),
    @NamedQuery(name = "LvmtSwtStToken.findByAccountNo", query = "SELECT l FROM LvmtSwtStToken l WHERE l.accountNo = :accountNo"),
    @NamedQuery(name = "LvmtSwtStToken.findByBankCode", query = "SELECT l FROM LvmtSwtStToken l WHERE l.bankCode = :bankCode"),
    @NamedQuery(name = "LvmtSwtStToken.findByDeviceId", query = "SELECT l FROM LvmtSwtStToken l WHERE l.deviceId = :deviceId"),
    @NamedQuery(name = "LvmtSwtStToken.findByMaskCard", query = "SELECT l FROM LvmtSwtStToken l WHERE l.maskCard = :maskCard"),
    @NamedQuery(name = "LvmtSwtStToken.findByMaskAccount", query = "SELECT l FROM LvmtSwtStToken l WHERE l.maskAccount = :maskAccount"),
    @NamedQuery(name = "LvmtSwtStToken.findByRandomAmount", query = "SELECT l FROM LvmtSwtStToken l WHERE l.randomAmount = :randomAmount"),
    @NamedQuery(name = "LvmtSwtStToken.findByStatus", query = "SELECT l FROM LvmtSwtStToken l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtSwtStToken.findByAccountType", query = "SELECT l FROM LvmtSwtStToken l WHERE l.accountType = :accountType"),
    @NamedQuery(name = "LvmtSwtStToken.findByNickName", query = "SELECT l FROM LvmtSwtStToken l WHERE l.nickName = :nickName"),
    @NamedQuery(name = "LvmtSwtStToken.findByCif", query = "SELECT l FROM LvmtSwtStToken l WHERE l.cif = :cif")})
public class LvmtSwtStToken implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TOKEN")
    private String token;
    @Column(name = "INSTRUMRNT_TYPE")
    private String instrumrntType;
    @Column(name = "CARD_NO")
    private String cardNo;
    @Column(name = "EXPIRE_DATE")
    private String expireDate;
    @Column(name = "CVV")
    private String cvv;
    @Column(name = "ACCOUNT_NO")
    private String accountNo;
    @Column(name = "BANK_CODE")
    private String bankCode;
    @Column(name = "DEVICE_ID")
    private Long deviceId;
    @Column(name = "MASK_CARD")
    private String maskCard;
    @Column(name = "MASK_ACCOUNT")
    private String maskAccount;
    @Column(name = "RANDOM_AMOUNT")
    private String randomAmount;
    @Column(name = "STATUS")
    private BigInteger status;
    @Column(name = "ACCOUNT_TYPE")
    private String accountType;
    @Column(name = "NICK_NAME")
    private String nickName;
    @Column(name = "CIF")
    private String cif;
    @OneToMany(mappedBy = "token")
    private List<LvmtJpChallangeReqHistory> lvmtJpChallangeReqHistoryList;

    public LvmtSwtStToken() {
    }

    public LvmtSwtStToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getInstrumrntType() {
        return instrumrntType;
    }

    public void setInstrumrntType(String instrumrntType) {
        this.instrumrntType = instrumrntType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getMaskCard() {
        return maskCard;
    }

    public void setMaskCard(String maskCard) {
        this.maskCard = maskCard;
    }

    public String getMaskAccount() {
        return maskAccount;
    }

    public void setMaskAccount(String maskAccount) {
        this.maskAccount = maskAccount;
    }

    public String getRandomAmount() {
        return randomAmount;
    }

    public void setRandomAmount(String randomAmount) {
        this.randomAmount = randomAmount;
    }

    public BigInteger getStatus() {
        return status;
    }

    public void setStatus(BigInteger status) {
        this.status = status;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    @XmlTransient
    public List<LvmtJpChallangeReqHistory> getLvmtJpChallangeReqHistoryList() {
        return lvmtJpChallangeReqHistoryList;
    }

    public void setLvmtJpChallangeReqHistoryList(List<LvmtJpChallangeReqHistory> lvmtJpChallangeReqHistoryList) {
        this.lvmtJpChallangeReqHistoryList = lvmtJpChallangeReqHistoryList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (token != null ? token.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtSwtStToken)) {
            return false;
        }
        LvmtSwtStToken other = (LvmtSwtStToken) object;
        if ((this.token == null && other.token != null) || (this.token != null && !this.token.equals(other.token))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtStToken[ token=" + token + " ]";
    }
    
}
