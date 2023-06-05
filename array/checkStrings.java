package array;
import java.util.*;
public class checkStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] word1 = {"ab","c"};
        String[] word2= {"a","bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String m = "";
        String n= "";
        for(int i=0;i<word1.length;i++){
            m=m+word1[i];
        }
        for(int i=0;i<word2.length;i++){
            n=n+word2[i];
        }
        if(m.equals(n)){
            return true;
        }
        return false;
    }
}
