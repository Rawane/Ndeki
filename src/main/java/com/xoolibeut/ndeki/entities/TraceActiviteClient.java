package com.xoolibeut.ndeki.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TraceActiviteClient {
	@Id
	@GeneratedValue
	private long traceActiviteClientId;
	@ManyToOne
	private Client client;
	private Date dateTrace;
	private String descriptionTrace;
	private String activite;

	public long getTraceActiviteClientId() {
		return traceActiviteClientId;
	}

	public void setTraceActiviteClientId(long traceActiviteClientId) {
		this.traceActiviteClientId = traceActiviteClientId;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getDateTrace() {
		return dateTrace;
	}

	public void setDateTrace(Date dateTrace) {
		this.dateTrace = dateTrace;
	}

	public String getDescriptionTrace() {
		return descriptionTrace;
	}

	public void setDescriptionTrace(String descriptionTrace) {
		this.descriptionTrace = descriptionTrace;
	}

	public String getActivite() {
		return activite;
	}

	public void setActivite(String activite) {
		this.activite = activite;
	}

}
