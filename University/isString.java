import java.util.Scanner;
public class isString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        boolean result = checkFirstTwoChars(str);
        System.out.println(result);
    }
    
    public static boolean checkFirstTwoChars(String str) {
        if (str.length() < 2) return false;
        String firstTwoChars = str.substring(0, 2);
        String lastTwoChars = str.substring(str.length() - 2);
        
        return firstTwoChars.equals(lastTwoChars);
    }
}
