class Employee{
    float salary=40000;
}
class Programmer extends Employee{
    int bonus = 1000;
}
class Shoping extends Programmer{
    int shop=3400;
}
public class Multilevel_inheritance {
    public static void main(String[] args) {
       Shoping s=new Shoping();
       System.out.println("baki tagibu atty "+(s.salary+s.bonus-s.shop)); 
    }
}
