package com.xoolibeut.ndeki.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.xoolibeut.ndeki.entities.Agent;

public interface AgentRepository extends CrudRepository<Agent, Long> {
	Page<Agent> findAll(Pageable pageable);
	
	List<Agent> findAll();	

	Agent getAgentByIdentifiant(String identifiant);

	Agent getAgentByMatricule(String matricule);

	
}
