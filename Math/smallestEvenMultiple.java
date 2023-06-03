package Math;
import java.util.*;
//https://leetcode.com/problems/smallest-even-multiple/description/
public class smallestEvenMultiple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(smallestEvenMultiple(n));
    }
    public static int smallestEvenMultiple(int n) {
        return (n*2)/gcd(n,2);
    }
    public static int gcd(int n,int m){
        if(n==0){
            return m;
        }
        return gcd(m%n,n);
    }
}
