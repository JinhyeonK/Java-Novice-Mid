import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        if(isMoreTwoalp(A))
            System.out.print("Yes");
        else
            System.out.print("No");
        
    }
    public static boolean isMoreTwoalp(String str){
        int len = str.length();
        for(int i = 0; i < len; i++)
            if(str.charAt(i) != str.charAt(0))
                return true;
    
        return false;
    }
    }
