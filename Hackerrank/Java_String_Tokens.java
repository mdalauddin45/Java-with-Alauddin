/**
 * Java_String_Tokens
 */
import java.util.Scanner;
public class Java_String_Tokens {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        // Write your code here.
        if(s.trim().length()==0){
            System.out.println(0);
            return;
        }
        String[] tokens = s.trim().split("[ !,?._'@]+");
        System.out.println(tokens.length);
        for(String token:tokens){
            System.out.println(token);
        }

    }
    
}