/**
 * H_One_Prime
 */
import java.util.Scanner;
public class H_One_Prime {
    public static boolean isPrime(int n)
    {
        if(n<=0) return false;
        for(int i=2;i<=n/2;i++) if(n%i==0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(isPrime(x)) System.out.println("YES");
        else System.out.println("NO");
    }
}