class Employee{
    float salary=40000;
}
class Programmer extends Employee{
    int bonus = 1000;
}
class Overtimes extends Employee{ 
    int over=800;
}
public class Hierarchical_inheritance {
    public static void main(String[] args) {
       Programmer p=new Programmer();
       Overtimes o=new Overtimes();
       System.out.println("Total beton "+(p.salary+p.bonus+o.over));
    }
}
