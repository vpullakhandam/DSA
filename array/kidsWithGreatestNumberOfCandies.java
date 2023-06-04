package array;
import java.util.*;
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
public class kidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int k= in.nextInt();
        System.out.println(kidsWithCandies(arr,k));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> al = new ArrayList<Boolean>();
        boolean flag=false;
        int[] c = new int[candies.length];
        for(int i=0;i<c.length;i++){
            c[i]=candies[i]+extraCandies;
        }
        for(int i=0;i<c.length;i++){
            flag=false;
            for(int j=0;j<c.length;j++){
                if(c[i]>=candies[j]){
                    flag=true;
                }
                else {
                    flag=false;
                    break;
                }
            }
            al.add(flag);
        }
        return al;
    }
}
