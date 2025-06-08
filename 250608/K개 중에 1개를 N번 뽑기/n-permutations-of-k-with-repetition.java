import java.util.*;
public class Main {
    public static ArrayList<Integer> su =new ArrayList<>();
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int k,n;
        k=sc.nextInt();
        n=sc.nextInt();
        choose(0,n,k);
    }
    public static void choose(int depth,int nn,int kk){
        if (depth==nn){
            printsu();
            return;
        }
        for(int i=1;i<=kk;i++){
            su.add(i);
            choose(depth+1,nn,kk);
            su.remove(su.size()-1);
        }
        
}
    public static void printsu(){
        for(int i=0;i<su.size();i++){
            System.out.print(su.get(i)+" ");
        }
        System.out.println();
}
}