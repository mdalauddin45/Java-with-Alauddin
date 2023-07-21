import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine(); 
        String title = sc.nextLine();
        int price = sc.nextInt();
        sc.nextLine(); 
        String description = sc.nextLine();
        String category = sc.nextLine();

        // Print the product details
        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
    }
}
