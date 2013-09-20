package net.stevenbyks.euler.problems;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/20/13
 * Time: 11:19 AM
 * To change this template use File | Settings | File Templates.
 */

//10001st prime
//		Problem 7
//
//		By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//		What is the 10 001st prime number?

public class Euler007 {

	public static void main(String[] args) {
		long result = Euler007.run();
		System.out.println("The the 10,001st prime number is: " + result);
	}

	public static long run() {
		long sumOfSquares = 0;
		long squareOfSums = 0;
		for(long l = 1; l <= 100; l++) {
			sumOfSquares += (long) Math.pow(l, 2);
			squareOfSums += l;
		}
		squareOfSums = (long) Math.pow(squareOfSums, 2);
		long answer = squareOfSums - sumOfSquares;
		return answer;
	}

}
