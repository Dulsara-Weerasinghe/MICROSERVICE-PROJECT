/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.department.service.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author randula_w
 */
@Entity
@Table(name = "LVMT_WB_PENDINGTASK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LvmtWbPendingtask.findAll", query = "SELECT l FROM LvmtWbPendingtask l"),
    @NamedQuery(name = "LvmtWbPendingtask.findById", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.id = :id"),
    @NamedQuery(name = "LvmtWbPendingtask.findByFields", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.fields = :fields"),
    @NamedQuery(name = "LvmtWbPendingtask.findByConfirmeduser", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.confirmeduser = :confirmeduser"),
    @NamedQuery(name = "LvmtWbPendingtask.findByLastupdatedtime", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.lastupdatedtime = :lastupdatedtime"),
    @NamedQuery(name = "LvmtWbPendingtask.findByCreatedtime", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.createdtime = :createdtime"),
    @NamedQuery(name = "LvmtWbPendingtask.findByColumn1", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.column1 = :column1"),
    @NamedQuery(name = "LvmtWbPendingtask.findByPKey", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.pKey = :pKey"),
    @NamedQuery(name = "LvmtWbPendingtask.findByPKey1", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.pKey1 = :pKey1"),
    @NamedQuery(name = "LvmtWbPendingtask.findByFieldId", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.fieldId = :fieldId"),
    @NamedQuery(name = "LvmtWbPendingtask.findByBranch", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.branch = :branch"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey1", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key1 = :key1"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey2", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key2 = :key2"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey3", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key3 = :key3"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey4", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key4 = :key4"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey5", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key5 = :key5"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey6", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key6 = :key6"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey7", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key7 = :key7"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey8", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key8 = :key8"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey9", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key9 = :key9"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey10", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key10 = :key10"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey11", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key11 = :key11"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey12", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key12 = :key12"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey13", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key13 = :key13"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey14", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key14 = :key14"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey15", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key15 = :key15"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey16", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key16 = :key16"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey17", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key17 = :key17"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey18", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key18 = :key18"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey19", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key19 = :key19"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey20", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key20 = :key20"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey21", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key21 = :key21"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey22", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key22 = :key22"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey23", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key23 = :key23"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey24", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key24 = :key24"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey25", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key25 = :key25"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey26", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key26 = :key26"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey27", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key27 = :key27"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey28", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key28 = :key28"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey29", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key29 = :key29"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey30", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key30 = :key30"),
    @NamedQuery(name = "LvmtWbPendingtask.findByRemarks", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.remarks = :remarks"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey31", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key31 = :key31"),
    @NamedQuery(name = "LvmtWbPendingtask.findByKey32", query = "SELECT l FROM LvmtWbPendingtask l WHERE l.key32 = :key32")})
public class LvmtWbPendingtask implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "FIELDS")
    private String fields;
    @Column(name = "CONFIRMEDUSER")
    private String confirmeduser;
    @Column(name = "LASTUPDATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdatedtime;
    @Column(name = "CREATEDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdtime;
    @Column(name = "COLUMN1")
    private String column1;
    @Column(name = "P_KEY")
    private String pKey;
    @Column(name = "P_KEY1")
    private String pKey1;
    @Column(name = "FIELD_ID")
    private String fieldId;
    @Column(name = "BRANCH")
    private String branch;
    @Column(name = "KEY1")
    private String key1;
    @Column(name = "KEY2")
    private String key2;
    @Column(name = "KEY3")
    private String key3;
    @Column(name = "KEY4")
    private String key4;
    @Column(name = "KEY5")
    private String key5;
    @Column(name = "KEY6")
    private String key6;
    @Column(name = "KEY7")
    private String key7;
    @Column(name = "KEY8")
    private String key8;
    @Column(name = "KEY9")
    private String key9;
    @Column(name = "KEY10")
    private String key10;
    @Column(name = "KEY11")
    private String key11;
    @Column(name = "KEY12")
    private String key12;
    @Column(name = "KEY13")
    private String key13;
    @Column(name = "KEY14")
    private String key14;
    @Column(name = "KEY15")
    private String key15;
    @Column(name = "KEY16")
    private String key16;
    @Column(name = "KEY17")
    private String key17;
    @Column(name = "KEY18")
    private String key18;
    @Column(name = "KEY19")
    private String key19;
    @Column(name = "KEY20")
    private String key20;
    @Column(name = "KEY21")
    private String key21;
    @Column(name = "KEY22")
    private String key22;
    @Column(name = "KEY23")
    private String key23;
    @Column(name = "KEY24")
    private String key24;
    @Column(name = "KEY25")
    private String key25;
    @Column(name = "KEY26")
    private String key26;
    @Column(name = "KEY27")
    private String key27;
    @Column(name = "KEY28")
    private String key28;
    @Column(name = "KEY29")
    private String key29;
    @Column(name = "KEY30")
    private String key30;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "KEY31")
    private String key31;
    @Column(name = "KEY32")
    private String key32;
    @JoinColumn(name = "STATUS", referencedColumnName = "CODE")
    @ManyToOne
    private LvmtSwtMtStatus status;
    @JoinColumn(name = "PAGECODE", referencedColumnName = "PAGECODE")
    @ManyToOne
    private LvmtWbPage pagecode;
    @JoinColumn(name = "CREATEDUSER", referencedColumnName = "USERNAME")
    @ManyToOne
    private LvmtWbSystemuser createduser;
    @JoinColumn(name = "TASK", referencedColumnName = "TASKCODE")
    @ManyToOne
    private LvmtWbTask task;

    public LvmtWbPendingtask() {
    }

    public LvmtWbPendingtask(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getConfirmeduser() {
        return confirmeduser;
    }

    public void setConfirmeduser(String confirmeduser) {
        this.confirmeduser = confirmeduser;
    }

    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getPKey() {
        return pKey;
    }

    public void setPKey(String pKey) {
        this.pKey = pKey;
    }

    public String getPKey1() {
        return pKey1;
    }

    public void setPKey1(String pKey1) {
        this.pKey1 = pKey1;
    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }

    public String getKey3() {
        return key3;
    }

    public void setKey3(String key3) {
        this.key3 = key3;
    }

    public String getKey4() {
        return key4;
    }

    public void setKey4(String key4) {
        this.key4 = key4;
    }

    public String getKey5() {
        return key5;
    }

    public void setKey5(String key5) {
        this.key5 = key5;
    }

    public String getKey6() {
        return key6;
    }

    public void setKey6(String key6) {
        this.key6 = key6;
    }

    public String getKey7() {
        return key7;
    }

    public void setKey7(String key7) {
        this.key7 = key7;
    }

    public String getKey8() {
        return key8;
    }

    public void setKey8(String key8) {
        this.key8 = key8;
    }

    public String getKey9() {
        return key9;
    }

    public void setKey9(String key9) {
        this.key9 = key9;
    }

    public String getKey10() {
        return key10;
    }

    public void setKey10(String key10) {
        this.key10 = key10;
    }

    public String getKey11() {
        return key11;
    }

    public void setKey11(String key11) {
        this.key11 = key11;
    }

    public String getKey12() {
        return key12;
    }

    public void setKey12(String key12) {
        this.key12 = key12;
    }

    public String getKey13() {
        return key13;
    }

    public void setKey13(String key13) {
        this.key13 = key13;
    }

    public String getKey14() {
        return key14;
    }

    public void setKey14(String key14) {
        this.key14 = key14;
    }

    public String getKey15() {
        return key15;
    }

    public void setKey15(String key15) {
        this.key15 = key15;
    }

    public String getKey16() {
        return key16;
    }

    public void setKey16(String key16) {
        this.key16 = key16;
    }

    public String getKey17() {
        return key17;
    }

    public void setKey17(String key17) {
        this.key17 = key17;
    }

    public String getKey18() {
        return key18;
    }

    public void setKey18(String key18) {
        this.key18 = key18;
    }

    public String getKey19() {
        return key19;
    }

    public void setKey19(String key19) {
        this.key19 = key19;
    }

    public String getKey20() {
        return key20;
    }

    public void setKey20(String key20) {
        this.key20 = key20;
    }

    public String getKey21() {
        return key21;
    }

    public void setKey21(String key21) {
        this.key21 = key21;
    }

    public String getKey22() {
        return key22;
    }

    public void setKey22(String key22) {
        this.key22 = key22;
    }

    public String getKey23() {
        return key23;
    }

    public void setKey23(String key23) {
        this.key23 = key23;
    }

    public String getKey24() {
        return key24;
    }

    public void setKey24(String key24) {
        this.key24 = key24;
    }

    public String getKey25() {
        return key25;
    }

    public void setKey25(String key25) {
        this.key25 = key25;
    }

    public String getKey26() {
        return key26;
    }

    public void setKey26(String key26) {
        this.key26 = key26;
    }

    public String getKey27() {
        return key27;
    }

    public void setKey27(String key27) {
        this.key27 = key27;
    }

    public String getKey28() {
        return key28;
    }

    public void setKey28(String key28) {
        this.key28 = key28;
    }

    public String getKey29() {
        return key29;
    }

    public void setKey29(String key29) {
        this.key29 = key29;
    }

    public String getKey30() {
        return key30;
    }

    public void setKey30(String key30) {
        this.key30 = key30;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getKey31() {
        return key31;
    }

    public void setKey31(String key31) {
        this.key31 = key31;
    }

    public String getKey32() {
        return key32;
    }

    public void setKey32(String key32) {
        this.key32 = key32;
    }

    public LvmtSwtMtStatus getStatus() {
        return status;
    }

    public void setStatus(LvmtSwtMtStatus status) {
        this.status = status;
    }

    public LvmtWbPage getPagecode() {
        return pagecode;
    }

    public void setPagecode(LvmtWbPage pagecode) {
        this.pagecode = pagecode;
    }

    public LvmtWbSystemuser getCreateduser() {
        return createduser;
    }

    public void setCreateduser(LvmtWbSystemuser createduser) {
        this.createduser = createduser;
    }

    public LvmtWbTask getTask() {
        return task;
    }

    public void setTask(LvmtWbTask task) {
        this.task = task;
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
        if (!(object instanceof LvmtWbPendingtask)) {
            return false;
        }
        LvmtWbPendingtask other = (LvmtWbPendingtask) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epic.department.service.entity.LvmtWbPendingtask[ id=" + id + " ]";
    }
    
}
