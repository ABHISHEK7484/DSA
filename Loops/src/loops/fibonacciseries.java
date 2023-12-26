package loops;
import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,b and n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();
        int c=a;
        for(int i=0;i<n;i++){
            System.out.print(c+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
