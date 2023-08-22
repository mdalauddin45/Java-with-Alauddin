/**
 * Day_13_Abstract_Classes
 */
import java.util.Scanner;
abstract class Book{
    String title;
    String author;
    Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    abstract void display();
}
class MyBook extends Book{
    int price;
    
}
public class Day_13_Abstract_Classes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        Book new_novel = new MyBook(title, author, price);
        new_novel.display();
    }
}