import java.io.*;
/**
 * Throws_example
 */
public class Throws_example {
    public static void findfile() throws IOException {
        File file = new File("test.txt");
        FileInputStream stream = new FileInputStream(file);
    }
    public static void main(String[] args) {
        try {
            findfile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}