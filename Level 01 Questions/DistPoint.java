/* You are given two coordinates (x1, y1) and (x2, y2) of a two-dimensional graph. Find the distance between them.

Examples: 

Input : x1, y1 = (3, 4)
        x2, y2 = (7, 7)
Output : 5

Input : x1, y1 = (3, 4) 
        x2, y2 = (4, 3)
Output : 1.41421 */

import java.util.*;
public class DistPoint{
    public static int distance(int x1, int y1, int x2, int y2){
        double dist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        int dis = (int) dist;
        return dis;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 point:");
        int x1 = sc.nextInt();
        System.out.println("Enter y1 point:");
        int y1 = sc.nextInt();
        System.out.println("Enter x2 point:");
        int x2 = sc.nextInt();
        System.out.println("Enter y2 point:");
        int y2 = sc.nextInt();
        System.out.println(distance(x1, y1, x2, y2));

        sc.close();
    }
}