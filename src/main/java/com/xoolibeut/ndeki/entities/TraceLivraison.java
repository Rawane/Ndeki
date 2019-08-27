package com.xoolibeut.ndeki.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TraceLivraison {
	@Id
	@GeneratedValue
	private long traceLivraisonId;
	@ManyToOne
	private Livraison livraison;
	private Date dateTrace;
	private TypeTrace typeTrace;

	public long getTraceLivraisonId() {
		return traceLivraisonId;
	}

	public void setTraceLivraisonId(long traceLivraisonId) {
		this.traceLivraisonId = traceLivraisonId;
	}

	public Livraison getLivraison() {
		return livraison;
	}

	public void setLivraison(Livraison livraison) {
		this.livraison = livraison;
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
