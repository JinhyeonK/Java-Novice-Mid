import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[101];
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a1,a2;
        int i=1;
        while (i<=m){
        a1=sc.nextInt();
        a2=sc.nextInt();
        int cnt=0;
        for(int j=a1;j<=a2;j++){
            cnt+=arr[j-1];
        }
        System.out.println(cnt);
        i++;
        }
    }
}