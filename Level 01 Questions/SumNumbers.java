/*Given a number n, find the sum of its digits.

Examples : 

Input: n = 687
Output: 21
Explanation: The sum of its digits are: 6 + 8 + 7 = 21

Input: n = 12
Output: 3
Explanation: The sum of its digits are: 1 + 2 = 3 */

import java.util.*;
class SumNumbers{
    static int sumOfNumbers(String s){
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            // Extract digit from character
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        String s = sc.next();
        System.out.print(sumOfNumbers(s));

        sc.close();
    }
}