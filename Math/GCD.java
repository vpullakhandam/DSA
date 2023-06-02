package Math;

import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        System.out.println(gcd(N,M));
    }
    public static int gcd(int N,int M){
        if(N==0){
            return M;
        }
        return gcd(M%N,N);
    }
}
