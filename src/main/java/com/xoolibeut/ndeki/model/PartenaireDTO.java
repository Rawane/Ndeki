package com.xoolibeut.ndeki.model;

import java.util.Date;

public class PartenaireDTO {
	
	private Long partenaireId;

	private String nom;

	private String description;

	private String identifiant;

	private String password;

	private Integer numero;

	private String informationAccueil;

	private Date inscriptionDate;

	protected String telephone1;

	protected String telephone2;

	protected String adresseLigne1;

	protected String adresseLigne2;

	protected String adresseLigne3;

	protected Double gpsLatitude;

	protected Double gpsLongitude;

	private String typeAdresse;

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getInformationAccueil() {
		return informationAccueil;
	}

	public void setInformationAccueil(String informationAccueil) {
		this.informationAccueil = informationAccueil;
	}

	public Date getInscriptionDate() {
		return inscriptionDate;
	}

	public void setInscriptionDate(Date inscriptionDate) {
		this.inscriptionDate = inscriptionDate;
	}

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

	public Long getPartenaireId() {
		return partenaireId;
	}

	public void setPartenaireId(Long partenaireId) {
		this.partenaireId = partenaireId;
	}

	
}
