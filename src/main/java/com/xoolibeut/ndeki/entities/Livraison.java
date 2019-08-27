package com.xoolibeut.ndeki.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Livraison {
	@Id
	@GeneratedValue
	private long livraisonId;
	@ManyToOne
	private Commande commande;
	@ManyToOne
	private Livreur livreur;
	private Date dateLivraison;
	private Date dateCreation;
	private String statusLivraison;
	private String commentaire;
	private long numero;
	private int ordre;

	public long getLivraisonId() {
		return livraisonId;
	}

	public void setLivraisonId(long livraisonId) {
		this.livraisonId = livraisonId;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Livreur getLivreur() {
		return livreur;
	}

	public void setLivreur(Livreur livreur) {
		this.livreur = livreur;
	}

	public Date getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public String getStatusLivraison() {
		return statusLivraison;
	}

	public void setStatusLivraison(String statusLivraison) {
		this.statusLivraison = statusLivraison;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

}
