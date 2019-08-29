package com.xoolibeut.ndeki.model.transform;

import java.util.function.Function;

import com.xoolibeut.ndeki.entities.Agent;
import com.xoolibeut.ndeki.model.AgentDTO;


public class TransformAgent implements Function<AgentDTO, Agent> {

	@Override
	public Agent apply(AgentDTO agentDTO) {
		var agent = new Agent();
		agent.setAdresseLigne1(agentDTO.getAdresseLigne1());
		agent.setAdresseLigne2(agentDTO.getAdresseLigne2());
		agent.setAdresseLigne3(agentDTO.getAdresseLigne3());
		agent.setTypeAdresse(agentDTO.getTypeAdresse());
		agent.setTelephone1(agentDTO.getTelephone1());
		agent.setTelephone2(agentDTO.getTelephone2());
		agent.setGpsLatitude(agentDTO.getGpsLatitude());
		agent.setGpsLongitude(agentDTO.getGpsLongitude());
		agent.setIdentifiant(agentDTO.getIdentifiant());		
		agent.setNom(agentDTO.getNom());
		agent.setPrenom(agentDTO.getPrenom());
		agent.setMatricule(agentDTO.getMatricule());
		agent.setQualite(agentDTO.getQualite());
		agent.setPassword(agentDTO.getPassword());
		return agent;
	}

}
