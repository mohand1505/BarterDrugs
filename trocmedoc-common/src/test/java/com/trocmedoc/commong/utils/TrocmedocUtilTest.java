package com.trocmedoc.commong.utils;

import org.junit.Test;

import junit.framework.Assert;

public class TrocmedocUtilTest {

	/**
	 * Testing {@link TrocmedocUtil}
	 */
	@Test
	public void testGetVersion() {

		// test of retrieving the project version

		Assert.assertEquals("1.0", TrocmedocUtil.getVersion());
	}
}
