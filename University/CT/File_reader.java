import java.io.FileReader;

public class File_reader {
    public static void main(String[] args) {
        try {
        FileReader fileReader = new FileReader("poem.txt");
        int data = fileReader.read();
        while(data!=-1){
            System.out.print((char)data);
            data = fileReader.read();
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
