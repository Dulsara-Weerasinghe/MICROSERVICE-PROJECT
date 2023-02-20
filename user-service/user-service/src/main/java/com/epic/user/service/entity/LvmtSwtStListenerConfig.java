/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_SWT_ST_LISTENER_CONFIG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtStListenerConfig.findAll", query = "SELECT l FROM LvmtSwtStListenerConfig l"),
    @NamedQuery(name = "LvmtSwtStListenerConfig.findById", query = "SELECT l FROM LvmtSwtStListenerConfig l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtSwtStListenerConfig.findByName", query = "SELECT l FROM LvmtSwtStListenerConfig l WHERE l.name = :name"),
    @NamedQuery(name = "LvmtSwtStListenerConfig.findByPort", query = "SELECT l FROM LvmtSwtStListenerConfig l WHERE l.port = :port"),
    @NamedQuery(name = "LvmtSwtStListenerConfig.findByReadTimeout", query = "SELECT l FROM LvmtSwtStListenerConfig l WHERE l.readTimeout = :readTimeout"),
    @NamedQuery(name = "LvmtSwtStListenerConfig.findByConnectionType", query = "SELECT l FROM LvmtSwtStListenerConfig l WHERE l.connectionType = :connectionType"),
    @NamedQuery(name = "LvmtSwtStListenerConfig.findByStatus", query = "SELECT l FROM LvmtSwtStListenerConfig l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtSwtStListenerConfig.findByPrefix", query = "SELECT l FROM LvmtSwtStListenerConfig l WHERE l.prefix = :prefix"),
    @NamedQuery(name = "LvmtSwtStListenerConfig.findByListnerUid", query = "SELECT l FROM LvmtSwtStListenerConfig l WHERE l.listnerUid = :listnerUid"),
    @NamedQuery(name = "LvmtSwtStListenerConfig.findByBacklogSize", query = "SELECT l FROM LvmtSwtStListenerConfig l WHERE l.backlogSize = :backlogSize"),
    @NamedQuery(name = "LvmtSwtStListenerConfig.findByHeaderSize", query = "SELECT l FROM LvmtSwtStListenerConfig l WHERE l.headerSize = :headerSize"),
    @NamedQuery(name = "LvmtSwtStListenerConfig.findByInstituteId", query = "SELECT l FROM LvmtSwtStListenerConfig l WHERE l.instituteId = :instituteId")})
public class LvmtSwtStListenerConfig implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "PORT")
    private long port;
    @Basic(optional = false)
    @Column(name = "READ_TIMEOUT")
    private long readTimeout;
    @Basic(optional = false)
    @Column(name = "CONNECTION_TYPE")
    private long connectionType;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private long status;
    @Basic(optional = false)
    @Column(name = "PREFIX")
    private String prefix;
    @Basic(optional = false)
    @Column(name = "LISTNER_UID")
    private String listnerUid;
    @Basic(optional = false)
    @Column(name = "BACKLOG_SIZE")
    private long backlogSize;
    @Basic(optional = false)
    @Column(name = "HEADER_SIZE")
    private long headerSize;
    @Column(name = "INSTITUTE_ID")
    private String instituteId;
    @JoinColumn(name = "NODE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private LvmtSwtNode node;

    public LvmtSwtStListenerConfig() {
    }

    public LvmtSwtStListenerConfig(Long id) {
        this.id = id;
    }

    public LvmtSwtStListenerConfig(Long id, String name, long port, long readTimeout, long connectionType, long status, String prefix, String listnerUid, long backlogSize, long headerSize) {
        this.id = id;
        this.name = name;
        this.port = port;
        this.readTimeout = readTimeout;
        this.connectionType = connectionType;
        this.status = status;
        this.prefix = prefix;
        this.listnerUid = listnerUid;
        this.backlogSize = backlogSize;
        this.headerSize = headerSize;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPort() {
        return port;
    }

    public void setPort(long port) {
        this.port = port;
    }

    public long getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(long readTimeout) {
        this.readTimeout = readTimeout;
    }

    public long getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(long connectionType) {
        this.connectionType = connectionType;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getListnerUid() {
        return listnerUid;
    }

    public void setListnerUid(String listnerUid) {
        this.listnerUid = listnerUid;
    }

    public long getBacklogSize() {
        return backlogSize;
    }

    public void setBacklogSize(long backlogSize) {
        this.backlogSize = backlogSize;
    }

    public long getHeaderSize() {
        return headerSize;
    }

    public void setHeaderSize(long headerSize) {
        this.headerSize = headerSize;
    }

    public String getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(String instituteId) {
        this.instituteId = instituteId;
    }

    public LvmtSwtNode getNode() {
        return node;
    }

    public void setNode(LvmtSwtNode node) {
        this.node = node;
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
        if (!(object instanceof LvmtSwtStListenerConfig)) {
            return false;
        }
        LvmtSwtStListenerConfig other = (LvmtSwtStListenerConfig) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtStListenerConfig[ id=" + id + " ]";
    }
    
}
