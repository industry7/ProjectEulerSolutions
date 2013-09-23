package net.stevenbyks.euler.problems;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/23/13
 * Time: 12:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Euler010Test {
	@Test
	public void testRun() throws Exception {
		long result = Euler010.run();
		assertEquals(142913828922L, result);
	}
}
