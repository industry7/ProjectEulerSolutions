package net.stevenbyks.euler.problems;

import net.stevenbyks.euler.utils.Prime;

import java.util.ArrayList;
import java.util.List;

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
        long target = data.longValue();

        Prime prime = new Prime();
        long currentPrime = prime.currentLargestPrime();
        long largestPrime = 0;

        while(target > 1L) {
            if(target % currentPrime == 0) {
                target /= currentPrime;
                largestPrime = currentPrime;
            } else {
                currentPrime = prime.findNextPrimeLargerThan(currentPrime);
            }
        }

        System.out.println("The largest prime factor of " + data.longValue() + " is: " + largestPrime);
    }

}