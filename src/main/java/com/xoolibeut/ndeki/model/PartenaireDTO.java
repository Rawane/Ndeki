package com.xoolibeut.ndeki.model;

import java.util.Date;

public class PartenaireDTO extends CoordonneeDTO {
	
	private Long partenaireId;

	private String nom;

	private String description;

	private String identifiant;

	private String password;

	private String numero;

	private String informationAccueil;

	private Date inscriptionDate;

	public Long getPartenaireId() {
		return partenaireId;
	}

	public void setPartenaireId(Long partenaireId) {
		this.partenaireId = partenaireId;
	}

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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}	

	
	
}
