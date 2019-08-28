package com.xoolibeut.ndeki.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

	@Override
	public Partenaire updatePartenaire(Partenaire partenaire) {
		return partenaireRepository.save(partenaire);
	}

	@Override
	public void deletePartenaire(Long partenaireId) {
		partenaireRepository.deleteById(partenaireId);

	}

	@Override
	public Page<Partenaire> getListPartenaires(Pageable pageable) {		
		return partenaireRepository.findAll(pageable);
	}
}
