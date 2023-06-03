package Math;
import java.util.*;
// https://leetcode.com/problems/maximum-product-of-three-numbers/description/
public class max_prod_of_3numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int prod=0;
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int last=arr.length-1;
        prod=Math.max(arr[0]*arr[1]*arr[last],arr[last]*arr[last-1]*arr[last-2]);
        System.out.println(prod);
    }
}
