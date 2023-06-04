package Math;
import java.util.*;
public class commonFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(commonFactors(n,m));
    }
    public static int commonFactors(int a, int b) {
        int t=0;
        int min=Math.min(a,b);
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                t=t+1;
            }
        }
        return t;
    }
}
