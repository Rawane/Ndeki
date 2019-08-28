package com.xoolibeut.ndeki.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Partenaire extends Coordonnee {
	@Id
	@GeneratedValue
	@Column(name = "partenaire_id")
	private long partenaireId;
	@Column(name = "nom",nullable = false)
	private String nom;
	@Column(name = "description")
	private String description;
	// Information technique
	@Column(name = "identifiant")
	private String identifiant;
	@Column(name = "password")
	private String password;
	@Column(name = "numero")
	private int numero;
	@Column(name = "information_accueil")
	private String informationAccueil;
	@Column(name = "inscription_date")
	private Date inscriptionDate;

	public long getPartenaireId() {
		return partenaireId;
	}

	public void setPartenaireId(long partenaireId) {
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getInformationAccueil() {
		return informationAccueil;
	}

	public void setInformationAccueil(String informationAccueil) {
		this.informationAccueil = informationAccueil;
	}


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

	public Date getInscriptionDate() {
		return inscriptionDate;
	}

	public void setInscriptionDate(Date inscriptionDate) {
		this.inscriptionDate = inscriptionDate;
	}

}
