package com.xoolibeut.ndeki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.xoolibeut.ndeki.dao.AgentRepository;
import com.xoolibeut.ndeki.entities.Agent;
@Component
public class AgentServiceimpl implements IAgentService {
	@Autowired
	private AgentRepository agentRepository;
	@Override
	public Agent addAgent(Agent agent) {
		agentRepository.save(agent);
		return agent;
	}

	@Override
	public Agent updateAgent(Agent agent) {
		agentRepository.save(agent);
		return agent;
	}

	@Override
	public void deleteAgent(Long agentId) {
		agentRepository.deleteById(agentId);
		
	}

	@Override
	public List<Agent> findAll() {		
		return agentRepository.findAll();
	}

	@Override
	public Page<Agent> getListAgents(Pageable pageable) {		
		return agentRepository.findAll(pageable);
	}

}
