package inheritance;
class Employee {
    double salary = 4000.5;
}
class Programmer extends Employee {
    int bonus = 1000;
}
class Shopping extends Programmer {
    int shop = 2000;
}
public class Multilevel {
    public static void main(String[] args) {
        Shopping s = new Shopping();
        System.out.println(s.bonus+s.salary+s.shop);
    }
}