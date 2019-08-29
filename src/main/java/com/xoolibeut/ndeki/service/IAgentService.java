package com.xoolibeut.ndeki.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xoolibeut.ndeki.entities.Agent;

public interface IAgentService {
	Agent addAgent(Agent agent);

	Agent updateAgent(Agent agent);

	void deleteAgent(Long agentId);

	List<Agent> findAll();

	Page<Agent> getListAgents(Pageable pageable);
}
