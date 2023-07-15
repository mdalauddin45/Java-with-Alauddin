import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Result {
    public static String encryptMessage(String message) {
        String[] words = message.split(" ");
        StringBuilder encryptedMessage = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            encryptedMessage.append(reversedWord).append(" ");
        }

        return encryptedMessage.toString().trim();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter =
            new BufferedWriter(new OutputStreamWriter(System.out));

        String message = bufferedReader.readLine();

        String result = Result.encryptMessage(message);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
