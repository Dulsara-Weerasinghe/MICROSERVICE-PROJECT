/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_SWT_ST_CHANNEL_CONFIG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtStChannelConfig.findAll", query = "SELECT l FROM LvmtSwtStChannelConfig l"),
    @NamedQuery(name = "LvmtSwtStChannelConfig.findById", query = "SELECT l FROM LvmtSwtStChannelConfig l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtSwtStChannelConfig.findByConnectionType", query = "SELECT l FROM LvmtSwtStChannelConfig l WHERE l.connectionType = :connectionType"),
    @NamedQuery(name = "LvmtSwtStChannelConfig.findByName", query = "SELECT l FROM LvmtSwtStChannelConfig l WHERE l.name = :name"),
    @NamedQuery(name = "LvmtSwtStChannelConfig.findByIp", query = "SELECT l FROM LvmtSwtStChannelConfig l WHERE l.ip = :ip"),
    @NamedQuery(name = "LvmtSwtStChannelConfig.findByPort", query = "SELECT l FROM LvmtSwtStChannelConfig l WHERE l.port = :port"),
    @NamedQuery(name = "LvmtSwtStChannelConfig.findByConTimeout", query = "SELECT l FROM LvmtSwtStChannelConfig l WHERE l.conTimeout = :conTimeout"),
    @NamedQuery(name = "LvmtSwtStChannelConfig.findByReadTimeout", query = "SELECT l FROM LvmtSwtStChannelConfig l WHERE l.readTimeout = :readTimeout"),
    @NamedQuery(name = "LvmtSwtStChannelConfig.findByStatus", query = "SELECT l FROM LvmtSwtStChannelConfig l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtSwtStChannelConfig.findByKeepAliveStatus", query = "SELECT l FROM LvmtSwtStChannelConfig l WHERE l.keepAliveStatus = :keepAliveStatus"),
    @NamedQuery(name = "LvmtSwtStChannelConfig.findByHeaderSize", query = "SELECT l FROM LvmtSwtStChannelConfig l WHERE l.headerSize = :headerSize"),
    @NamedQuery(name = "LvmtSwtStChannelConfig.findByChannelUid", query = "SELECT l FROM LvmtSwtStChannelConfig l WHERE l.channelUid = :channelUid"),
    @NamedQuery(name = "LvmtSwtStChannelConfig.findByInstituteId", query = "SELECT l FROM LvmtSwtStChannelConfig l WHERE l.instituteId = :instituteId")})
public class LvmtSwtStChannelConfig implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "CONNECTION_TYPE")
    private long connectionType;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "IP")
    private String ip;
    @Basic(optional = false)
    @Column(name = "PORT")
    private long port;
    @Basic(optional = false)
    @Column(name = "CON_TIMEOUT")
    private long conTimeout;
    @Basic(optional = false)
    @Column(name = "READ_TIMEOUT")
    private long readTimeout;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private long status;
    @Basic(optional = false)
    @Column(name = "KEEP_ALIVE_STATUS")
    private long keepAliveStatus;
    @Basic(optional = false)
    @Column(name = "HEADER_SIZE")
    private long headerSize;
    @Column(name = "CHANNEL_UID")
    private String channelUid;
    @Basic(optional = false)
    @Column(name = "INSTITUTE_ID")
    private String instituteId;

    public LvmtSwtStChannelConfig() {
    }

    public LvmtSwtStChannelConfig(Long id) {
        this.id = id;
    }

    public LvmtSwtStChannelConfig(Long id, long connectionType, String name, String ip, long port, long conTimeout, long readTimeout, long status, long keepAliveStatus, long headerSize, String instituteId) {
        this.id = id;
        this.connectionType = connectionType;
        this.name = name;
        this.ip = ip;
        this.port = port;
        this.conTimeout = conTimeout;
        this.readTimeout = readTimeout;
        this.status = status;
        this.keepAliveStatus = keepAliveStatus;
        this.headerSize = headerSize;
        this.instituteId = instituteId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(long connectionType) {
        this.connectionType = connectionType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public long getPort() {
        return port;
    }

    public void setPort(long port) {
        this.port = port;
    }

    public long getConTimeout() {
        return conTimeout;
    }

    public void setConTimeout(long conTimeout) {
        this.conTimeout = conTimeout;
    }

    public long getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(long readTimeout) {
        this.readTimeout = readTimeout;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public long getKeepAliveStatus() {
        return keepAliveStatus;
    }

    public void setKeepAliveStatus(long keepAliveStatus) {
        this.keepAliveStatus = keepAliveStatus;
    }

    public long getHeaderSize() {
        return headerSize;
    }

    public void setHeaderSize(long headerSize) {
        this.headerSize = headerSize;
    }

    public String getChannelUid() {
        return channelUid;
    }

    public void setChannelUid(String channelUid) {
        this.channelUid = channelUid;
    }

    public String getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(String instituteId) {
        this.instituteId = instituteId;
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
        if (!(object instanceof LvmtSwtStChannelConfig)) {
            return false;
        }
        LvmtSwtStChannelConfig other = (LvmtSwtStChannelConfig) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtStChannelConfig[ id=" + id + " ]";
    }
    
}
