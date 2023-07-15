import java.util.Scanner;
public class String_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        String[][] A= new String[row][col];
        String[][] B= new String[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               A[i][j] = sc.nextLine();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               B[i][j] = sc.nextLine();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
              System.out.println(B[i][j]);
            }
        }
    }
}
