/*You are given a cubic dice with 6 faces. All the individual faces have a number printed on them. The numbers are in the range of 1 to 6, like any ordinary dice. You will be provided with a face of this cube, your task is to guess the number on the opposite face of the cube.

Examples:

Input: n = 2
Output: 5
Explanation: For dice facing number 5 opposite face will have the number 2.

Input: 6 = 6
Output: 1
Explanation: For dice facing number 6 opposite face will have the number 1. */

import java.util.Scanner;
class DiceFace{
    public static int findDiceFace(int n){
        int ans = 7-n;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dice face : ");
        int n = sc.nextInt();
        System.out.println("Opposite face of dice is : "+findDiceFace(n));

        sc.close();
    }
}
