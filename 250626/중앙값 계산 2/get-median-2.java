import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            result[i] = Integer.parseInt(st.nextToken());
        }

        int[] backup = Arrays.copyOf(result, result.length);
        for(int i = 1; i <= n; i += 2){
            Arrays.sort(result, 0, i);
            System.out.print(result[i / 2] + " ");
            result = Arrays.copyOf(backup, backup.length);
        }
    }
}