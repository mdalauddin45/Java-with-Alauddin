import java.util.Scanner;
/**
 * I_Palindrome
 */
public class I_Palindrome {
    public static void isPlindrome(int n)
    {
        int originalNum = n;
        int reversedNum = 0;

        while (n > 0) {
            int remainder = n % 10;
            reversedNum = reversedNum * 10 + remainder;
            n /= 10;
        }
        if(originalNum==reversedNum) System.out.println(originalNum+"\nYES");
        else System.out.println(reversedNum+"\nNO");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        isPlindrome(x);
    }
}