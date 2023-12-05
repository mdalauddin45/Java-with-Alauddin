class Polygon{
    void display(){
        System.out.println("Rendering Polygon");
    }
}
class Square extends Polygon{
    void display(){
        System.out.println("Rendering Square");
    }
}
class Circle extends Polygon{
    void display(){
        System.out.println("Rendering Circle");
    }
}
public class Polymorphism {

    public static void main(String[] args) {
        Polygon p = new Polygon();
        Square s = new Square();
        Circle c = new Circle();
        p.display();
        s.display();
        c.display();
    }
}