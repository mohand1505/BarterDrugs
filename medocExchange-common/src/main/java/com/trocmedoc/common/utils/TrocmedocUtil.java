package com.trocmedoc.common.utils;

import java.io.InputStream;
import java.util.Properties;

/**
 * The Class TrocmedocUtil.
 *
 * @author andriantomanga
 */
public final class TrocmedocUtil {

	/**
	 * Instantiates a new trocmedoc util.
	 */
	private TrocmedocUtil() {
		throw new AssertionError();
	}

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public synchronized static final String getVersion() {
		String version = null;

		// we first try to load the version from maven 
		try {
			Properties p = new Properties();
			InputStream is = TrocmedocUtil.class
					.getResourceAsStream("/META-INF/maven/com.trocmedoc/trocmedoc-common/pom.properties");
			if (is != null) {
				p.load(is);
				version = p.getProperty("version", "");
			}
		} catch (Exception e) {
			// ignore
		}

		if (version == null) {
			Package aPackage = TrocmedocUtil.class.getPackage();
			if (aPackage != null) {
				version = aPackage.getImplementationVersion();
				if (version == null) {
					version = aPackage.getSpecificationVersion();
				}
			}
		}

		if (version == null) {
			version = "";
		}

		return version;
	}
}
