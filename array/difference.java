package array;
import java.util.*;
// https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/
public class difference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(differenceOfSum(arr));
    }
    public static int differenceOfSum(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum1=sum1+nums[i];
            sum2=sum2+count(nums[i]);
        }
        return Math.abs(sum1-sum2);
    }
    public static int count(int i){
        int t=0;
        while(i>0){
            int rem=i%10;
            t=t+rem;
            i=i/10;
        }
        return t;
    }
}
