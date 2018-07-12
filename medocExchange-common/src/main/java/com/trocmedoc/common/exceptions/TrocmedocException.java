package com.trocmedoc.common.exceptions;

/**
 * The Class TrocmedocException.
 */
public class TrocmedocException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6690491293672107761L;

	/**
	 * Instantiates a new trocmedoc exception.
	 */
	public TrocmedocException() {
		super();
	}

	/**
	 * Instantiates a new trocmedoc exception.
	 *
	 * @param message the message
	 */
	public TrocmedocException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new trocmedoc exception.
	 *
	 * @param cause the cause
	 */
	public TrocmedocException(Throwable cause) {
		super(cause);
	}

}
