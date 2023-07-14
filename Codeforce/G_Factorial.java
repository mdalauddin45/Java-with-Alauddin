/**
 * G_Factorial
 */
import java.util.Scanner;
public class G_Factorial {
    public static long calculateFactorial(int n) {
       if(n==0) return 1;
       return n*calculateFactorial(n-1);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      for(int i=0;i<x;i++)
         {
        int a = sc.nextInt();
        System.out.println(calculateFactorial(a));
         }
    }
}