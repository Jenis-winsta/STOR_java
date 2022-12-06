package eSTOR;
import java.util.Arrays;
import java.util.Scanner;
public class practs1 {
    public static void main(String[] args) {
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of dependent values:(y values): ");
        n=sc.nextInt();
        System.out.println(n);
        int [] x =new int[n+1];
        for(int i=0;i<n+1;i++){
            System.out.println("Enter x"+i);
            x[i]=sc.nextInt();
        }
        System.out.println(x[1]);
        System.out.println(Arrays.toString(x));
        int[] y=new int[n+1];
        for(int i=0;i<n;i++){
            System.out.println("Enter y"+i);
            y[i]=sc.nextInt();
        }
        int xx=x[n];
        int a=1,b=1;
        int sum=0;
        System.out.println(Arrays.toString(y));
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                a *= xx-x[j];
                b*= x[i]-x[j];
            }
            a *=y[i];
            sum+=(a/b);
            System.out.println("ans: "+a/b);
            a=1;b=1;
        }
        System.out.println("Y: "+sum);
    }
}
