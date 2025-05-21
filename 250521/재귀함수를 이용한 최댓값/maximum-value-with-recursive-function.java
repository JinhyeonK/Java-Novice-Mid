import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(input[i]);
        }
        System.out.print(F(arr, n - 1));
        

    }
    public static int F(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        }
        return Math.max(arr[n], F(arr, n - 1));
    }
    
}