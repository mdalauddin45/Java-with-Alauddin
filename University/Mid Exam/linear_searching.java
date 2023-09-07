import java.util.Scanner;

public class linear_searching{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int key = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                flag=true;
                break;
            }
        }
        if(flag) System.out.println("found");
        else System.out.println("not found");
    }
}