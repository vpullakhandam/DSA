package array;
import java.util.*;
public class sortColors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        sortColors(arr);
    }
    public static void sortColors(int[] nums) {
        int z=0;
        int o=0;
        int t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }
            if(nums[i]==1){
                o++;
            } else {
                t++;
            }
        }
        for(int i=0;i<z;i++){
            nums[i]=0;
        }
        for(int i=z;i<o+z;i++){
            nums[i]=1;
        }
        for(int i=o+z;i<nums.length;i++){
            nums[i]=2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
