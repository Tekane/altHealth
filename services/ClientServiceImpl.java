package com.bharath.flightreservation.services;

import com.bharath.flightreservation.entities.ClientData;
import com.bharath.flightreservation.repos.ClientDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ClientServiceImpl implements ClientService {



	@Autowired
	private ClientDataRepository repository;

	@Override
	public ClientData saveClient(ClientData clientData) {
		return repository.save(clientData);
	}

	@Override
	public ClientData updateClient(ClientData clientData) {
		return repository.save(clientData);
	}

	@Override
	public void deleteClient(ClientData clientData) {
		repository.delete(clientData);
	}

	@Override
	public ClientData getClientById(long id) {
		return repository.findOne(id);
	}

	@Override
	public List<ClientData> getAllClients() {
		return repository.findAll();
	}


	public void setRepository(ClientDataRepository repository) {
		this.repository = repository;
	}

}
