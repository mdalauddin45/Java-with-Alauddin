/**
 * Day_1_Data_Types
 */
import java.util.Scanner;
public class Day_1_Data_Types {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine();
        String c = sc.nextLine();
        sc.close();
        System.out.println(i+a);
        System.out.println(d+b);
        System.out.println(s+c);
           
    }
}