/**
 * Fibonacci_Search
 **/
import java.util.Scanner;
public class Fibonacci_Search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int key = sc.nextInt();
        boolean flag = false;
        int index=0;
        int fib2=0,fib1=1,fib=fib1+fib2;
        while(fib<n){
            fib2=fib1;
            fib1=fib;
            fib=fib1+fib2;
        }
        int offset=-1;
        while(fib>1){
            int i = Math.min(offset+fib2, n-1);
            if(arr[i] < key){
                fib=fib1;
                fib1=fib2;
                fib2=fib-fib1;
                offset=i;
            }
            else if(arr[i] > key){
                fib=fib2;
                fib1=fib1-fib2;
                fib2=fib-fib1;
            }
            else{
                flag = true;
                index = i;
                break;
            }
        }
        if(flag) System.out.println("Element found at index "+index);
        else System.out.println("Element not found");
    }
}