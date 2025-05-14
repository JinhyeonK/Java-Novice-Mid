import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        
        boolean r = pa(input);
        if (r==true){
            System.out.print("Yes");
        } else{
            System.out.print("No");
        }
    }
    public static boolean pa(String pa1){
        char[] arr = pa1.toCharArray();
        boolean ip = true;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!= arr[arr.length - 1 - i]){
                return false;
            } 
            
        }
        return true;
    }
}