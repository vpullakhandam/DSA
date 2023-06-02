package Math;

import java.util.*;
public class factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N =in.nextInt();
        for(int i=1;i<=N;i++) {
            if (N % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
