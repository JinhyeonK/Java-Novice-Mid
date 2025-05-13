import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int cnt=0;
        for(int i=a;i<=b;i++){
            if (i%2==0){
                continue;
            } else if (i%10==5){
                continue;
            } else if (i%3==0 && i%9!=0){
                continue;
            } else{
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}