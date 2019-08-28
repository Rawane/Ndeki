package com.xoolibeut.ndeki.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class LigneCommande {
	@Id
	@GeneratedValue
	@Column(name = "ligne_commande_id")
	private long ligneCommandeId;
	@Column(name = "quantite")
	private long quantite;
	@Column(name = "total_remise")
	private double totalRemise;
	@Column(name = "total")
	private double total;
	@ManyToOne
	@JoinColumn(name = "produit_id", nullable = false)
	private Produit produit;	
	@ManyToOne
	@JoinColumn(name = "commande_id", nullable = false)
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
