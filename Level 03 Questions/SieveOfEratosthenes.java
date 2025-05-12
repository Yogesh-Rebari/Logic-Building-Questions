/* Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number. 

Examples:

Input: n = 10
Output: 2 3 5 7
Explanation: The prime numbers up to 10 obtained by Sieve of Eratosthenes are 2 3 5 7 .

Input: n = 20
Output: 2 3 5 7 11 13 17 19
Explanation: The prime numbers up to 20 obtained by Sieve of Eratosthenes are 2 3 5 7 11 13 17 19 .

Input: n = 30
Output: 2 3 5 7 11 13 17 19 23 29
Explanation: The prime numbers up to 30 obtained by Sieve of Eratosthenes are 2 3 5 7 11 13 17 19 23 29 .
 */

import java.util.*;
class SieveOfEratosthenes{
    void sieveOfEratosthenes(int n){
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++){
            if (prime[p] == true){
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        for (int i = 2; i <= n; i++){
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n);
        SieveOfEratosthenes g = new SieveOfEratosthenes();
        g.sieveOfEratosthenes(n);

        sc.close();
    }
}