package com.xoolibeut.ndeki.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Polygone {
	@Id
	@GeneratedValue
	@Column(name = "polygone_id")
	private long polygoneId;
	@OneToMany
	private Set<Ligne> lignes;
	public long getPolygoneId() {
		return polygoneId;
	}
	public void setPolygoneId(long polygoneId) {
		this.polygoneId = polygoneId;
	}
	public Set<Ligne> getLignes() {
		return lignes;
	}
	public void setLignes(Set<Ligne> lignes) {
		this.lignes = lignes;
	}
	
	

}
