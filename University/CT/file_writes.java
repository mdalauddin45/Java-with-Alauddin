import java.io.FileWriter;

public class file_writes {
    public static void main(String[] args) {
       try {
         FileWriter fileWriter = new FileWriter("poem.txt");
         fileWriter.write("Asad sir roks\n");
         fileWriter.append("He is the Java Teacher"); // jode aki file a line ata likty chaw taholy append korba for example toi jode cho soudi arab jai taka r nari 2 ta taily append shika lagbbo
         fileWriter.close();
       } catch (Exception e) {
        System.out.println(e.getMessage());
       }
    }
}
