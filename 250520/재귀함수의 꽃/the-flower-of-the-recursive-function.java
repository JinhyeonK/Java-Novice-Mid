import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStar(n);
    }
    public static void printStar(int a){
        if (a==0){
            return;
        }
        System.out.print(a + " ");
        printStar(a - 1);
        System.out.print(a + " ");
    }

    
    
}