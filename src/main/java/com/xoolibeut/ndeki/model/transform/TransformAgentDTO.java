package com.xoolibeut.ndeki.model.transform;

import java.util.function.Function;

import com.xoolibeut.ndeki.entities.Agent;
import com.xoolibeut.ndeki.model.AgentDTO;


public class TransformAgentDTO implements Function<Agent, AgentDTO> {

	@Override
	public AgentDTO apply(Agent agent) {
		var agentDTO = new AgentDTO();
		agentDTO.setAdresseLigne1(agent.getAdresseLigne1());
		agentDTO.setAdresseLigne2(agent.getAdresseLigne2());
		agentDTO.setAdresseLigne3(agent.getAdresseLigne3());
		agentDTO.setTypeAdresse(agent.getTypeAdresse());
		agentDTO.setTelephone1(agent.getTelephone1());
		agentDTO.setTelephone2(agent.getTelephone2());
		agentDTO.setGpsLatitude(agent.getGpsLatitude());
		agentDTO.setGpsLongitude(agent.getGpsLongitude());
		agentDTO.setIdentifiant(agent.getIdentifiant());		
		agentDTO.setNom(agent.getNom());
		agentDTO.setPrenom(agent.getPrenom());
		agentDTO.setMatricule(agent.getMatricule());
		agentDTO.setQualite(agent.getQualite());
		agentDTO.setPassword(agent.getPassword());
		return agentDTO;
	}

}
