package com.trocmedoc.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.trocmedoc.common.documents.administration.User;

/**
 * @author andriantomanga
 */
@Repository(value = "userRepository")
public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(final String email);
	
}
