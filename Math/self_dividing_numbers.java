package Math;
import java.util.*;
// https://leetcode.com/problems/self-dividing-numbers/description/
public class self_dividing_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int left=in.nextInt();
        int right=in.nextInt();
        System.out.println(div(left,right));
    }
    public static List<Integer> div(int left, int right) {
        List<Integer> al = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(divide(i)==true){
                al.add(i);
            }
        }
        return al;
    }
    public static boolean divide(int i){
        int sum=0;
        int m=i;
        while(i>0){
            int rem=i%10;
            if(rem!=0){
                sum=sum+(m%rem);
            } else {
                return false;
            }
            i=i/10;
        }
        if(sum==0){
            return true;
        }
        return false;
    }

}
