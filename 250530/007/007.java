import java.util.Scanner;
class a{
    String s;
    char m;
    int t;
    public a(String sc, char mp, int ti){
        this.s=sc;
        this.m=mp;
        this.t=ti;
    }
};
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode;
        char mPoint;
        int time;
        // Please write your code here.
        sCode=sc.next();
        mPoint=sc.next().charAt(0);;
        time=sc.nextInt();
        a a1=new a(sCode,mPoint,time);
        System.out.println("secret code : "+a1.s);
        System.out.println("meeting point : "+a1.m);
        System.out.println("time : "+a1.t);
    }
}