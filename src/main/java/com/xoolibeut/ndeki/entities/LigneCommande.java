package com.xoolibeut.ndeki.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class LigneCommande {
	@Id
	@GeneratedValue
	private long ligneCommandeId;
	private long quantite;
	private double totalRemise;
	private double total;
	@ManyToOne
	private Produit produit;
	@ManyToOne
	private Commande commande;

	public long getLigneCommandeId() {
		return ligneCommandeId;
	}

	public void setLigneCommandeId(long ligneCommandeId) {
		this.ligneCommandeId = ligneCommandeId;
	}

	public long getQuantite() {
		return quantite;
	}

	public void setQuantite(long quantite) {
		this.quantite = quantite;
	}

	

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public double getTotalRemise() {
		return totalRemise;
	}

	public void setTotalRemise(double totalRemise) {
		this.totalRemise = totalRemise;
	}

}
