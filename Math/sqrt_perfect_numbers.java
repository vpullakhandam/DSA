package Math;

import java.util.*;
public class sqrt_perfect_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int low=0;
        int high=N;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid==N){
                System.out.println(mid);
                break;
            } else if(mid*mid>N){
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
    }
}
