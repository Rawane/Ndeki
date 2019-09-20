package com.xoolibeut.ndeki.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xoolibeut.ndeki.entities.Client;

public interface IClientService {

	Client addClient(Client client);

	Client updateClient(Client client);

	void deleteClient(Long clientId);

	List<Client> findAll();

	Page<Client> getListClients(Pageable pageable);

	Client getClientById(Long clientId);
}
