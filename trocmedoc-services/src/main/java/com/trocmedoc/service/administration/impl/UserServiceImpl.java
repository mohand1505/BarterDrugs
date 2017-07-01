package com.trocmedoc.service.administration.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.trocmedoc.common.documents.administration.User;
import com.trocmedoc.common.dto.administration.UserDto;
import com.trocmedoc.common.exceptions.TrocmedocServiceException;
import com.trocmedoc.persistence.repository.UserRepository;
import com.trocmedoc.service.AbstractTrocmedocService;
import com.trocmedoc.service.administration.UserService;

/**
 * @author andriantomanga
 */
@Service(value = "userService")
public class UserServiceImpl extends AbstractTrocmedocService<User, UserDto> implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public MongoRepository<User, String> getRepository() {

		return userRepository;
	}

	@Override
	public UserDto authentifyUser(String email, String password) throws TrocmedocServiceException {

		final User foundUser = userRepository.findByEmail(email);

		if (foundUser == null) {

			throw new TrocmedocServiceException("Unknown user is trying to authentify ...");
		}
		if (!foundUser.getPassword().trim().equals(password.trim())) {

			throw new TrocmedocServiceException("Wrong password ...");
		}
		return convertToDto(foundUser, UserDto.class);
	}

}
