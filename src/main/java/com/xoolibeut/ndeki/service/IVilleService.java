package com.xoolibeut.ndeki.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xoolibeut.ndeki.entities.Ville;

public interface IVilleService {
	Ville addVille(Ville ville);

	Ville updateVille(Ville ville);

	void deleteVille(Long villeId);

	Page<Ville> findAll(Pageable pageable);

	List<Ville> findAll();

	Ville getVilleByNom(String nom);

	Ville getVilleByCode(String code);
}
