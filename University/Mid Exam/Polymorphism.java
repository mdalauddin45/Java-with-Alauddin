class Polygon{
    void display(){
        System.out.println("Randering Polygon...");
    }
}
class Square extends Polygon{
    void display(){
        System.out.println("Randering Square...");
    }
}
class Circle extends Polygon{
    void display(){
        System.out.println("Randering Circle...");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Square s = new Square();
        Circle c = new Circle();
        s.display();
        c.display();
    }
}
