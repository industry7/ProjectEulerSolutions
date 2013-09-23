package net.stevenbyks.euler.problems;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/23/13
 * Time: 9:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class Euler009 {

	public static void main(String[] args) {
		long result = Euler009.run();
		System.out.println("The product of of the Pythagorean triplet satisfying a + b + c = 1000 is: " + result);
	}

	public static long run() {
		for(int i = 1; i < 998; ++i) {
			for(int j = 1; j < 998 - i; ++j) {
				int k = 1000 - i - j;
				if(Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) {
//					System.out.println("a = " + i);
//					System.out.println("b = " + j);
//					System.out.println("c = " + k);
					return i * j * k;
				}
			}
		}
		// this should never happen
		return -1L;
	}

}
