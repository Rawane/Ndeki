package com.xoolibeut.ndeki.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xoolibeut.ndeki.entities.Ville;

public interface VilleRepository extends JpaRepository<Ville, Long> {

	Ville getVilleByNom(String nom);

	Ville getVilleByCode(String code);
}
