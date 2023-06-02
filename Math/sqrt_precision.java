package Math;
import java.util.*;
public class sqrt_precision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int p=in.nextInt();
        double d=sqrt(N,p);
        System.out.printf("%.3f",d);
    }
    public static double sqrt(int N,int p){
        int low=0;
        int high=N;
        double root=0.0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid==N) {
                return mid;
            } else if(mid*mid>N){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        root=high;
        double incr=0.1;
        for(int i=0;i<p;i++){
            while(root*root<=N){
                root=root+incr;
            }
            root=root-incr;
            incr=incr/10;
        }
        return root;
    }
}
