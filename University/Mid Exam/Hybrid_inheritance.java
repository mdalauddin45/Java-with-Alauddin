class Employee {
    float salary = 40000;
    float getSalary() {
        return salary;
    }
}

class OvertimeEmployee extends Employee {
    int overtime = 500;
    int getOvertime() {
        return overtime;
    }
}
class BonusEmployee extends Employee {
    int bonus = 2000;
    int getBonus() {
        return bonus;
    }
}
class ManagerEmployee extends BonusEmployee {
    int overtimeBonus = 1000;
    int getOvertimeBonus() {
        return overtimeBonus;
    }
}

public class Hybrid_inheritance {
    public static void main(String[] args) {
        ManagerEmployee me =new ManagerEmployee();
        OvertimeEmployee oe =new OvertimeEmployee();
        
        System.out.println("Manager salary paibo "+(me.salary+me.overtimeBonus+me.bonus));
        System.out.println("Overtime Employee salary paibo "+(oe.salary+oe.overtime));
    }
}
