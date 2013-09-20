package net.stevenbyks.euler.problems;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/20/13
 * Time: 11:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class Euler006Test {
	@Test
	public void testRun() throws Exception {
		long result = Euler006.run();
		assertEquals(25164150L, result);
	}
}
