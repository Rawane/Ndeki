package com.xoolibeut.ndeki.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xoolibeut.ndeki.dao.PartenaireRepository;
import com.xoolibeut.ndeki.entities.Partenaire;
@Component
public class PartenaireServiceImpl implements IPartenaireService {
	@Autowired
	private PartenaireRepository partenaireRepository;

	public Partenaire addPartenaire(Partenaire partenaire) {
		partenaireRepository.save(partenaire);		
		return partenaire;
	}

	@Override
	public Iterable<Partenaire> findAll() {
		
		return partenaireRepository.findAll();
	}
}
