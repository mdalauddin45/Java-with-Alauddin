import java.util.Scanner;

public class binary_searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int key = sc.nextInt();
        boolean flag = false;
        int low=0,high=n-1,index=0;
        while(low<=high)
        {
            int mid=(high+low)/2;
            if(arr[mid]==key) 
            {
                flag=true;
                index=mid;
                break;
            }
            else if(arr[mid]>key) 
            {
                high=mid-1;
            }else
            {
                low = mid+1;
            }
        }
        if(flag) System.out.println("Element found at index "+index);
        else System.out.println("Element not found");
    }
}
