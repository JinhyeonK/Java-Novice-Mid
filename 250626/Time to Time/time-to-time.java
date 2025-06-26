import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a, b, c, d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        int hour = a, mins = b;
        int elapsedTime = 0;

        while(true) {
            if(hour == c && mins == d)
                break;
            
            elapsedTime++;
            mins++;

            if(mins == 60) {
                hour++;
                mins = 0;

            }
        }
        
        System.out.print(elapsedTime);
    }
}
