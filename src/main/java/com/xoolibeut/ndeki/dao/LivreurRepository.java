package com.xoolibeut.ndeki.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.xoolibeut.ndeki.entities.Livreur;

public interface LivreurRepository extends CrudRepository<Livreur, Long> {

	Page<Livreur> findAll(Pageable pageable);

	List<Livreur> findAll();

	Livreur getLivreurByIdentifiant(String identifiant);

	Livreur getLivreurByMatricule(String matricule);
}
