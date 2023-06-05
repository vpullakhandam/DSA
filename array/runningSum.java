package array;
import java.util.*;
public class runningSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
        // int[] ans = new int[nums.length];
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}
