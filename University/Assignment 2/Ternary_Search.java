/**
 * Ternary_Search
 */
import java.util.Scanner;
public class Ternary_Search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int key = sc.nextInt();
        boolean flag = false;
        int low=0,high=n-1;
        int index=0;
        while(low<=high)
        {
            int mid1 = low + (high-low)/3;
            int mid2 = high - (high-low)/3;
            if(arr[mid1] == key){
                flag = true;
                index = mid1;
                break;
            }
            else if(arr[mid2] == key){
                flag = true;
                index = mid2;
                break;
            }
            else if(arr[mid1] > key) high = mid1-1;
            else if(arr[mid2] < key) low = mid2+1;
            else{
                low = mid1+1;
                high = mid2-1;
            }
        }
        if(flag) System.out.println("Element found at index "+index);
        else System.out.println("Element not found");
    }
}