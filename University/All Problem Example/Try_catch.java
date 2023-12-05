/**
 * Try_catch
 */
public class Try_catch {
    public static void main(String[] args) {
        try {
            int r = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}