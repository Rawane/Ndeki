package com.xoolibeut.ndeki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xoolibeut.ndeki.dao.CommandeRepository;
import com.xoolibeut.ndeki.entities.Commande;

public class CommandeServiceImpl implements ICommandeService {
	@Autowired
	private CommandeRepository commandeRepository;

	@Override
	public Commande addCommande(Commande commande) {
		commandeRepository.save(commande);
		return commande;
	}

	@Override
	public Commande updateCommande(Commande commande) {
		commandeRepository.save(commande);
		return commande;
	}

	@Override
	public void deleteCommande(Long commandeId) {
		commandeRepository.deleteById(commandeId);

	}

	@Override
	public List<Commande> findAll() {
		return commandeRepository.findAll();
	}

	@Override
	public Page<Commande> getListCommandes(Pageable pageable) {
		return commandeRepository.findAll(pageable);
	}

	@Override
	public Commande getCommandeById(Long commandeId) {
		return commandeRepository.getOne(commandeId);
	}

}
