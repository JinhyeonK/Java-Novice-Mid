import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)  {
        // Please write your code here.
    Scanner sc= new Scanner(System.in);
    int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    int n=a*b*c;
    System.out.print(F(n));
    }
    public static int F(int n){
        if (n==0)
            return 0;
        return F(n/10)+(n%10);
    }
}