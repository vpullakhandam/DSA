package Math;
import java.util.*;
public class powerOf2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if(N>=1 && (N&(N-1))==0){
            System.out.println("it is a power of 2");
        } else {
            System.out.println("not a power of 2");
        }
    }
}
