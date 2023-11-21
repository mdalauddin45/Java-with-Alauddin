import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("poem.txt");
            int data = fs.read();
            while(data!=-1){
                System.out.print((char)data);
                data = fs.read();
            }
        } catch (IOException  e) {
            System.out.println(e.getMessage());
        }
    }
}
