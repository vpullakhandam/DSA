package Math;
import java.util.*;
//https://leetcode.com/problems/count-of-matches-in-tournament/description/?envType=list&envId=ro5r0772
public class countOfMatches {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(numberOfMatches(n));
    }
    public static int numberOfMatches(int n) {
        if(n<2) return 0;
        if(n==2) return 1;
        if((n&1)==1) return ((n-1)/2)+numberOfMatches((n-1)/2+1);
        return n/2+numberOfMatches(n/2);
    }
}
