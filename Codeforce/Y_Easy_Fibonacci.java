/**
 * Y_Easy_Fibonacci
 */
import java.util.Scanner;
public class Y_Easy_Fibonacci {
    public static int fibonacci(int n)
    {
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
          for (int i = 0; i < x; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}