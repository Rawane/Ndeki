package com.xoolibeut.ndeki.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Produit extends AuditInfo {
	@Id
	@GeneratedValue
	private long produitId;
	private String nom;
	private String autreNom;
	private String description;
	private long quantiteInitiale;
	private long quantite;
	private double prix;
	private double remise;
	@ManyToOne
	private Partenaire partenaire;

	public long getProduitId() {
		return produitId;
	}

	public void setProduitId(long produitId) {
		this.produitId = produitId;
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

	public Partenaire getPartenaire() {
		return partenaire;
	}

	public void setPartenaire(Partenaire partenaire) {
		this.partenaire = partenaire;
	}

	public long getQuantiteInitiale() {
		return quantiteInitiale;
	}

	public void setQuantiteInitiale(long quantiteInitiale) {
		this.quantiteInitiale = quantiteInitiale;
	}

	public long getQuantite() {
		return quantite;
	}

	public void setQuantite(long quantite) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public double getRemise() {
		return remise;
	}

	public void setRemise(double remise) {
		this.remise = remise;
	}

}
