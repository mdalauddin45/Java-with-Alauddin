import java.util.Arrays;
import java.util.Scanner;

public class string_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextLine();
        Arrays.sort(arr);
        //accending
        for(int i=0;i<n;i++) System.out.println(arr[i]);
        //decending
        for(int i=n-1;i>=0;i--) System.out.println(arr[i]);

    }
}
