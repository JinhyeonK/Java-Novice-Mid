import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        // Please write your code here.
        double r = Math.pow(a,b);
        
        System.out.printf("%.0f\n", r);
        }
    }