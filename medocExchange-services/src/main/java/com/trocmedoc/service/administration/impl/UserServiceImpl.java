package com.trocmedoc.service.administration.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.trocmedoc.common.documents.administration.User;
import com.trocmedoc.common.dto.administration.UserDto;
import com.trocmedoc.common.exceptions.TrocmedocServiceException;
import com.trocmedoc.persistence.repository.administration.UserRepository;
import com.trocmedoc.service.AbstractMutableTrocmedocService;
import com.trocmedoc.service.administration.UserService;

/**
 * The Class UserServiceImpl.
 *
 * @author andriantomanga
 */
@Service(value = "userService")
public class UserServiceImpl extends AbstractMutableTrocmedocService<User, UserDto> implements UserService {

	/** The user repository. */
	@Autowired
	private UserRepository userRepository;

	/* (non-Javadoc)
	 * @see com.trocmedoc.service.administration.UserService#authentifyUser(java.lang.String, java.lang.String)
	 */
	@Override
	public UserDto authentifyUser(String email, String password) throws TrocmedocServiceException {

		final User foundUser = userRepository.findByEmail(email);

		if (foundUser == null) {

			throw new TrocmedocServiceException("Unknown user is trying to authentify ...");
		}
		if (!foundUser.getPassword().trim().equals(password.trim())) {

			throw new TrocmedocServiceException("Wrong password ...");
		}
		return convertToDto(foundUser);
	}
	
	/* (non-Javadoc)
	 * @see com.trocmedoc.service.TrocmedocService#getRepository()
	 */
	@Override
	public MongoRepository<User, String> getRepository() {

		return userRepository;
	}

	/* (non-Javadoc)
	 * @see com.trocmedoc.service.TrocmedocService#convertToDto(com.trocmedoc.common.documents.TrocmedocDocument)
	 */
	@Override
	public UserDto convertToDto(User user) {

		return convertToDto(user, UserDto.class);
	}
	
	/* (non-Javadoc)
	 * @see com.trocmedoc.service.TrocmedocService#convertToDocument(com.trocmedoc.common.dto.AbstractDto)
	 */
	@Override
	public User convertToDocument(UserDto dto) {
		
		return convertToDocument(dto, User.class);
	}

}
