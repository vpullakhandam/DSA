package array;
import java.util.*;
public class decodeXORArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int k = in.nextInt();
        System.out.println(Arrays.toString(decode(arr,k)));
    }
    public static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        arr[0]=first;
        int j=1;
        for(int i=0;i<encoded.length;i++){
            arr[j]=arr[i]^encoded[i];
            j++;
        }
        return arr;
    }
}
