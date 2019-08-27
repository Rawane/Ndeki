package com.xoolibeut.ndeki.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livreur extends Coordonnee {
	@Id
	@GeneratedValue
	private long livreurId;
	private String nom;
	private String prenom;

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

}
