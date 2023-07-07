import java.util.Scanner;
/**
 * Java_Static_Initializer_Block
 */
public class Java_Static_Initializer_Block {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        if(B>0 && H>0)
        {
            System.out.println(B*H);
        }
        else
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}