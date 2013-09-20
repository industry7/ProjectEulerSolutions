package net.stevenbyks.euler.problems;

import net.stevenbyks.euler.utils.Prime;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/19/13
 * Time: 9:29 AM
 * To change this template use File | Settings | File Templates.
 */

//Smallest multiple
//        Problem 5
//
//        2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//        What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class Euler005 {
	public static void main(String[] args) {

		Prime prime = new Prime();
		Map<Long, Long> lcm = new HashMap<Long, Long>();

		for (long l = 2; l <= 20; ++l) {
			Map<Long, Long> primeFactorsOfL = prime.primeFactors(l);
			lcm = prime.leastCommonMultiple(lcm, primeFactorsOfL);
		}

		Set<Long> primeFactors = lcm.keySet();
		Long answer = 1L;
		for (Long l : primeFactors) {
			answer *= (long) Math.pow(l, lcm.get(l));
		}

		System.out.println("The smallest positive number that is evenly divisible by all the numbers from 1 to 20 is: " + answer);
	}
}
