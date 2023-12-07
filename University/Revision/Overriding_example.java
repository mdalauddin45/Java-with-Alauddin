//programmer override the bf
class Programmer{
    public void display(){
        System.out.println("I am a programmer");
    }
}
class BF extends Programmer{
    @Override
    public void display(){
        System.out.println("I am a BF");
    }
}
public class Overriding_example {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        BF bf = new BF();
        p.display();
        bf.display();
    }
}