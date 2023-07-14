/**
 * Y_Easy_Fibonacci
 */
import java.util.Scanner;
public class Y_Easy_Fibonacci {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 0; i < x; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}