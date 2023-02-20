/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "LVMT_SWT_ST_MASTER_CONFIG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtStMasterConfig.findAll", query = "SELECT l FROM LvmtSwtStMasterConfig l"),
    @NamedQuery(name = "LvmtSwtStMasterConfig.findById", query = "SELECT l FROM LvmtSwtStMasterConfig l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtSwtStMasterConfig.findByMinPool", query = "SELECT l FROM LvmtSwtStMasterConfig l WHERE l.minPool = :minPool"),
    @NamedQuery(name = "LvmtSwtStMasterConfig.findByMaxPool", query = "SELECT l FROM LvmtSwtStMasterConfig l WHERE l.maxPool = :maxPool"),
    @NamedQuery(name = "LvmtSwtStMasterConfig.findByMaxQueueSize", query = "SELECT l FROM LvmtSwtStMasterConfig l WHERE l.maxQueueSize = :maxQueueSize"),
    @NamedQuery(name = "LvmtSwtStMasterConfig.findByServicePort", query = "SELECT l FROM LvmtSwtStMasterConfig l WHERE l.servicePort = :servicePort"),
    @NamedQuery(name = "LvmtSwtStMasterConfig.findByServiceReadTimeout", query = "SELECT l FROM LvmtSwtStMasterConfig l WHERE l.serviceReadTimeout = :serviceReadTimeout"),
    @NamedQuery(name = "LvmtSwtStMasterConfig.findByLogBackupStatus", query = "SELECT l FROM LvmtSwtStMasterConfig l WHERE l.logBackupStatus = :logBackupStatus"),
    @NamedQuery(name = "LvmtSwtStMasterConfig.findByLogBackupPath", query = "SELECT l FROM LvmtSwtStMasterConfig l WHERE l.logBackupPath = :logBackupPath"),
    @NamedQuery(name = "LvmtSwtStMasterConfig.findByNofLogFileMaintain", query = "SELECT l FROM LvmtSwtStMasterConfig l WHERE l.nofLogFileMaintain = :nofLogFileMaintain"),
    @NamedQuery(name = "LvmtSwtStMasterConfig.findByLogLevel", query = "SELECT l FROM LvmtSwtStMasterConfig l WHERE l.logLevel = :logLevel"),
    @NamedQuery(name = "LvmtSwtStMasterConfig.findByServiceIp", query = "SELECT l FROM LvmtSwtStMasterConfig l WHERE l.serviceIp = :serviceIp"),
    @NamedQuery(name = "LvmtSwtStMasterConfig.findByBin", query = "SELECT l FROM LvmtSwtStMasterConfig l WHERE l.bin = :bin"),
    @NamedQuery(name = "LvmtSwtStMasterConfig.findByStatus", query = "SELECT l FROM LvmtSwtStMasterConfig l WHERE l.status = :status"),
    @NamedQuery(name = "LvmtSwtStMasterConfig.findByInstitute", query = "SELECT l FROM LvmtSwtStMasterConfig l WHERE l.institute = :institute"),
    @NamedQuery(name = "LvmtSwtStMasterConfig.findByDbLogStatus", query = "SELECT l FROM LvmtSwtStMasterConfig l WHERE l.dbLogStatus = :dbLogStatus"),
    @NamedQuery(name = "LvmtSwtStMasterConfig.findByBuffersize", query = "SELECT l FROM LvmtSwtStMasterConfig l WHERE l.buffersize = :buffersize")})
public class LvmtSwtStMasterConfig implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "MIN_POOL")
    private long minPool;
    @Basic(optional = false)
    @Column(name = "MAX_POOL")
    private long maxPool;
    @Basic(optional = false)
    @Column(name = "MAX_QUEUE_SIZE")
    private long maxQueueSize;
    @Basic(optional = false)
    @Column(name = "SERVICE_PORT")
    private long servicePort;
    @Column(name = "SERVICE_READ_TIMEOUT")
    private Long serviceReadTimeout;
    @Basic(optional = false)
    @Column(name = "LOG_BACKUP_STATUS")
    private long logBackupStatus;
    @Basic(optional = false)
    @Column(name = "LOG_BACKUP_PATH")
    private String logBackupPath;
    @Column(name = "NOF_LOG_FILE_MAINTAIN")
    private Long nofLogFileMaintain;
    @Basic(optional = false)
    @Column(name = "LOG_LEVEL")
    private long logLevel;
    @Column(name = "SERVICE_IP")
    private String serviceIp;
    @Column(name = "BIN")
    private Long bin;
    @Column(name = "STATUS")
    private Long status;
    @Column(name = "INSTITUTE")
    private String institute;
    @Column(name = "DB_LOG_STATUS")
    private BigInteger dbLogStatus;
    @Column(name = "BUFFERSIZE")
    private BigInteger buffersize;

    public LvmtSwtStMasterConfig() {
    }

    public LvmtSwtStMasterConfig(Long id) {
        this.id = id;
    }

    public LvmtSwtStMasterConfig(Long id, long minPool, long maxPool, long maxQueueSize, long servicePort, long logBackupStatus, String logBackupPath, long logLevel) {
        this.id = id;
        this.minPool = minPool;
        this.maxPool = maxPool;
        this.maxQueueSize = maxQueueSize;
        this.servicePort = servicePort;
        this.logBackupStatus = logBackupStatus;
        this.logBackupPath = logBackupPath;
        this.logLevel = logLevel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getMinPool() {
        return minPool;
    }

    public void setMinPool(long minPool) {
        this.minPool = minPool;
    }

    public long getMaxPool() {
        return maxPool;
    }

    public void setMaxPool(long maxPool) {
        this.maxPool = maxPool;
    }

    public long getMaxQueueSize() {
        return maxQueueSize;
    }

    public void setMaxQueueSize(long maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
    }

    public long getServicePort() {
        return servicePort;
    }

    public void setServicePort(long servicePort) {
        this.servicePort = servicePort;
    }

    public Long getServiceReadTimeout() {
        return serviceReadTimeout;
    }

    public void setServiceReadTimeout(Long serviceReadTimeout) {
        this.serviceReadTimeout = serviceReadTimeout;
    }

    public long getLogBackupStatus() {
        return logBackupStatus;
    }

    public void setLogBackupStatus(long logBackupStatus) {
        this.logBackupStatus = logBackupStatus;
    }

    public String getLogBackupPath() {
        return logBackupPath;
    }

    public void setLogBackupPath(String logBackupPath) {
        this.logBackupPath = logBackupPath;
    }

    public Long getNofLogFileMaintain() {
        return nofLogFileMaintain;
    }

    public void setNofLogFileMaintain(Long nofLogFileMaintain) {
        this.nofLogFileMaintain = nofLogFileMaintain;
    }

    public long getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(long logLevel) {
        this.logLevel = logLevel;
    }

    public String getServiceIp() {
        return serviceIp;
    }

    public void setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
    }

    public Long getBin() {
        return bin;
    }

    public void setBin(Long bin) {
        this.bin = bin;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public BigInteger getDbLogStatus() {
        return dbLogStatus;
    }

    public void setDbLogStatus(BigInteger dbLogStatus) {
        this.dbLogStatus = dbLogStatus;
    }

    public BigInteger getBuffersize() {
        return buffersize;
    }

    public void setBuffersize(BigInteger buffersize) {
        this.buffersize = buffersize;
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
        if (!(object instanceof LvmtSwtStMasterConfig)) {
            return false;
        }
        LvmtSwtStMasterConfig other = (LvmtSwtStMasterConfig) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtStMasterConfig[ id=" + id + " ]";
    }
    
}
