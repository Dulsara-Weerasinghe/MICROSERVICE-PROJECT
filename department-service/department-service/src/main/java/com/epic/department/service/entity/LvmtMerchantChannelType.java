/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_MERCHANT_CHANNEL_TYPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtMerchantChannelType.findAll", query = "SELECT l FROM LvmtMerchantChannelType l"),
    @NamedQuery(name = "LvmtMerchantChannelType.findByCode", query = "SELECT l FROM LvmtMerchantChannelType l WHERE l.code = :code"),
    @NamedQuery(name = "LvmtMerchantChannelType.findByDescription", query = "SELECT l FROM LvmtMerchantChannelType l WHERE l.description = :description")})
public class LvmtMerchantChannelType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODE")
    private String code;
    @Column(name = "DESCRIPTION")
    private String description;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;
    @OneToMany(mappedBy = "terType")
    private List<LvmtTerminalRequest> lvmtTerminalRequestList;
    @OneToMany(mappedBy = "terType")
    private List<LvmtTerminal> lvmtTerminalList;
    @OneToMany(mappedBy = "channelType")
    private List<LvmtMerchant> lvmtMerchantList;

    public LvmtMerchantChannelType() {
    }

    public LvmtMerchantChannelType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LvmtSwtMtStatus getStatus() {
        return status;
    }

    public void setStatus(LvmtSwtMtStatus status) {
        this.status = status;
    }

    @XmlTransient
    public List<LvmtTerminalRequest> getLvmtTerminalRequestList() {
        return lvmtTerminalRequestList;
    }

    public void setLvmtTerminalRequestList(List<LvmtTerminalRequest> lvmtTerminalRequestList) {
        this.lvmtTerminalRequestList = lvmtTerminalRequestList;
    }

    @XmlTransient
    public List<LvmtTerminal> getLvmtTerminalList() {
        return lvmtTerminalList;
    }

    public void setLvmtTerminalList(List<LvmtTerminal> lvmtTerminalList) {
        this.lvmtTerminalList = lvmtTerminalList;
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
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtMerchantChannelType)) {
            return false;
        }
        LvmtMerchantChannelType other = (LvmtMerchantChannelType) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtMerchantChannelType[ code=" + code + " ]";
    }
    
}
