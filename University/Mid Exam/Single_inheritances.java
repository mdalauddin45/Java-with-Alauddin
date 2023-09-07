class Employee{
    float salary=40000;
}
class Programmer extends Employee{
    int bonus = 1000;
}
public class Single_inheritances {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        // System.out.println(p.bonus);
        // System.out.println(p.salary);
        //total beton
        System.out.println("My beton holo "+(p.bonus+p.salary));
    }
}
