package com.bharath.flightreservation.services;



import com.bharath.flightreservation.entities.ClientInfo;

import java.util.List;

public interface ClientInfoService {

	ClientInfo saveClientInfo(ClientInfo clientInfo);

	ClientInfo updateClient(ClientInfo clientInfo);

	void deleteClient(ClientInfo clientInfo);

	ClientInfo getClientInfoById(long id);

	List<ClientInfo> getAllClientsInfo();
}
