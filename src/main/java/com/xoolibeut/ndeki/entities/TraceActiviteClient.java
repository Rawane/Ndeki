package com.xoolibeut.ndeki.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TraceActiviteClient {
	@Id
	@GeneratedValue
	@Column(name = "trace_activite_client_id")
	private long traceActiviteClientId;
	@ManyToOne
	@JoinColumn(name = "client_id", nullable = false)
	private Client client;
	@Column(name = "date")
	private Date date;
	@Column(name = "description")
	private String description;
	@Column(name = "activite")
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getActivite() {
		return activite;
	}

	public void setActivite(String activite) {
		this.activite = activite;
	}

}
