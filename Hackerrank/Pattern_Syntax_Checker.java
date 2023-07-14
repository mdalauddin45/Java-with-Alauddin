/**
 * Pattern_Syntax_Checker
 */
import java.util.Scanner;
public class Pattern_Syntax_Checker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
            try{
                java.util.regex.Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(Exception e){
                System.out.println("Invalid");
            }
            testCases--;
		}
    }
    
}