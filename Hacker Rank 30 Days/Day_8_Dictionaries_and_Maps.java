/**
 * Day_8_Dictionaries_and_Maps
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Day_8_Dictionaries_and_Maps {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().split(" ");
            String name = parts[0];
            int phone = Integer.parseInt(parts[1]);
            phoneBook.put(name, phone);
        }

        while (true) {
            String s = br.readLine();
            if (s == null) break;

            Integer phoneNumber = phoneBook.get(s);

            if (phoneNumber != null) {
                System.out.println(s + "=" + phoneNumber);
            } else {
                System.out.println("Not found");
            }
        }
    }
}

