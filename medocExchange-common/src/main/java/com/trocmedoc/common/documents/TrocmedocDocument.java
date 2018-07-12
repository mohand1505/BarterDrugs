package com.trocmedoc.common.documents;

import java.io.Serializable;

public abstract class TrocmedocDocument implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2765802074416330867L;

	public abstract String getId();
	
	public boolean isNew() {
		
		return null == getId();
	}
}
