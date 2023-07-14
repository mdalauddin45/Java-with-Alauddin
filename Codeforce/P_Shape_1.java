/**
 * P_Shape_1
 */
import java.util.Scanner;
public class P_Shape_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        for(int i=x;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}