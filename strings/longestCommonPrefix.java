package strings;
import java.util.*;
public class longestCommonPrefix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=in.next();
        }
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String m = strs[0];
        String n = strs[strs.length-1];
        int i=0;
        while(i<m.length() && i<n.length()){
            if(m.charAt(i)==n.charAt(i)){
                i++;
            } else {
                break;
            }
        }
        return n.substring(0,i);
    }
}
