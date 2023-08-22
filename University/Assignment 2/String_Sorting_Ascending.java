import java.util.Arrays;
import java.util.Scanner;

/**
 * String_Sorting_Ascending
 */
public class String_Sorting_Ascending {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextLine();
        Arrays.sort(arr);
        for(int i=0;i<n;i++) System.out.println(arr[i]+" ");
    }
}