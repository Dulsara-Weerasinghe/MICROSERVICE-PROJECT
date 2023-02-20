/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_TEST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtTest.findAll", query = "SELECT l FROM LvmtTest l"),
    @NamedQuery(name = "LvmtTest.findById", query = "SELECT l FROM LvmtTest l WHERE l.lvmtTestPK.id = :id"),
    @NamedQuery(name = "LvmtTest.findByDes", query = "SELECT l FROM LvmtTest l WHERE l.lvmtTestPK.des = :des"),
    @NamedQuery(name = "LvmtTest.findByDes2", query = "SELECT l FROM LvmtTest l WHERE l.lvmtTestPK.des2 = :des2"),
    @NamedQuery(name = "LvmtTest.findByDes3", query = "SELECT l FROM LvmtTest l WHERE l.des3 = :des3")})
public class LvmtTest implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LvmtTestPK lvmtTestPK;
    @Column(name = "DES3")
    private String des3;

    public LvmtTest() {
    }

    public LvmtTest(LvmtTestPK lvmtTestPK) {
        this.lvmtTestPK = lvmtTestPK;
    }

    public LvmtTest(String id, String des, String des2) {
        this.lvmtTestPK = new LvmtTestPK(id, des, des2);
    }

    public LvmtTestPK getLvmtTestPK() {
        return lvmtTestPK;
    }

    public void setLvmtTestPK(LvmtTestPK lvmtTestPK) {
        this.lvmtTestPK = lvmtTestPK;
    }

    public String getDes3() {
        return des3;
    }

    public void setDes3(String des3) {
        this.des3 = des3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lvmtTestPK != null ? lvmtTestPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtTest)) {
            return false;
        }
        LvmtTest other = (LvmtTest) object;
        if ((this.lvmtTestPK == null && other.lvmtTestPK != null) || (this.lvmtTestPK != null && !this.lvmtTestPK.equals(other.lvmtTestPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtTest[ lvmtTestPK=" + lvmtTestPK + " ]";
    }
    
}
