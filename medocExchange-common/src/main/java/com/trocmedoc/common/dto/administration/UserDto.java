package com.trocmedoc.common.dto.administration;

import com.trocmedoc.common.dto.AbstractDto;

/**
 * The Class UserDto.
 *
 * @author andriantomanga
 */
public class UserDto extends AbstractDto {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6026614706533273298L;

	/** The id. */
	private String id;

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The email. */
	private String email;

	/** The password. */
	private String password;

	/* (non-Javadoc)
	 * @see com.trocmedoc.common.dto.AbstractDto#getId()
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
