import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_handle {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x/y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + " Your cant divided by zero IDIOT");
        } catch(InputMismatchException e){
            System.out.println("Pleace enter a number OMFG");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }finally{
            System.out.println("This will always be print");
        }
    }
}
