package Math;

import java.util.*;
public class factor_optimized {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        fact(N);
    }
    public static void fact(int N){
        List<Integer> al = new ArrayList<>();
        for(int i=1;i*i<=N;i++){
            if(N%i==0){
                if(N/i==i) {
                    System.out.print(i+" ");
                } else {
                    System.out.print(i+" ");
                    al.add(N/i);
                }
            }
        }
        for(int i=al.size()-1;i>=0;i--){
            System.out.print(al.get(i)+" ");
        }
    }
}
