import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(F(n));
    }
    public static int F(int n){
        if (n<10)
            return n*n;
        return F(n/10)+(n%10)*(n%10);
    }
}