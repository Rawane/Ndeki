package com.xoolibeut.ndeki.entities;

import java.util.Date;

import javax.persistence.Column;

public class AuditInfo {
	@Column(name = "creation_date")
	protected Date creationDate;
	@Column(name = "modification_date")
	protected Date modificationDate;
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getModificationDate() {
		return modificationDate;
	}
	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}
}
