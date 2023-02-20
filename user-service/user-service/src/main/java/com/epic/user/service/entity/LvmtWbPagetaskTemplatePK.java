/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.user.service.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author randula_w
 */
@Embeddable
public class LvmtWbPagetaskTemplatePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PAGECODE")
    private String pagecode;
    @Basic(optional = false)
    @Column(name = "TASKCODE")
    private String taskcode;

    public LvmtWbPagetaskTemplatePK() {
    }

    public LvmtWbPagetaskTemplatePK(String pagecode, String taskcode) {
        this.pagecode = pagecode;
        this.taskcode = taskcode;
    }

    public String getPagecode() {
        return pagecode;
    }

    public void setPagecode(String pagecode) {
        this.pagecode = pagecode;
    }

    public String getTaskcode() {
        return taskcode;
    }

    public void setTaskcode(String taskcode) {
        this.taskcode = taskcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pagecode != null ? pagecode.hashCode() : 0);
        hash += (taskcode != null ? taskcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LvmtWbPagetaskTemplatePK)) {
            return false;
        }
        LvmtWbPagetaskTemplatePK other = (LvmtWbPagetaskTemplatePK) object;
        if ((this.pagecode == null && other.pagecode != null) || (this.pagecode != null && !this.pagecode.equals(other.pagecode))) {
            return false;
        }
        if ((this.taskcode == null && other.taskcode != null) || (this.taskcode != null && !this.taskcode.equals(other.taskcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbPagetaskTemplatePK[ pagecode=" + pagecode + ", taskcode=" + taskcode + " ]";
    }
    
}
