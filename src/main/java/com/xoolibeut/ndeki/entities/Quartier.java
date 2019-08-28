package com.xoolibeut.ndeki.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Quartier extends AuditInfo {
	@Id
	@GeneratedValue
	@Column(name = "quartier_id")
	private long quartierId;
	@Column(name = "nom", nullable = false)
	private String nom;
	@Column(name = "autre_nom")
	private String autreNom;
	@Column(name = "description")
	private String description;
	@ManyToOne
	@JoinColumn(name = "ville_id", nullable = false)
	private Ville ville;
	@ManyToOne
	@JoinColumn(name = "polygone_id")
	private Polygone polygone;
	@ManyToOne
	@JoinColumn(name = "partenaire_id")
	private Partenaire partenaire;
	@ManyToOne
	@JoinColumn(name = "livreur_id")
	private Livreur livreur;

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

	public Partenaire getPartenaire() {
		return partenaire;
	}

	public void setPartenaire(Partenaire partenaire) {
		this.partenaire = partenaire;
	}

	public Livreur getLivreur() {
		return livreur;
	}

	public void setLivreur(Livreur livreur) {
		this.livreur = livreur;
	}

}
