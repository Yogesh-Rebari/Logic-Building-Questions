/* Given three sides, check whether triangle is valid or not. 

Examples:  

Input :  a = 7, b = 10, c = 5 
Output : Valid
We can draw a triangle with the given three edge lengths.

Input : a = 1, b = 10, c = 12 
Output : Invalid
We can not draw a triangle with the given three edge lengths. */

import java.util.*;
class ValidTriangle{
    public static void isTriangle(int a, int b, int c){
        if(a<b+c && b<a+c && c<a+b){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        isTriangle(a, b, c);

        sc.close();
    }
}