package com.xoolibeut.ndeki.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TraceLivraison {
	@Id
	@GeneratedValue
	@Column(name = "trace_livraisonid")
	private long traceLivraisonId;
	@ManyToOne
	@JoinColumn(name = "livraison_id", nullable = false)
	private Livraison livraison;
	@Column(name = "date")
	private Date date;
	@Column(name = "type")
	private TypeTrace type;
	
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public TypeTrace getType() {
		return type;
	}
	public void setType(TypeTrace type) {
		this.type = type;
	}

	


}
