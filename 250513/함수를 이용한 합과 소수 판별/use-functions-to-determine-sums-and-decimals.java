import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int cnt=0;
        for(int i=a;i<=b;i++){
            if (ee(i)&&jj(i)){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
    public static boolean ee(int n){
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
    public static boolean jj(int nn){
        int sum = 0;
        while (nn > 0) {
        sum += nn % 10;
        nn /= 10;
    }
    return sum % 2 == 0;
    }

}