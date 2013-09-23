package net.stevenbyks.euler.problems;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/23/13
 * Time: 9:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class Euler009Test {
	@Test
	public void testRun() throws Exception {
		long result = Euler009.run();
		assertEquals(31875000L, result);
	}
}
