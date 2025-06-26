import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // year
        int b = sc.nextInt(); // month
        int c = sc.nextInt(); // day

        int d = 11, e = 11, f = 11; // reference: 11/11/11 11:11
        int cnt = 0;

        if (a < d || (a == d && b < e) || (a == d && b == e && c < f)) {
            cnt = -1;
        } else {
            while (true) {
                if (d == a && e == b && f == c) break;
                cnt++;
                f++;
                if (f == 60) {
                    f = 0;
                    e++;
                }
                if (e == 24) {
                    e = 0;
                    d++;
                }
            }
        }

        System.out.print(cnt);
    }
}