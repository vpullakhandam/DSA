package Math;

import java.util.*;
public class NRM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double m=sqrt(N);
        System.out.println(m);
    }
    public static double sqrt(int N){
//        double x=N;
//        double root;
//        while(true){
//            root= 0.5*(x+(N/x));
//            if(Math.abs(root-x)<0.5){
//                break;
//            } else {
//                x=root;
//            }
//        }
//        return root;
        long ans=N;
        while(ans*ans>N){
            ans= (int)(0.5*(ans+(N/ans)));
        }
        return ans;
    }
}
