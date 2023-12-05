import java.util.StringTokenizer;

/**
 * StringTokenizer
 */
public class StringTokenizer_example {

    public static void main(String[] args) {
        String text = "Asad Sir Opekkai acy";
        StringTokenizer tokenizer = new StringTokenizer(text);
        while(tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}