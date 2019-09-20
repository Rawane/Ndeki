package com.xoolibeut.ndeki.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xoolibeut.ndeki.entities.Commande;

public interface ICommandeService {
	Commande addCommande(Commande commande);

	Commande updateCommande(Commande commande);

	void deleteCommande(Long commandeId);

	List<Commande> findAll();

	Page<Commande> getListCommandes(Pageable pageable);

	Commande getCommandeById(Long commandeId);
}
