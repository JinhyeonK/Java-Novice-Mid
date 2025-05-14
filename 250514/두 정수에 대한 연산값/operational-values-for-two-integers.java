import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int [] result=ab(a,b);
        System.out.print(result[0] + " " + result[1]);
    }
    public static int [] ab(int n,int m){
        if (n<m){
            n*=2;
            m+=25;

        } else{
            m*=2;
            n+=25;
        }
        return new int[]{n, m};
    }
}