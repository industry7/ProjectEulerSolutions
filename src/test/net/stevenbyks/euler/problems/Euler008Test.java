package net.stevenbyks.euler.problems;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/23/13
 * Time: 9:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class Euler008Test {
	@Test
	public void testRun() throws Exception {
		long result = Euler008.run();
		assertEquals(40824L, result);
	}
}
