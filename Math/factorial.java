package Math;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        fact(N);
        System.out.println(fact_optimized(N));
    }
    public static void fact(int n){
        int prod=1;
        for(int i=1;i<=n;i++){
            prod=prod*i;
        }
        System.out.println(prod);
    }
    public static int fact_optimized(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact_optimized(n-1);
    }
}
