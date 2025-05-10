/* 
 Write a program to find the factorial of any numbers enters by the user.
 
 Example:

 Input: Factorial of : 5
 Output: Factorial of 5 is 120

 Input: Factorial of : 1
 Output: Factorial of 1 is 1
 */

 import java.util.*;
 class Factorial{
    public static int isFactorial(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return n*isFactorial(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Factorial of : ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is "+isFactorial(n));

        sc.close();
    }
 }

