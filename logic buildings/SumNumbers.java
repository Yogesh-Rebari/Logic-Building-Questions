/*Given a number n, find the sum of the first n natural numbers.

Examples : 

Input: n = 3
Output: 6
Explanation: Note that 1 + 2 + 3 = 6

Input  : 5
Output : 15 
Explanation : Note that 1 + 2 + 3 + 4 + 5 = 15*/

import java.util.Scanner;

class SumNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        //By using formula
        sum = (n*(n+1))/2;

        /*OR we can use these loop as well
        for(int i=1;i<=n;i++){
           sum += i;
        }*/
        
        System.out.println(sum);
        sc.close();
    }
}