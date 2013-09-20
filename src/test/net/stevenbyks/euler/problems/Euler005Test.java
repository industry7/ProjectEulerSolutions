package net.stevenbyks.euler.problems;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/20/13
 * Time: 10:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class Euler005Test {
	@Test
	public void testRun() throws Exception {
		long result = Euler005.run();
		assertEquals(232792560L, result);
	}
}
