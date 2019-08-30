package com.xoolibeut.ndeki.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.xoolibeut.ndeki.entities.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long> {
	Page<Agent> findAll(Pageable pageable);

	Agent getAgentByIdentifiant(String identifiant);

	Agent getAgentByMatricule(String matricule);

}
