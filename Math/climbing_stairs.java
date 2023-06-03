package Math;
import java.util.*;
// very similar to fibonacci series https://leetcode.com/problems/climbing-stairs/description/
public class climbing_stairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(climb(N));
    }
    public static int climb(int n) {
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int one=1;
        int two=2;
        int three=0;
        for(int i=3;i<=n;i++){
            three=one+two;
            one=two;
            two=three;
        }
        return three;
    }
}
