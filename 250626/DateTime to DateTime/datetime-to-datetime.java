import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int cnt=0;
        int d,e,f;
        d=11;
        e=11;
        f=11;
        if (a < d || (a == d && b < e) || (a == d && b == e && c < f)) {
            cnt = -1;
        } else {
        while(true){
            if( d==a&&e==b&f==c){
                break;
            }
            cnt++;
            f++;
            if(f==60){
                e++;
                f=0;

            }
            if(e==24){
                d++;
                e=0;

            }

    System.out.print(cnt);
    }
}
}