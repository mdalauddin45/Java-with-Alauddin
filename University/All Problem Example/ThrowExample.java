/**
 * ThrowExample
 */
public class ThrowExample {
    public static void main(String[] args) {
        try {
            int n = -5;
            if(n<0){
                throw new IllegalArgumentException("N is nagetive");
            }
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}