package com.xoolibeut.ndeki.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xoolibeut.ndeki.entities.Partenaire;

public interface PartenaireRepository extends JpaRepository<Partenaire, Long> {
	Partenaire getPartenaireByNom(String nom);

	Partenaire getPartenaireByIdentifiant(String identifiant);

	Partenaire getPartenaireByNumero(String numero);
}
