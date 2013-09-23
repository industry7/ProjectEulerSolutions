package net.stevenbyks.euler.problems;

import net.stevenbyks.euler.utils.Prime;

import java.math.BigInteger;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/23/13
 * Time: 9:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class Euler010 {

	public static void main(String[] args) {
		long result = Euler010.run();
		System.out.println("The sum of primes below two million is: " + result);
	}

	public static long run() {
		Prime prime = new Prime();
		List<Long> list = prime.sieve(2000000);
		BigInteger sum = new BigInteger("0");
		for(long number : list) {
			sum = sum.add(BigInteger.valueOf(number));
		}
		return sum.longValue();
	}

}
