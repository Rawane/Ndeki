package com.xoolibeut.ndeki.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ConnectionClient {
	@Id
	@GeneratedValue
	private long connectionClientId;
	private Date dateConnection;
	private Double gpsLatitude;
	private Double gpsLongitude;
	@ManyToOne
	private Client client;

	public long getConnectionClientId() {
		return connectionClientId;
	}

	public void setConnectionClientId(long connectionClientId) {
		this.connectionClientId = connectionClientId;
	}

	public Date getDateConnection() {
		return dateConnection;
	}

	public void setDateConnection(Date dateConnection) {
		this.dateConnection = dateConnection;
	}

	public Double getGpsLatitude() {
		return gpsLatitude;
	}

	public void setGpsLatitude(Double gpsLatitude) {
		this.gpsLatitude = gpsLatitude;
	}

	public Double getGpsLongitude() {
		return gpsLongitude;
	}

	public void setGpsLongitude(Double gpsLongitude) {
		this.gpsLongitude = gpsLongitude;
	}

}
