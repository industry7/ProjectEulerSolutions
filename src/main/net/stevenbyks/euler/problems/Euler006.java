package net.stevenbyks.euler.problems;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/20/13
 * Time: 11:05 AM
 * To change this template use File | Settings | File Templates.
 */

//Sum square difference
//		Problem 6
//
//		The sum of the squares of the first ten natural numbers is,
//		12 + 22 + ... + 102 = 385
//
//		The square of the sum of the first ten natural numbers is,
//		(1 + 2 + ... + 10)2 = 552 = 3025
//
//		Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//
//		Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class Euler006 {

	public static void main(String[] args) {
		long result = Euler006.run();
		System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is: " + result);
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
