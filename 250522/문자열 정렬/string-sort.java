import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char [] chars=a.toCharArray();
        Arrays.sort(chars);
        String ss=new String(chars);
        System.out.print(ss);
        }
}