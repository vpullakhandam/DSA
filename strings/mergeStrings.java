package strings;
import java.util.*;
public class mergeStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        String m = in.next();
        System.out.println(merge(n,m));
    }
    public static String merge(String n,String m){
        String merged="";
        int l = Math.max(n.length(),m.length());
        for(int i=0;i<l;i++){
            if(i<n.length()){
                merged=merged+n.charAt(i);
            }
            if(i<m.length()){
                merged=merged+m.charAt(i);
            }
        }
        return merged;
    }

}
