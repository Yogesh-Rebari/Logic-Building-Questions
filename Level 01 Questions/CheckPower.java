/* Given two positive numbers x and y, check if y is a power of x or not.
Examples : 

Input:  x = 10, y = 1
Output: True
x^0 = 1

Input:  x = 10, y = 1000
Output: True
x^3 = 1

Input:  x = 10, y = 1001
Output: False */

import java.util.*;
class CheckPower{
    public static boolean isPower(int x, int y){
        double res = Math.log(y) / Math.log(x);
        return res == Math.floor(res);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = sc.nextInt();
        System.out.println("Enter y:");
        int y = sc.nextInt();
        System.out.println(isPower(x, y));

        sc.close();
    }
}