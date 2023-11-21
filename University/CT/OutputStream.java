import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("message.txt");
            fos.write("Asad sir roks".getBytes());
            fos.close();
        } catch (IOException  e) {
            System.out.println(e.getMessage());
        }
    }
}
