import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ff1(n);
    System.out.println();
    ff2(n);
    }
    public static void ff1(int n){
        if (n==0){
            return;
 
       }
       for(int i=1;i<=n;i++){
        System.out.print(i+" ");
       }
    }
    public static void ff2(int n){
        if (n==0){
            return;
 
       }
       for (int i = n; i >= 1; i--){
         System.out.print(i+" ");
       }
    }
}