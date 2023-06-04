package Math;

import java.util.Scanner;

public class signOfProductOfAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(arraySign(arr));
    }
    public static int arraySign(int[] nums) {
        int prod=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                prod=prod*1;
            } else if(nums[i]<0){
                prod=prod*-1;
            } else {
                prod=prod*0;
            }
        }
        return signFunc(prod);
    }
    public static int signFunc(int prod){
        if(prod>0){
            return 1;
        }
        else if(prod<0){
            return -1;
        }
        return 0;
    }
}
