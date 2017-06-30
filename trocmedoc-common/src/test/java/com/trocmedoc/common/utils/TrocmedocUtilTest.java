package com.trocmedoc.common.utils;

import org.junit.Test;

import com.trocmedoc.common.utils.TrocmedocUtil;

import junit.framework.Assert;

public class TrocmedocUtilTest {

	
	@Test
	public void testGetVersion() {

		// test of retrieving the project version

		Assert.assertEquals("1.0", TrocmedocUtil.getVersion());
	}
}
