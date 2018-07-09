package com.trocmedoc.common.documents;

import java.io.Serializable;

public abstract class TrocmedocDocument implements Serializable {

	public abstract String getId();
	
	public boolean isNew() {
		
		return null == getId();
	}
}
