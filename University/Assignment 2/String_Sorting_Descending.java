/**
 * String_Sorting_Descending
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class String_Sorting_Descending {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextLine();
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<n;i++) System.out.println(arr[i]+" ");
    }
}