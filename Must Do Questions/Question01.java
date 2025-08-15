/* You are given an array arr of n integers. Find and return the maximum element in the array.
Input: 5
1 3 5 2 4

Output: 5 

*/

import java.util.Scanner;

public class Question01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int n = sc.nextInt();
        System.out.println("Enter the element:");
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
}