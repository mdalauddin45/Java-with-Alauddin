import java.util.Scanner;

public class Java_Currency_Formatter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        sc.close();
        String us = String.format("$%,.2f", p);
        String india = String.format("Rs.%,.2f", p);
        String china = String.format("￥%,.2f", p);
        String france = String.format("%,.2f €", p);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
