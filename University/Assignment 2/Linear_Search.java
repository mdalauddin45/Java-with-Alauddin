/**
 * Linear_Search
 */
import java.util.Scanner;
public class Linear_Search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int key = sc.nextInt();
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                flag = true;
                index = i;
                break;
            }
        }
        if(flag) System.out.println("Element found at index "+index);
        else System.out.println("Element not found");
    }
}