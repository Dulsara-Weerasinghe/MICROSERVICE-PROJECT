/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "LVMT_SWT_NODE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtNode.findAll", query = "SELECT l FROM LvmtSwtNode l"),
    @NamedQuery(name = "LvmtSwtNode.findById", query = "SELECT l FROM LvmtSwtNode l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtSwtNode.findByIpv4", query = "SELECT l FROM LvmtSwtNode l WHERE l.ipv4 = :ipv4")})
public class LvmtSwtNode implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "IPV4")
    private String ipv4;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "node")
    private List<LvmtSwtStListenerConfig> lvmtSwtStListenerConfigList;

    public LvmtSwtNode() {
    }

    public LvmtSwtNode(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getIpv4() {
        return ipv4;
    }

    public void setIpv4(String ipv4) {
        this.ipv4 = ipv4;
    }

    @XmlTransient
    public List<LvmtSwtStListenerConfig> getLvmtSwtStListenerConfigList() {
        return lvmtSwtStListenerConfigList;
    }

    public void setLvmtSwtStListenerConfigList(List<LvmtSwtStListenerConfig> lvmtSwtStListenerConfigList) {
        this.lvmtSwtStListenerConfigList = lvmtSwtStListenerConfigList;
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
        if (!(object instanceof LvmtSwtNode)) {
            return false;
        }
        LvmtSwtNode other = (LvmtSwtNode) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtNode[ id=" + id + " ]";
    }
    
}
