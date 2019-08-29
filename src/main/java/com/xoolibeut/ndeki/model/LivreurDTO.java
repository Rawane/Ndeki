package com.xoolibeut.ndeki.model;

public class LivreurDTO extends CoordonneeDTO {

	private Long livreurId;

	private String nom;
	private String prenom;
	private String description;

	private String identifiant;

	private String password;

	private String matricule;	

	private String status;

	public Long getLivreurId() {
		return livreurId;
	}

	public void setLivreurId(Long livreurId) {
		this.livreurId = livreurId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

	

}
