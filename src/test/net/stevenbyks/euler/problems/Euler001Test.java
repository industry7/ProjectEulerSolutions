package net.stevenbyks.euler.problems;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/19/13
 * Time: 4:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Euler001Test {
	@Test
	public void testRun() throws Exception {
		long result = Euler001.run();
		assertEquals(233168L, result);
	}
}
