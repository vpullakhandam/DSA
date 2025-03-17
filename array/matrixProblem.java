package array;
import java.util.*;
public class matrixProblem {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        // row minimum
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                min=Math.min(arr[i][j],min);
            }
            for(int j=0;i<n;i++){
                arr[i][j]=arr[i][j]-min;
            }
        }
        // col minimum
        for(int j=0;j<n;j++){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                min=Math.min(min,arr[i][j]);
            }
            for(int i=0;i<n;i++){
                arr[i][j]=arr[i][j]-min;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
