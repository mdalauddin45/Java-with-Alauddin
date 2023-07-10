/**
 * Java_Date_and_Time
 */
import java.util.Scanner;
import java.util.Calendar;

public class Java_Date_and_Time {

    public static int getDay(int day, int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        return cal.get(Calendar.DAY_OF_WEEK)-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        sc.close();
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY",
        "FRIDAY", "SATURDAY"};
        System.out.println(days[getDay(day, month, year)]);

    }
}