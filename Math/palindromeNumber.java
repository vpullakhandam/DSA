package Math;
import java.util.*;
public class palindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int x) {
        // if(x==0){
        //     return true;
        // }
        int y=x;
        int s=0;
        if(x>=0){
            while(x!=0){
                s=s*10+(x%10);
                x=x/10;
            }
        } else {
            return false;
        }

        if(s==y){
            return true;
        } else {
            return false;
        }
    }
}
