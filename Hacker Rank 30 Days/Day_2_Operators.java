/**
 * Day_2_Operators
 */
import java.util.Scanner;
public class Day_2_Operators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mc = sc.nextDouble();
        int tp = sc.nextInt();
        int tx = sc.nextInt();
        sc.close();
        double tip = mc * tp / 100;
        double tax = mc * tx / 100;
        double tc = mc + tip + tax;
        System.out.println(Math.round(tc));
    }
}