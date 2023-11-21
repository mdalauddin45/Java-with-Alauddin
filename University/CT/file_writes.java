import java.io.FileWriter;

public class file_writes {
    public static void main(String[] args) {
       try {
         FileWriter fileWriter = new FileWriter("poem.txt");
         fileWriter.write("Asad sir roks");
         fileWriter.close();
       } catch (Exception e) {
        System.out.println(e.getMessage());
       }
    }
}
