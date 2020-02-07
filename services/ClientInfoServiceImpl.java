package com.bharath.flightreservation.services;


import com.bharath.flightreservation.entities.ClientInfo;

import com.bharath.flightreservation.repos.ClientInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientInfoServiceImpl implements ClientInfoService {



	@Autowired
	private ClientInfoRepository repository;

	@Override
	public ClientInfo saveClientInfo(ClientInfo clientInfo) {
		return repository.save(clientInfo);
	}

	@Override
	public ClientInfo updateClient(ClientInfo clientInfo) {
		return repository.save(clientInfo);
	}

	@Override
	public void deleteClient(ClientInfo clientInfo) {
		repository.delete(clientInfo);
	}

	@Override
	public ClientInfo getClientInfoById(long id) {
		return repository.findOne(id);
	}

	@Override
	public List<ClientInfo> getAllClientsInfo() {
		return repository.findAll();
	}


	public void setRepository(ClientInfoRepository repository) {
		this.repository = repository;
	}

}
