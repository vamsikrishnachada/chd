package com.clitesol.chd.repository;

import com.clitesol.chd.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends MongoRepository<Customer, String> {
}
