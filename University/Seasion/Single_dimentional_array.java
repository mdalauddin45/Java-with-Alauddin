import java.util.Scanner;

/**
 * Single_dimentional_array
 */
public class Single_dimentional_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter index size: ");
        int x = sc.nextInt();
        System.out.println("Enter the value : ");
        int[] arr = new int[x];
        for(int i = 0; i < x;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements in the array: ");
        for(int i = 0; i < x;i++){
            System.out.println(arr[i]);
        }
    }
}