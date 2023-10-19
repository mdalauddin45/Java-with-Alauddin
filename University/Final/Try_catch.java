public class Try_catch {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0;
            System.out.println(divideByZero);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
