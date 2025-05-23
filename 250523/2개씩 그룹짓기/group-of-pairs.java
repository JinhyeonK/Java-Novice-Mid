import java.util.*;
public class Main {
    public static final int MAX_N=1000;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] num = new int[2*MAX_N];
        for(int i = 0;i<2*n;i++)
            num[i]=sc.nextInt();
        Arrays.sort(num,0,2*n);
        int groupMax=0;
        for(int i=0;i<n;i++){
            int groupSum = num[i] + num[2*n - 1 - i];
            if(groupSum > groupMax)
                // 최댓값 갱신
                groupMax = groupSum;
        }

        System.out.print(groupMax);
    } 
}