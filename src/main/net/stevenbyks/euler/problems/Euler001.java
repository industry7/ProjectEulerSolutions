package net.stevenbyks.euler.problems;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/18/13
 * Time: 9:35 AM
 * To change this template use File | Settings | File Templates.
 */

//Multiples of 3 and 5
//        Problem 1
//        Published on Friday, 5th October 2001, 06:00 pm; Solved by 322719
//
//        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//        Find the sum of all the multiples of 3 or 5 below 1000.

public class Euler001 {

	public static void main(String[] args) {
		long result = Euler001.run();
		System.out.println("The sum of all multiples of 3 or 5 below 1000 is: " + result + ".");
	}

	public static long run() {
		int sum = 0;
		for(int i = 0; i < 1000; ++i) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

}