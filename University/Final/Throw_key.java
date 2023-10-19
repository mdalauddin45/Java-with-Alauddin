public class Throw_key {
    public static void divideByZero() {
        throw new ArithmeticException("Trying to divided by 0");
    }
    public static void main(String[] args) {
        divideByZero();
    }
}
