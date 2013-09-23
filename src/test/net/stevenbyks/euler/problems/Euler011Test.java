package net.stevenbyks.euler.problems;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/23/13
 * Time: 1:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Euler011Test {
	@Test
	public void testRun() throws Exception {
		long result = Euler011.run();
		assertEquals(70600674L, result);
	}
}
