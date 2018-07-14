package com.clitesol.chd.repository;

import com.clitesol.chd.model.ServiceTicket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceTicketRepository extends MongoRepository<ServiceTicket, String> {
}
