/*Given two integers a1 and a2, the first and second terms of an Arithmetic Series respectively, the problem is to find the nth term of the series. 
Examples :

Input : a1 = 2,  a2 = 3,  n = 4
Output : 5
Explanation : The series is 2, 3, 4, 5, 6, ....   , thus the 4th term is 5. 

Input : a1 = 1, a2 = 3, n = 10
Output : 19
Explanation:  The series is: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21..... Thus,10th term is 19. */

import java.util.*;
public class ArithTerm{
    public static int nthTermOfAP(int a1, int a2, int n){
        int nthTerm = a1, d = a2 - a1;
        for (int i = 1; i < n; i++) {
            nthTerm += d;
        }
        return nthTerm;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int a2 = sc.nextInt();
        System.out.println("Enter the nth term:");
        int n = sc.nextInt();
        System.out.println(nthTermOfAP(a1, a2, n));

        sc.close();
    }
}