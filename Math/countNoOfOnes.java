package Math;
import java.util.*;
// does not work for large numbers
public class countNoOfOnes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+count(i);
        }
        System.out.println(sum);
    }
    public static int count(int i) {
        int no=0;
        while(i>0){
            int rem=i%10;
            if(rem==1){
                no=no+1;
            }
            i=i/10;
        }
        return no;
    }
}
