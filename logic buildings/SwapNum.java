/*Given two numbers a and b, the task is to swap them.

Examples:

Input: a = 2, b = 3
Output: a = 3, b = 2

Input: a = 20, b = 0
Output: a = 0, b = 20

Input: a = 10, b = 10
Output: a = 10, b = 10  */

import java.util.Scanner;
class SwapNum{
    public void swap(int a, int b){
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("1st num : "+a);
        System.out.println("2nd num : "+b);
    }
    public void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter 1st num : ");
       int a = sc.nextInt();
       System.out.print("Enter 2nd num : ");
       int b = sc.nextInt();
       swap(a,b);

       sc.close();
    }
}

/*Simple code for these problem is:
 class SwapNum{
    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.println("a = " + a + " b = " + b);   
      
        // Swap a and b using temp variable
        int temp = a;
        a = b;
        b = temp;
      
        System.out.println("a = " + a + " b = " + b);
    }
}
 */