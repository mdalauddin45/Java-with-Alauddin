/**
 * file_obj
 */
import java.io.File;
public class file_obj {
    public static void main(String[] args) {
        File file = new File("message.txt");
        if(file.exists()) {
            System.out.println("This file exists");
        }else{
            System.out.println("This file does not exist");
        }
    }
}