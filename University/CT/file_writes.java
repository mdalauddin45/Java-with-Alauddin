import java.io.FileWriter;

public class file_writes {
    public static void main(String[] args) {
       try {
         FileWriter fileWriter = new FileWriter("poem.txt");
         fileWriter.write("Asad sir roks\n");
         // jode aki file a line ata likty chaw taholy append korba
         fileWriter.append("He is the Java Teacher");
         fileWriter.close();
       } catch (Exception e) {
        System.out.println(e.getMessage());
       }
    }
}
