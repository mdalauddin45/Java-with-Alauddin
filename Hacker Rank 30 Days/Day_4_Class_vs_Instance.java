/**
 * Day_4_Class_vs_Instance
 */
import java.util.Scanner;

public class Day_4_Class_vs_Instance {
    private int age;

    public Day_4_Class_vs_Instance(int i) {
        if (i < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        } else {
            age = i;
        }
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        age++;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++) {
            int age = sc.nextInt();
            Day_4_Class_vs_Instance p = new Day_4_Class_vs_Instance(age);
            p.amIOld();
            for (int j=0;j<3;j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
    }
}
