import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(x+"x"+i+"="+x*i);
        }
    }
}
