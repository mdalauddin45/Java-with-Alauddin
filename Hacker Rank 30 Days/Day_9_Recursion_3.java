/**
 * Day_9_Recursion_3
 */
import java.util.Scanner;
public class Day_9_Recursion_3 {
    static int factorial(int n)
    {
      return (n == 1) ? 1 : n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}