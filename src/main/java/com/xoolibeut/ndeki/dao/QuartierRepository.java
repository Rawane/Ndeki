package com.xoolibeut.ndeki.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xoolibeut.ndeki.entities.Quartier;

public interface QuartierRepository extends JpaRepository<Quartier, Long> {

	Quartier getQuartierByNom(String nom);

	Quartier getQuartierByAutreNom(String autreNom);

	List<Quartier> getListQuartierByVilleVilleId(Long villeId);

	List<Quartier> getListQuartierByPartenairePartenaireId(Long partenaireId);

	List<Quartier> getListQuartierByLivreurLivreurId(Long livreurId);
}
