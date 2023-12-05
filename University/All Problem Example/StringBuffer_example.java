/**
 * StringBuffer_example
 */
public class StringBuffer_example {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("There, ");
        sb.append(" how are you? ");

        sb.insert(6,"awesome " );
        sb.delete(13,19);
        sb.replace(11, 16, " doing ");
        String s = sb.toString();
        System.out.println(s);
    }
}