import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if (m<=7&&m%2==1){
            if(d<=31){
                System.out.print("Yes");
            } else{
                System.out.print("No");
            }
        } else if(m<=7&&m%2==0){
            if (m!=2&&d<=30){
                System.out.print("Yes");
            } else{
                System.out.print("No");
            }
        } else if(m>7&&m%2==1){
            if (d<=30){
                System.out.print("Yes");
            } else{
                System.out.print("No");
            }
        }else if(m>7&&m%2==0)
            {if (d<=31)
            {System.out.print("Yes");
            } else{
                System.out.print("No");
            }

        }
    }
}