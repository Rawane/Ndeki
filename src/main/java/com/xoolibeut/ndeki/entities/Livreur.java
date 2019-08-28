package com.xoolibeut.ndeki.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livreur extends Coordonnee {
	@Id
	@GeneratedValue
	@Column(name = "livreur_id")
	private long livreurId;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	// Information technique
	@Column(name = "identifiant")
	private String identifiant;
	@Column(name = "password")
	private String password;
	@Column(name = "matricule")
	private String matricule;
	@Column(name = "adresse_mail")
	private String adresseMail;
	public long getLivreurId() {
		return livreurId;
	}

	public void setLivreurId(long livreurId) {
		this.livreurId = livreurId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
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

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

}
