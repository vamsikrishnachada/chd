package com.clitesol.chd.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepository extends MongoRepository<User, String> {

}
