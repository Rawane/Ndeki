package com.xoolibeut.ndeki.service;

import com.xoolibeut.ndeki.entities.Partenaire;

public interface IPartenaireService {
	Partenaire addPartenaire(Partenaire partenaire);
	Iterable<Partenaire> findAll();
}
