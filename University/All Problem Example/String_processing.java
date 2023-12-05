/**
 * String_processing
 */
public class String_processing {

    public static void main(String[] args) {
        String s = "This is a String Processing";
        int len = s.length();
        String upper =s.toUpperCase();
        String sub = s.substring(0, 4);
        System.out.println("len: " + len+" upper: " + upper+" sub string: "+sub);
        String[] words = s.split(" ");
        for(String w:words){
            System.out.println(w);
        }
        String replaceing = s.replace("is", "kiss");
        System.out.println(replaceing);
        String t1 = "Trim this String";
        String term = t1.trim();
        System.out.println(term);
    }
}