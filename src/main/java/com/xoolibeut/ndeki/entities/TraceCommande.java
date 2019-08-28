package com.xoolibeut.ndeki.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TraceCommande {
	@Id
	@GeneratedValue
	@Column(name = "trace_commande_id")
	private long traceCommandeId;
	@ManyToOne
	@JoinColumn(name = "commande_id", nullable = false)
	private Commande commande;
	private String commentaire;
	@Column(name = "type")
	private TypeTrace type;
	@Column(name = "date")
	private Date date;

	public long getTraceCommandeId() {
		return traceCommandeId;
	}

	public void setTraceCommandeId(long traceCommandeId) {
		this.traceCommandeId = traceCommandeId;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public TypeTrace getType() {
		return type;
	}

	public void setType(TypeTrace type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
}
