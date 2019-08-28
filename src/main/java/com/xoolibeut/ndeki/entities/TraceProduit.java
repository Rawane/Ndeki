package com.xoolibeut.ndeki.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TraceProduit {
	@Id
	@GeneratedValue
	@Column(name = "trace_produit_id")
	private long traceProduitId;
	@Column(name = "date")
	private Date date;
	@ManyToOne
	@JoinColumn(name = "produit_id", nullable = false)
	private Produit produit;
	@Column(name = "type")
	private TypeTrace type;
	@Column(name = "description")
	private String description;
	@Column(name = "value")
	private String value;
	public long getTraceProduitId() {
		return traceProduitId;
	}
	public void setTraceProduitId(long traceProduitId) {
		this.traceProduitId = traceProduitId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public TypeTrace getType() {
		return type;
	}
	public void setType(TypeTrace type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
