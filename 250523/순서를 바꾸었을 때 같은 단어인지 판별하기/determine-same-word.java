import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] a = new String[2];
        for(int i= 0; i<2;i++){
            char[] chars = br.readLine().toCharArray();
            Arrays.sort(chars);
            a[i] = new String(chars); 
        }
        if (a[0].equals(a[1])){
            System.out.print("Yes");
        }  else{
            System.out.print("No");
        }

    }
}