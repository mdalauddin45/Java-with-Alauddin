class Sajib{
    String  ash;
    Sajib(String ash)
    {
        this.ash=ash;
    }
    void display()
    {
        System.out.println("This is Sajib Class");
    }
}
class SajibInClass extends Sajib{
    SajibInClass(String ash)
    {
        super(ash);
    }
    @Override void display()
    {
        System.out.println(ash);
    }
}
class SajibInPark extends Sajib{
    SajibInPark(String ash)
    {
        super(ash);
    }
    @Override void display()
    {
        System.out.println(ash);
    }
}
class SajibInHome extends Sajib{
    SajibInHome(String ash)
    {
        super(ash);
    }
    @Override void display()
    {
        System.out.println(ash);
    }
}
public class Overrideds {
    public static void main(String[] args) {
        SajibInClass sajib=new SajibInClass("assh mara boy");
        sajib.display();

        SajibInPark sajibInPark= new SajibInPark(" Fuck boy ");
        sajibInPark.display();

        SajibInHome sajibInHome = new SajibInHome("Good boy ");
        
    }
}
