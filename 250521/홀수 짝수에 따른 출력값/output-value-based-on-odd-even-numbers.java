import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        System.out.print(F(n));
    }
    public static int F(int n){
    if (n <= 0) {
        return 0;
    }
    return F(n - 2) + n;
}
}