/* Write a program to reverse digits of a number

Given an Integer n, find the reverse of its digits.

Examples:  

Input: n = 122
Output: 221
Explanation: By reversing the digits of number, number will change into 221.

Input: n = 200
Output: 2
Explanation: By reversing the digits of number, number will change into 2.

Input: n = 12345 
Output: 54321
Explanation: By reversing the digits of number, number will change into 54321. */

// Java program to reverse a number

public class ReverseDigit{
    public static int reversDigits(int n) {
        // converting number to string
        StringBuffer s = new StringBuffer(String.valueOf(n));

        // reversing the string
        s.reverse();

        // converting string to integer
        n = Integer.parseInt(String.valueOf(s));

        // returning integer
        return n;
    }
    public static void main(String[] args) {
        int n = 4562;
        System.out.println(reversDigits(n));
    }
}