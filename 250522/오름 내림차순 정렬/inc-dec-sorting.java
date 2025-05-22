import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int []arr=new int [n];
        Arrays.sort(arr);
        for(int i=0;i<n+1;i++){
            System.out.print(arr[i]+" ");
        }
        Array.sort(arr, Collection.reverseOrder());
        for(int i=0;i<n+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}