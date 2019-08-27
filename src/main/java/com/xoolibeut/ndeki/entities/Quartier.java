package com.xoolibeut.ndeki.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Quartier extends AuditInfo {
	@Id
	@GeneratedValue
	private long quartierId;
	private String nom;
	private String autreNom;
	private String description;
	@ManyToOne
	private Ville ville;
	@ManyToOne
	private Polygone polygone;

	public long getQuartierId() {
		return quartierId;
	}

	public void setQuartierId(long quartierId) {
		this.quartierId = quartierId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAutreNom() {
		return autreNom;
	}

	public void setAutreNom(String autreNom) {
		this.autreNom = autreNom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public Polygone getPolygone() {
		return polygone;
	}

	public void setPolygone(Polygone polygone) {
		this.polygone = polygone;
	}

}
