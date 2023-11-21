/**
 * file_obj
 */
import java.io.File;
public class file_obj {
    public static void main(String[] args) {
        File file = new File("message.txt");
        if(file.exists()) {
            System.out.println("This file exists");
            //if you need 
            System.out.println(file.getPath()); // return file name 
            System.out.println(file.isFile()); // return true or false
            System.out.println(file.getAbsolutePath()); // return file location 
            file.delete(); // ata use kory file delete kora hoi
        }else{
            System.out.println("This file does not exist");
        }
    }
}