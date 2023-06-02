package Math;
import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        int hcf=gcd(N,M);
        System.out.println(gcd(N,M));
        int lcm=(N*M)/hcf;
        System.out.println(lcm);

    }
    public static int gcd(int N,int M){
        if(N==0){
            return M;
        }
        return gcd(M%N,N);
    }
}
