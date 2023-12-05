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
public class Hierarchical {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        Shopping s = new Shopping();
        System.out.println(p.bonus+p.salary+s.shop);
    }
}
