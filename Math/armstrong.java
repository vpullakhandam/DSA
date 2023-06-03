package Math;
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M=N;
        int sum=0;
        while(N>0){
            int rem=N%10;
            sum=sum+(rem*rem*rem);
            N=N/10;
        }
        if(sum==M){
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}
