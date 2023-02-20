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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_SWT_MT_SERVICE_CONFIG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtSwtMtServiceConfig.findAll", query = "SELECT l FROM LvmtSwtMtServiceConfig l"),
    @NamedQuery(name = "LvmtSwtMtServiceConfig.findById", query = "SELECT l FROM LvmtSwtMtServiceConfig l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtSwtMtServiceConfig.findByName", query = "SELECT l FROM LvmtSwtMtServiceConfig l WHERE l.name = :name"),
    @NamedQuery(name = "LvmtSwtMtServiceConfig.findByUrl", query = "SELECT l FROM LvmtSwtMtServiceConfig l WHERE l.url = :url"),
    @NamedQuery(name = "LvmtSwtMtServiceConfig.findByTimeout", query = "SELECT l FROM LvmtSwtMtServiceConfig l WHERE l.timeout = :timeout"),
    @NamedQuery(name = "LvmtSwtMtServiceConfig.findByRequestMethod", query = "SELECT l FROM LvmtSwtMtServiceConfig l WHERE l.requestMethod = :requestMethod"),
    @NamedQuery(name = "LvmtSwtMtServiceConfig.findByRequestPropertyKey", query = "SELECT l FROM LvmtSwtMtServiceConfig l WHERE l.requestPropertyKey = :requestPropertyKey"),
    @NamedQuery(name = "LvmtSwtMtServiceConfig.findByRequestPropertyValue", query = "SELECT l FROM LvmtSwtMtServiceConfig l WHERE l.requestPropertyValue = :requestPropertyValue"),
    @NamedQuery(name = "LvmtSwtMtServiceConfig.findByStatus", query = "SELECT l FROM LvmtSwtMtServiceConfig l WHERE l.status = :status")})
public class LvmtSwtMtServiceConfig implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "URL")
    private String url;
    @Column(name = "TIMEOUT")
    private Long timeout;
    @Column(name = "REQUEST_METHOD")
    private String requestMethod;
    @Column(name = "REQUEST_PROPERTY_KEY")
    private String requestPropertyKey;
    @Column(name = "REQUEST_PROPERTY_VALUE")
    private String requestPropertyValue;
    @Column(name = "STATUS")
    private Long status;

    public LvmtSwtMtServiceConfig() {
    }

    public LvmtSwtMtServiceConfig(Long id) {
        this.id = id;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getTimeout() {
        return timeout;
    }

    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestPropertyKey() {
        return requestPropertyKey;
    }

    public void setRequestPropertyKey(String requestPropertyKey) {
        this.requestPropertyKey = requestPropertyKey;
    }

    public String getRequestPropertyValue() {
        return requestPropertyValue;
    }

    public void setRequestPropertyValue(String requestPropertyValue) {
        this.requestPropertyValue = requestPropertyValue;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
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
        if (!(object instanceof LvmtSwtMtServiceConfig)) {
            return false;
        }
        LvmtSwtMtServiceConfig other = (LvmtSwtMtServiceConfig) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtSwtMtServiceConfig[ id=" + id + " ]";
    }
    
}
