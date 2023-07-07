import java.util.Scanner;
/**
 * Java_Datatypes
 */
public class Java_Datatypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long n;
        for(int i=0;i<t;i++)
        {
            try
            {
                n = sc.nextLong();
                System.out.println(n+" can be fitted in:");
                if(n>=-128 && n<=127)
                    System.out.println("* byte");
                if(n>=-32768 && n<=32767)
                    System.out.println("* short");
                if(n>=-2147483648 && n<=2147483647)
                    System.out.println("* int");
                if(n>=-9223372036854775808L && n<=9223372036854775807L)
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}