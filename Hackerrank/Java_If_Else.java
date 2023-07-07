/**
 * Java_If_Else
 */
import java.util.*;
public class Java_If_Else {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if(n%2==1) System.out.println("Weird");
        else if(n>=2 && n<=5) System.out.println("Not Weird");
        else if(n>=6 && n<=20) System.out.println("Weird");
        else if(n>20) System.out.println("Not Weird");
    }
}