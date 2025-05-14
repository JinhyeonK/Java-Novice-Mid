import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        // Please write your code here.
        int[] result = ab(a, b);  // ab 함수가 결과를 배열로 반환
        System.out.print(result[0] + " " + result[1]);

    }
    public static int[] ab(int n, int m){
        if (n<m){
            n+=10;
            m*=2;
        
        }else{
            m+=10;
            n*=2;
            
        }
        if (n > 100 || m > 100) {
            return new int[]{n, m};
        }

        return ab(n, m);
    }
    }
