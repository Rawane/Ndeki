package com.xoolibeut.ndeki.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ConnectionClient {
	@Id
	@GeneratedValue
	@Column(name = "connection_client_id")
	private long connectionClientId;
	@Column(name = "date_connection")
	private Date dateConnection;
	@Column(name = "gps_latitude")
	private Double gpsLatitude;
	@Column(name = "gps_longitude")
	private Double gpsLongitude;
	@ManyToOne
	@JoinColumn(name = "client_id", nullable = false)
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
