package com.xoolibeut.ndeki.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ville extends AuditInfo {
	@Id
	@GeneratedValue
	@Column(name = "ville_id")
	private long villeId;
	@Column(name = "nom")
	private String nom;
	@Column(name = "code")
	private String code;

	public long getVilleId() {
		return villeId;
	}

	public void setVilleId(long villeId) {
		this.villeId = villeId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
