package array;
import java.util.*;
// https://leetcode.com/problems/sort-the-people/description/
public class sortThePeople {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] names = new String[n];
        for(int i=0;i<n;i++){
            names[i]=in.next();
        }
        int[] heights = new int[n];
        for(int i=0;i<n;i++){
            heights[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i=0;i<names.length;i++){
            hm.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] res = new String[names.length];
        int j=0;
        for(int i=heights.length-1;i>=0;i--){
            res[j]=hm.get(heights[i]);
            j++;
        }
        return res;
    }
}
