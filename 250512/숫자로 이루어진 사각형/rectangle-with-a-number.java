import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int [][] a=new int [n][n];
        int cnt=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=cnt;
                System.out.print(cnt+" ");
                cnt++;
                if (cnt>9){
                    cnt=1;
                }
            }
        System.out.println(); 
        }
    }
}