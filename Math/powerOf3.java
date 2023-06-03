package Math;
import java.util.*;
//https://leetcode.com/problems/power-of-three/description/
public class powerOf3 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(power(n));
    }
    public static boolean power(int n) {
        while(n>=3){
            if(n%3!=0){
                return false;
            }
            n=n/3;
        }
        return n==1;
    }
}
