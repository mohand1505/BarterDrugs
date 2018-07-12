/**
 * 
 */
package com.trocmedoc.service.administration;

import com.trocmedoc.common.documents.administration.User;
import com.trocmedoc.common.dto.administration.UserDto;
import com.trocmedoc.common.exceptions.TrocmedocServiceException;
import com.trocmedoc.service.MutableTrocmedocService;

/**
 * The Interface UserService.
 *
 * @author andriantomanga
 */
public interface UserService extends MutableTrocmedocService<User, UserDto> {

	/**
	 * Authentify the user by using his email and password.
	 *
	 * @param email            the email of the user
	 * @param password            the password of the user
	 * @return the user if he is authentified, else null
	 * @throws TrocmedocServiceException             cannot authentify the user
	 */
	UserDto authentifyUser(final String email, final String password) throws TrocmedocServiceException;
}
