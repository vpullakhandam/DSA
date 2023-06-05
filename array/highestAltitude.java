package array;
import java.util.*;
public class highestAltitude {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain) {
        int max=0;
        int[] a = new int[gain.length];
        for(int i=1;i<a.length;i++){
            a[i]=gain[i-1]+a[i-1];
            max=Math.max(a[i],max);

        }
        return max;
    }
}
