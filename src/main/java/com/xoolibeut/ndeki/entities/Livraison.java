package com.xoolibeut.ndeki.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Livraison {
	@Id
	@GeneratedValue
	@Column(name = "livraison_id")
	private long livraisonId;
	@ManyToOne
	@JoinColumn(name = "commande_id", nullable = false)
	private Commande commande;
	@ManyToOne
	@JoinColumn(name = "livreur_id", nullable = false)
	private Livreur livreur;
	@Column(name = "date_livraison")
	private Date dateLivraison;
	@Column(name = "date_creation")
	private Date dateCreation;
	@Column(name = "status_livraison")
	private String statusLivraison;
	@Column(name = "commentaire")
	private String commentaire;
	@Column(name = "numero")
	private long numero;
	@Column(name = "ordre")
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
