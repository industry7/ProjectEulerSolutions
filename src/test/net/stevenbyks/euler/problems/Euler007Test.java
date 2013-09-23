package net.stevenbyks.euler.problems;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/20/13
 * Time: 3:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Euler007Test {
	@Test
	public void testRun() throws Exception {
		long result = Euler007.run();
		assertEquals(104743L, result);
	}
}
