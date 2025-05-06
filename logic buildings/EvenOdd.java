/*Given a number n, check whether it is even or odd. Return true for even and false for odd.
Examples: 
Input: 2 
Output: true
Input: 5
Output: false*/

import java.util.*;

class EvenOdd{
    public static void EvenOrOdd(int number){
        if(number % 2 == 0){
            System.out.println("Even Number.");
        }
        else{
            System.out.println("Odd number.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        EvenOrOdd(number);
        sc.close();
    }
}