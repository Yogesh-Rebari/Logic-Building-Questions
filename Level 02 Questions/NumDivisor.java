/* Given a number n, print all numbers in the range from 1 to n having exactly 3 divisors. 

Examples: 

Input: n = 16
Output: 4 9
Explanation: 4 and 9 have exactly three divisors.


Input: n = 49
Output: 4 9 25 49
Explanation: 4, 9, 25 and 49 have exactly three divisors. */

import java.util.*;
class NumDivisor{
    static void nums3divisor(int n){
        System.out.println("The 3 divisors numbers are:");
        for(int i=2;i*i<=n;i++){
            if(isPrime(i)){
                System.out.println(i*i+" ");
            }
        }
    }
    public static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        nums3divisor(n);

        sc.close();
    }
}