/* Given n, count all 'a' and 'b' that satisfy the condition a^3 + b^3 = n. Where (a, b) and (b, a) are considered two different pairs

Examples: 

Input: n = 9
Output: 2
Explanation: 1^3 + 2^3 = 9 and 2^3 + 1^3 = 9

Input: n = 28
Output: 2
Explanation: 1^3 + 3^3 = 28 and 3^3 + 1^3 = 28 */

import java.util.*;
class CubeCount{
    public static int pairCubeCount(int n){
        int count = 0;
        for(int i=1;i<=Math.cbrt(n);i++){
            if(i*i*i<=n){
                int cb = i*i*i;
                int diff = n-cb;
                int cbrtDiff = (int)Math.cbrt(diff);
                if(cbrtDiff*cbrtDiff*cbrtDiff == diff){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println(pairCubeCount(n));

        sc.close();
    }
}