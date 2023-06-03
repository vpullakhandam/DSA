package Math;
import java.util.*;
public class fizzbuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fizzBuzz(n));
    }
    public static List<String> fizzBuzz(int n) {
        List<String> al = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                al.add("FizzBuzz");
            }
            else if(i%3==0){
                al.add("Fizz");
            }
            else if(i%5==0){
                al.add("Buzz");
            } else {
                al.add(i+"");
            }
        }
        return al;
    }
}
