import java.util.Scanner;

/**
 * Multi_dimentional_array
 */
public class Multi_dimentional_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of row: ");
        int row = sc.nextInt();
        System.out.println("Enter size of col: ");
        int col = sc.nextInt();
        System.out.println("Enter the value : ");
        int[][] arr = new int[row][col];
        for(int i = 0; i < row;i++) {
            for(int j = 0; j < col;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements in the matrix: ");
        for(int i = 0; i < row;i++) {
            for(int j = 0; j < col;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}