package net.stevenbyks.euler.problems;

import static net.stevenbyks.euler.utils.Palindrome.isPalindrome;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/18/13
 * Time: 4:02 PM
 * To change this template use File | Settings | File Templates.
 */

//Largest palindrome product
//        Problem 4
//
//        A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//        Find the largest palindrome made from the product of two 3-digit numbers.
//
//        Answer:
//        906609

public class Euler004 {

	public static void main(String[] args) {
		long result = Euler004.run();
		System.out.println("The largest palindrome that is a product of two 3-digit numbers is: " + result);
	}

	public static long run() {
		int largestPalindrome = 0;
		int currentProduct = 0;
		for (int i = 900; i < 1000; ++i) {
			for (int j = 900; j < 1000; ++j) {
				currentProduct = i * j;
				if (isPalindrome(currentProduct)) {
					if (currentProduct > largestPalindrome) {
						largestPalindrome = currentProduct;
					}
				}
			}
		}
		return largestPalindrome;
	}

}
