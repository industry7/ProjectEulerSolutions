package net.stevenbyks.euler.problems;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/18/13
 * Time: 9:55 AM
 * To change this template use File | Settings | File Templates.
 */

//Even Fibonacci numbers
//        Problem 2
//
//        Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
//
//        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//        By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

public class Euler002 {

	public static void main(String[] args) {
		Integer result = Euler002.run();
		System.out.println("The sum of fibonacci numbers below four million is: " + result + ".");
	}

	public static Integer run() {
		Integer sum = 0;
		Integer fibonacciN;
		Integer fibonacciNminusOne = 2;
		Integer fibonacciNminusTwo = 1;

		fibonacciN = fibonacciNminusOne + fibonacciNminusTwo;
		sum += fibonacciNminusOne;

		while (fibonacciN < 4000000) {
			if (fibonacciN % 2 == 0) {
				sum += fibonacciN;
			}
			fibonacciNminusTwo = fibonacciNminusOne;
			fibonacciNminusOne = fibonacciN;
			fibonacciN = fibonacciNminusOne + fibonacciNminusTwo;
		}

		return sum;
	}

}