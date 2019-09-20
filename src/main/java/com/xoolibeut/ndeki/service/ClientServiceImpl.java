package com.xoolibeut.ndeki.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xoolibeut.ndeki.dao.ClientRepository;
import com.xoolibeut.ndeki.entities.Client;

public class ClientServiceImpl implements IClientService {
	private ClientRepository clientRepository;

	@Override
	public Client addClient(Client client) {
		client.setCreationDate(new Date());
		client.setModificationDate(client.getModificationDate());
		clientRepository.save(client);
		return client;
	}

	@Override
	public Client updateClient(Client client) {
		client.setCreationDate(new Date());
		clientRepository.save(client);
		return client;
	}

	@Override
	public void deleteClient(Long clientId) {
		clientRepository.deleteById(clientId);

	}

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public Page<Client> getListClients(Pageable pageable) {

		return clientRepository.findAll(pageable);
	}

	@Override
	public Client getClientById(Long clientId) {

		return clientRepository.getOne(clientId);
	}

}
