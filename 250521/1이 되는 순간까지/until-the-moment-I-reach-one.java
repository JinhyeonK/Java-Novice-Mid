import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        System.out.print(f(n));
    }
    public static int f(int n){
        if (n==1){
            return 0;
        } else if(n%2==0){
            return 1 + f(n / 2);
        } else{
            return 1+f(n/3);
        }
    }
}