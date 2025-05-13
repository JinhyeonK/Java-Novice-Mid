import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if (bo(m,n)){
            System.out.print(se(m));
        } else{
            if (nn(y)){
                System.out.print(se(m));
            } else{
                System.out.print("-1");
            }
        }
    }
   public static boolean nn(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    public static String se(int m){
        if (m>=3 && m<=5){
            return "Spring";
        } else if(m>=6 && m<=8){
            return "Summer";
        } else if(m>=9 && m<=11){
            return "Fall";
        } else{
            return "Winter";
        }
        
    }
    public static boolean bo(int m, int d){
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (m >= 1 && m <= 12 && d >= 1 && d <= daysInMonth[m]){
            return true;
        } else{ return false;}
    }
}
}