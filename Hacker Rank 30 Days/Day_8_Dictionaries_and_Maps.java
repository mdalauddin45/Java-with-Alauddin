/**
 * Day_8_Dictionaries_and_Maps
 */
import java.util.Scanner;

public class Day_8_Dictionaries_and_Maps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] phones = new int[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            phones[i] = sc.nextInt();
        }

        //check input
        // for (int i = 0; i < n; i++) {
        //     System.out.println(names[i] + "=" + phones[i]);
        // }
        
        while (sc.hasNext()) {
            String s = sc.next();
            boolean found = false;

            for (int i = 0; i < names.length; i++) {
                if (names[i].equals(s)) {
                    System.out.println(s + "=" + phones[i]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Not found");
            }
        }
    }
}
