package com.trocmedoc.common.exceptions;

public class TrocmedocException extends Exception {

	private static final long serialVersionUID = -6690491293672107761L;

	public TrocmedocException() {
		super();
	}

	public TrocmedocException(String message) {
		super(message);
	}

	public TrocmedocException(Throwable cause) {
		super(cause);
	}

}
