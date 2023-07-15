import java.util.Scanner;
public class variables_swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x=sc.nextLine();
        String y=sc.nextLine();
        String temp;
        temp= x;
        x=y;
        y=temp;
        System.out.println(x);
        System.out.println(y);
    }
}
