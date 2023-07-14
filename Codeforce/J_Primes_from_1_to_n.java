/**
 * J_Primes_from_1_to_n
 */
import java.util.Scanner;
public class J_Primes_from_1_to_n {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n/2; i++)  if (n % i == 0)  return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++)  if (isPrime(i))  System.out.print(i+ " ");
    }
}
