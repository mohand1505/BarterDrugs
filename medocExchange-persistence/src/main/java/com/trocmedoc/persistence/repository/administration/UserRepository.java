package com.trocmedoc.persistence.repository.administration;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.trocmedoc.common.documents.administration.User;

/**
 * The Interface UserRepository.
 *
 * @author andriantomanga
 */
@Repository(value = "userRepository")
public interface UserRepository extends MongoRepository<User, String> {

	/**
	 * Find by email.
	 *
	 * @param email the email
	 * @return the user
	 */
	User findByEmail(final String email);
	
}
