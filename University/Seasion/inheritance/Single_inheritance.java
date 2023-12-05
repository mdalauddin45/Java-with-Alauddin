package inheritance;
class Employee {
    double salary = 4000.5;
}
class Programmer extends Employee {
    int bonus = 1000;
}
public class Single_inheritance {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.bonus+p.salary);
    }
}
