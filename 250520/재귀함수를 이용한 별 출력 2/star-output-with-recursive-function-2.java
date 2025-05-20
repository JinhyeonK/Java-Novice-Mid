import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStar(n);
        printStar1(n);
    }
    public static void printStar(int a){
        if (a==0){
           return;
            }
        
        for(int i=0;i<a;i++){
            System.out.print("*"+" ");
        }
        System.out.println();
        printStar(a-1);
    }
    public static void printStar1(int b){
        if (b==0)
            return;
        printStar1(b-1);
        for(int i=0;i<b;i++){
            System.out.print("*"+" ");
        }
        System.out.println();

    }
}
