package inheritance;
class Employee {
    double salary = 4000.5;
}
class Programmer extends Employee {
    int bonus = 1000;
}
class Shopping extends Employee {
    int shop = 2000;
}
class OverTime extends Shopping{
    int over = 3000;
}
public class Hybrid {
    public static void main(String[] args) {
        OverTime o = new OverTime();
        Programmer p = new Programmer();
        System.out.println(o.over+o.salary+o.shop+p.bonus);
    }
}