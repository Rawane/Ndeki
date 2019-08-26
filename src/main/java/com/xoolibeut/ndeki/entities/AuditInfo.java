package com.xoolibeut.ndeki.entities;

import java.util.Date;

public class AuditInfo {
	protected Date creationDate;
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
