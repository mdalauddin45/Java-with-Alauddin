class Employee {
    float salary = 40000;
}
class OvertimeEmployee extends Employee {
    int overtime = 500;
}
class BonusEmployee extends Employee {
    int bonus = 2000;
}
class ManagerEmployee extends BonusEmployee {
    int overtimeBonus = 1000;
}
public class Hybrid_inheritance {
    public static void main(String[] args) {
        ManagerEmployee me =new ManagerEmployee();
        OvertimeEmployee oe =new OvertimeEmployee();
        
        System.out.println("Manager salary paibo "+(me.salary+me.overtimeBonus+me.bonus));
        System.out.println("Overtime Employee salary paibo "+(oe.salary+oe.overtime));
    }
}
