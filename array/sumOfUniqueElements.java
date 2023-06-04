package array;
import java.util.*;
// https://leetcode.com/problems/sum-of-unique-elements/description/
public class sumOfUniqueElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(sumOfUnique(arr));
    }
    public static int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int a:nums){
            if(hm.containsKey(a)){
                int val=hm.get(a)+1;
                hm.put(a,val);
            } else {
                hm.put(a,1);
            }
        }
        for(int a:nums){
            if(hm.get(a)==1){
                sum=sum+a;
            }
        }
        return sum;
    }
}
