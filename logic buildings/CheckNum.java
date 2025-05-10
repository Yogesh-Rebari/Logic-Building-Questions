/* Write a java program to get a number from the user and print whether it is positive or negetive?
 
Example:

Input: number : 2
Output: Number is Positive!

Input: number : -7
Output: Number is Negetive!
 */

import java.util.*;
class CheckNum{
    public static void isNumber(int num){
        if(num < 0){
            System.out.println("Number is Negetive!");
        }
        else{
            System.out.println("Number is Positive!");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        isNumber(num);

        sc.close();
    }
}
