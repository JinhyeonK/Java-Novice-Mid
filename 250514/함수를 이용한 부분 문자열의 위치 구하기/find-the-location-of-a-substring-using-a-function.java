import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.
    int r=wh(text,pattern);
    System.out.print(r);

    }
    public static int wh( String a,String b){
        int idx = a.indexOf(b);
        return idx;
    }

}