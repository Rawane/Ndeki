package com.xoolibeut.ndeki.model;

public class QuartierDTO {
	private long quartierId;

	private String nom;

	private String autreNom;

	private String description;

	private Long villeId;

	private Long polygoneId;

	private Long partenaireId;

	private Long livreurId;
	public long getQuartierId() {
		return quartierId;
	}

	public void setQuartierId(long quartierId) {
		this.quartierId = quartierId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAutreNom() {
		return autreNom;
	}

	public void setAutreNom(String autreNom) {
		this.autreNom = autreNom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getVilleId() {
		return villeId;
	}

	public void setVilleId(Long villeId) {
		this.villeId = villeId;
	}

	public Long getPolygoneId() {
		return polygoneId;
	}

	public void setPolygoneId(Long polygoneId) {
		this.polygoneId = polygoneId;
	}

	public Long getPartenaireId() {
		return partenaireId;
	}

	public void setPartenaireId(Long partenaireId) {
		this.partenaireId = partenaireId;
	}

	public Long getLivreurId() {
		return livreurId;
	}

	public void setLivreurId(Long livreurId) {
		this.livreurId = livreurId;
	}
}
