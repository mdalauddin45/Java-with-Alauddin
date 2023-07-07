/**
 * Java_Output_Formatting
 */
import java.util.Scanner;
public class Java_Output_Formatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        String s1 = sc.next();
        int x = sc.nextInt();
        String s2 = sc.next();
        int y = sc.nextInt();
        String s3 = sc.next();
        int z = sc.nextInt();
        sc.close();
        System.out.printf("%-15s%03d\n", s1, x);
        System.out.printf("%-15s%03d\n", s2, y);
        System.out.printf("%-15s%03d\n", s3, z);
        System.out.println("================================");
    }
}