import java.util.Scanner;
/**
 * Java_End_of_file
 */
public class Java_End_of_file {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        while(s.hasNext())
        {
            System.out.println(i+" "+s.nextLine());
            i++;
        }
        
    }
}