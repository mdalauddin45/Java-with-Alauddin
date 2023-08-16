/**
 * Day_10_Binary_Numbers
 */
import java.util.Scanner;
public class Day_10_Binary_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        int max = 0;
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            count = (binary.charAt(i) == '1') ? count + 1 : 0;
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}