package com.keda.minidao.entity;

// Generated 2018-6-7 15:13:48 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * WmsLoc generated by hbm2java
 */
public class WmsLoc implements java.io.Serializable {

	private Integer id;
	private String createName;
	private String createBy;
	private Date createDate;
	private String updateName;
	private String updateBy;
	private Date updateDate;
	private String sysOrgCode;
	private String sysCompanyCode;
	private String bpmStatus;
	private String locno;
	private String zoneno;
	private String zonename;
	private String locstatus;
	private String locsize;
	private String loclevel;
	private String locweight;
	private String weight;
	private String mix;
	private String remarks;
	private String topflag;
	private Integer layer;

	public WmsLoc() {
	}

	public WmsLoc(String createName, String createBy, Date createDate,
			String updateName, String updateBy, Date updateDate,
			String sysOrgCode, String sysCompanyCode, String bpmStatus,
			String locno, String zoneno, String zonename, String locstatus,
			String locsize, String loclevel, String locweight, String weight,
			String mix, String remarks, String top, Integer layer) {
		this.createName = createName;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateName = updateName;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
		this.sysOrgCode = sysOrgCode;
		this.sysCompanyCode = sysCompanyCode;
		this.bpmStatus = bpmStatus;
		this.locno = locno;
		this.zoneno = zoneno;
		this.zonename = zonename;
		this.locstatus = locstatus;
		this.locsize = locsize;
		this.loclevel = loclevel;
		this.locweight = locweight;
		this.weight = weight;
		this.mix = mix;
		this.remarks = remarks;
		this.topflag = top;
		this.layer = layer;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCreateName() {
		return this.createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateName() {
		return this.updateName;
	}

	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getSysOrgCode() {
		return this.sysOrgCode;
	}

	public void setSysOrgCode(String sysOrgCode) {
		this.sysOrgCode = sysOrgCode;
	}

	public String getSysCompanyCode() {
		return this.sysCompanyCode;
	}

	public void setSysCompanyCode(String sysCompanyCode) {
		this.sysCompanyCode = sysCompanyCode;
	}

	public String getBpmStatus() {
		return this.bpmStatus;
	}

	public void setBpmStatus(String bpmStatus) {
		this.bpmStatus = bpmStatus;
	}

	public String getLocno() {
		return this.locno;
	}

	public void setLocno(String locno) {
		this.locno = locno;
	}

	public String getZoneno() {
		return this.zoneno;
	}

	public void setZoneno(String zoneno) {
		this.zoneno = zoneno;
	}

	public String getZonename() {
		return this.zonename;
	}

	public void setZonename(String zonename) {
		this.zonename = zonename;
	}

	public String getLocstatus() {
		return this.locstatus;
	}

	public void setLocstatus(String locstatus) {
		this.locstatus = locstatus;
	}

	public String getLocsize() {
		return this.locsize;
	}

	public void setLocsize(String locsize) {
		this.locsize = locsize;
	}

	public String getLoclevel() {
		return this.loclevel;
	}

	public void setLoclevel(String loclevel) {
		this.loclevel = loclevel;
	}

	public String getLocweight() {
		return this.locweight;
	}

	public void setLocweight(String locweight) {
		this.locweight = locweight;
	}

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getMix() {
		return this.mix;
	}

	public void setMix(String mix) {
		this.mix = mix;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getTopflag() {
		return this.topflag;
	}

	public void setTopflag(String topflag) {
		this.topflag = topflag;
	}

	public Integer getLayer() {
		return this.layer;
	}

	public void setLayer(Integer layer) {
		this.layer = layer;
	}

}