package Math;
import java.util.*;
// https://leetcode.com/problems/power-of-four/
public class power_of_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        System.out.println(power(N));
        System.out.println(power_optimized(N));
    }
    public static boolean power(int n) {
        for(int i=0;i<=n;i++){
            if(n==Math.pow(4,i)){
                return true;
            }
        }
        return false;
    }
    public static boolean power_optimized(int n){
            while(n >= 4){
                if(n % 4 != 0) return false;
                n = n / 4;
            }
            return n == 1;
    }
}
