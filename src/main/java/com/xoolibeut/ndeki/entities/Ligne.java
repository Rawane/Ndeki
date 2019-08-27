package com.xoolibeut.ndeki.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ligne {
	@Id
	@GeneratedValue
	private long ligneId;
	private Double latitudeA;
	private Double longitudeA;
	private Double latitudeB;
	private Double longitudeB;
	private int ordre;
	@ManyToOne
	private Polygone polygone;
	
	public long getLigneId() {
		return ligneId;
	}
	public void setLigneId(long ligneId) {
		this.ligneId = ligneId;
	}
	public Double getLatitudeA() {
		return latitudeA;
	}
	public void setLatitudeA(Double latitudeA) {
		this.latitudeA = latitudeA;
	}
	public Double getLongitudeA() {
		return longitudeA;
	}
	public void setLongitudeA(Double longitudeA) {
		this.longitudeA = longitudeA;
	}
	public Double getLatitudeB() {
		return latitudeB;
	}
	public void setLatitudeB(Double latitudeB) {
		this.latitudeB = latitudeB;
	}
	public Double getLongitudeB() {
		return longitudeB;
	}
	public void setLongitudeB(Double longitudeB) {
		this.longitudeB = longitudeB;
	}
	public int getOrdre() {
		return ordre;
	}
	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
	public Polygone getPolygone() {
		return polygone;
	}
	public void setPolygone(Polygone polygone) {
		this.polygone = polygone;
	}
	

}
