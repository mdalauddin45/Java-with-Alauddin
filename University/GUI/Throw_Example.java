/**
 * Throw_Example
 */
public class Throw_Example {
    public static void main(String[] args) {
        try {
            int x=-5;
            if(x<0){
                throw new IllegalArgumentException("this value is negative");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}