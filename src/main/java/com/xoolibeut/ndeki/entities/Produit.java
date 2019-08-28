package com.xoolibeut.ndeki.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Produit extends AuditInfo {
	@Id
	@GeneratedValue
	@Column(name = "produit_id")
	private long produitId;
	@Column(name = "nom")
	private String nom;
	@Column(name = "autre_nom")
	private String autreNom;
	@Column(name = "description")
	private String description;
	@Column(name = "stock")
	private long stock;
	@Column(name = "quantite")
	private long quantite;
	@Column(name = "prix")
	private double prix;
	@Column(name = "remise")
	private double remise;
	@Column(name = "tva")
	private double tva;	
	@ManyToOne
	@JoinColumn(name = "partenaire_id", nullable = false)
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

	public double getTva() {
		return tva;
	}

	public void setTva(double tva) {
		this.tva = tva;
	}

	public long getStock() {
		return stock;
	}

	public void setStock(long stock) {
		this.stock = stock;
	}

}
