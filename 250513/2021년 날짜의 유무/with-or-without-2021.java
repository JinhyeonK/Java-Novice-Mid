import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 인덱스:       0  1   2   3   4   5   6   7   8   9  10  11  12

        if (m >= 1 && m <= 12 && d >= 1 && d <= daysInMonth[m]) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
