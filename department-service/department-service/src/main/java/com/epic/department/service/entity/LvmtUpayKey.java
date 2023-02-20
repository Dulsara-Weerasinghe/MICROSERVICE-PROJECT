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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_UPAY_KEY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtUpayKey.findAll", query = "SELECT l FROM LvmtUpayKey l"),
    @NamedQuery(name = "LvmtUpayKey.findById", query = "SELECT l FROM LvmtUpayKey l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtUpayKey.findByDescription", query = "SELECT l FROM LvmtUpayKey l WHERE l.description = :description"),
    @NamedQuery(name = "LvmtUpayKey.findBySignCertId", query = "SELECT l FROM LvmtUpayKey l WHERE l.signCertId = :signCertId"),
    @NamedQuery(name = "LvmtUpayKey.findByEncryCertId", query = "SELECT l FROM LvmtUpayKey l WHERE l.encryCertId = :encryCertId")})
public class LvmtUpayKey implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "DESCRIPTION")
    private String description;
    @Lob
    @Column(name = "ENCRY_PRIVATE_KEY")
    private String encryPrivateKey;
    @Lob
    @Column(name = "SIGN_PUBLIC_KEY")
    private String signPublicKey;
    @Lob
    @Column(name = "SIGN_PRIVATE_KEY")
    private String signPrivateKey;
    @Lob
    @Column(name = "ENCRY_PUBLIC_KEY")
    private String encryPublicKey;
    @Column(name = "SIGN_CERT_ID")
    private String signCertId;
    @Column(name = "ENCRY_CERT_ID")
    private String encryCertId;

    public LvmtUpayKey() {
    }

    public LvmtUpayKey(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEncryPrivateKey() {
        return encryPrivateKey;
    }

    public void setEncryPrivateKey(String encryPrivateKey) {
        this.encryPrivateKey = encryPrivateKey;
    }

    public String getSignPublicKey() {
        return signPublicKey;
    }

    public void setSignPublicKey(String signPublicKey) {
        this.signPublicKey = signPublicKey;
    }

    public String getSignPrivateKey() {
        return signPrivateKey;
    }

    public void setSignPrivateKey(String signPrivateKey) {
        this.signPrivateKey = signPrivateKey;
    }

    public String getEncryPublicKey() {
        return encryPublicKey;
    }

    public void setEncryPublicKey(String encryPublicKey) {
        this.encryPublicKey = encryPublicKey;
    }

    public String getSignCertId() {
        return signCertId;
    }

    public void setSignCertId(String signCertId) {
        this.signCertId = signCertId;
    }

    public String getEncryCertId() {
        return encryCertId;
    }

    public void setEncryCertId(String encryCertId) {
        this.encryCertId = encryCertId;
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
        if (!(object instanceof LvmtUpayKey)) {
            return false;
        }
        LvmtUpayKey other = (LvmtUpayKey) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtUpayKey[ id=" + id + " ]";
    }
    
}
