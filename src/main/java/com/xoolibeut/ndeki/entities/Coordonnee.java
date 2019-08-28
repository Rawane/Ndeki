package com.xoolibeut.ndeki.entities;

import javax.persistence.Column;

public class Coordonnee extends AuditInfo {
	@Column(name = "telephone1")
	protected String telephone1;
	@Column(name = "telephone2")
	protected String telephone2;
	@Column(name = "adresse_ligne1")
	protected String adresseLigne1;
	@Column(name = "adresse_ligne2")
	protected String adresseLigne2;
	@Column(name = "adresse_ligne3")
	protected String adresseLigne3;
	@Column(name = "gps_latitude")
	protected Double gpsLatitude;
	@Column(name = "gps_longitude")
	protected Double gpsLongitude;
	@Column(name = "type_adresse")
	private String typeAdresse;

	public String getTelephone1() {
		return telephone1;
	}

	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}

	public String getTelephone2() {
		return telephone2;
	}

	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}

	public String getAdresseLigne1() {
		return adresseLigne1;
	}

	public void setAdresseLigne1(String adresseLigne1) {
		this.adresseLigne1 = adresseLigne1;
	}

	public String getAdresseLigne2() {
		return adresseLigne2;
	}

	public void setAdresseLigne2(String adresseLigne2) {
		this.adresseLigne2 = adresseLigne2;
	}

	public String getAdresseLigne3() {
		return adresseLigne3;
	}

	public void setAdresseLigne3(String adresseLigne3) {
		this.adresseLigne3 = adresseLigne3;
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

	public String getTypeAdresse() {
		return typeAdresse;
	}

	public void setTypeAdresse(String typeAdresse) {
		this.typeAdresse = typeAdresse;
	}

}
