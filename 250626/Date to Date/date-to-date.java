import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);
        int m1,d1,m2,d2;
        m1=sc.nextInt();
        d1=sc.nextInt();
        m2=sc.nextInt();
        d2=sc.nextInt();
        int [] days=new int []{0,31,28,31,30,31,30,31,31,30,31,30,31};
        int cnt=0;
        while(true){
            if(m1==m2&&d1==d2){
                cnt++;
                break;
            }
            cnt++;
            d1++;
            if(d1>days[m1]){
                m1++;
                d1=1;
            }


        }
        System.out.print(cnt);    
    }
}