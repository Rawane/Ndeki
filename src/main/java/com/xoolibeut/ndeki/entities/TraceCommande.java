package com.xoolibeut.ndeki.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TraceCommande {
	@Id
	@GeneratedValue
	private long traceCommandeId;
	@ManyToOne
	private Commande commande;
	private String commentaire;
	private TypeTrace typeTrace;
	private Date dateTrace;

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

	public TypeTrace getTypeTrace() {
		return typeTrace;
	}

	public void setTypeTrace(TypeTrace typeTrace) {
		this.typeTrace = typeTrace;
	}

	public Date getDateTrace() {
		return dateTrace;
	}

	public void setDateTrace(Date dateTrace) {
		this.dateTrace = dateTrace;
	}
}
