import java.util.Scanner;

public class Main {    
    public static final int MAX_N = 100;
    
    public static int n1, n2;
    public static int[] a = new int[MAX_N];
    public static int[] b = new int[MAX_N];
    
    // n번째 인덱스부터 시작하는 n2길이의 a수열과
    // b수열이 완전히 일치하는지 확인합니다..
    public static boolean isSame(int n) {
        for(int i = 0; i < n2; i++)
            if(a[i + n] != b[i])
                return false;
    
        return true;
    }
    
    // b가 a의 연속부분수열인지 확인합니다.
    public static boolean isSubsequence() {
        for(int i = 0; i <= n1 - n2; i++)
            if(isSame(i))
                return true;
        
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력:
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for(int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        
        for(int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        
        if(isSubsequence())
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
