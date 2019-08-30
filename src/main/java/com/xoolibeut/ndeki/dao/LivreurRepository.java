package com.xoolibeut.ndeki.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xoolibeut.ndeki.entities.Livreur;

public interface LivreurRepository extends JpaRepository<Livreur, Long> {

	Livreur getLivreurByIdentifiant(String identifiant);

	Livreur getLivreurByMatricule(String matricule);
}
