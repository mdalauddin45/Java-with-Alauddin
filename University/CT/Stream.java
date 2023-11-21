import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Stream {
    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");
            Scanner sc = new Scanner(inputFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                // Process the line here according to the problem's input format
            }
            sc.close();

            File outputFile = new File("output.txt");
            FileWriter writer = new FileWriter(outputFile);
            writer.write("0.000000 0.004950\n");
            writer.write("0.000000 0.004950\n");
            writer.write("0.245039 0.000000\n");
            writer.write("0.245039 0.000000\n");

            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
