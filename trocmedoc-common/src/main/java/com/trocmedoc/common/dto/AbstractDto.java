/**
 * 
 */
package com.trocmedoc.common.dto;

import java.io.Serializable;

/**
 * @author andriantomanga
 */
public abstract class AbstractDto implements Serializable {

	private static final long serialVersionUID = -5575077075465145508L;

	public abstract String getId();
}
