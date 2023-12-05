/**
 * Try_catch_finaly
 */
public class Try_catch_finaly {

    public static void main(String[] args) {
        try {
            int r = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("The End");
        }
    }
}