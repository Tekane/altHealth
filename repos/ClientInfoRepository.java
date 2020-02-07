package com.bharath.flightreservation.repos;

import com.bharath.flightreservation.entities.ClientData;
import com.bharath.flightreservation.entities.ClientInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientInfoRepository extends JpaRepository<ClientInfo,Long>{
}
