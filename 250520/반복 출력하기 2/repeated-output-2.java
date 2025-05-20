import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printa(n);

    }
    public static void printa(int n){
        if (n==0){
            return;
        }
        printa(n-1);
        System.out.println("HelloWorld");
    }
}