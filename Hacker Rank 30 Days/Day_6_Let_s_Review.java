/**
 * Day_6_Let_s_Review
 */
import java.util.Scanner;
public class Day_6_Let_s_Review {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++)s[i]=sc.next();
        for(int i=0;i<n;i++){
            for(int j=0;j<s[i].length();j+=2)System.out.print(s[i].charAt(j));
            System.out.print(" ");
            for(int j=1;j<s[i].length();j+=2)System.out.print(s[i].charAt(j));
            System.out.println();
        }
    }
}