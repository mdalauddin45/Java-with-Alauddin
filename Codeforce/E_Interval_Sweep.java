/**
 * E_Interval_Sweep
 */
import java.util.Scanner;
public class E_Interval_Sweep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x < y || y==x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}