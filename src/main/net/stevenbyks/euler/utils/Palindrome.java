package net.stevenbyks.euler.utils;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/18/13
 * Time: 4:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Palindrome {
    public static Boolean isPalindrome(Integer test) {
        String testString = test.toString();
        Boolean isPalindrome = true;
        int stringSize = testString.length();
        for(int i = 0; i < stringSize; ++i) {
            if(testString.charAt(i) != testString.charAt(stringSize - 1 - i)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
