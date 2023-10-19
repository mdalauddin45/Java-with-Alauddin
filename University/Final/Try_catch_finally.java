public class Try_catch_finally {
    public static void main(String[] args) {
        try {
            int reminder = 5 % 0;
            System.out.println(reminder);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This is the finally block");
        }
    }
}
