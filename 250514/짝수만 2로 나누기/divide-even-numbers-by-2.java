import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        are(arr);
        for(int i=0; i<arr.length;i++){
            
            System.out.print(arr[i] + " ");
        }
    }
    public static void are(int [] aa){
        for(int i=0;i<aa.length;i++){
            if(aa[i]%2==0){
                aa[i]/=2;
            }else {
                continue;
            }
        }

    }
}