import java.io.*;
import java.util.*;

public class Main {
    // 최대공약수(GCD)를 재귀함수로 구함
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // 최소공배수(LCM)는 a * b / gcd(a, b)
    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int result = Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            result = lcm(result, num); // 누적해서 LCM 계산
        }

        System.out.println(result);
    }
}