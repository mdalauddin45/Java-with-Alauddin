import java.util.Arrays;
import java.util.Scanner;

public class integer_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        //accending sort
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        
        //decending sort
        for(int i=n-1;i>=0;i--) System.out.print(arr[i]+" ");

    }
}
