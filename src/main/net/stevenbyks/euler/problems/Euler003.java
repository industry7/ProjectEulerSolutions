package net.stevenbyks.euler.problems;

import net.stevenbyks.euler.utils.PrimeList;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/18/13
 * Time: 10:18 AM
 * To change this template use File | Settings | File Templates.
 */

//Largest prime factor
//        Problem 3
//
//        The prime factors of 13195 are 5, 7, 13 and 29.
//
//        What is the largest prime factor of the number 600851475143 ?

public class Euler003 {
	public static final Long data = 600851475143L;

	public static void main(String[] args) {
		long result = Euler003.run();
		System.out.println("The largest prime factor of " + data.longValue() + " is: " + result);
	}

	public static long run() {
		long target = data.longValue();

		PrimeList primeList = new PrimeList();
		Iterator<Long> primeIterator = primeList.iterator();
		long currentPrime = primeIterator.next();
		long largestPrime = 0;

		while (target > 1L) {
			if (target % currentPrime == 0) {
				target /= currentPrime;
				largestPrime = currentPrime;
			} else {
				currentPrime = primeIterator.next();
			}
		}

		return largestPrime;
	}

}
