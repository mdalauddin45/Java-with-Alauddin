class Shape{
    String type;
    Shape(String type)
    {
        this.type=type;
    }
    void display()
    {
        System.out.println("This is a shape.");
    }
}
class Polygon extends Shape{
    int numSides;
    Polygon(String type,int numSides)
    {
        super(type);
        this.numSides=numSides;
    }
    void display()
    {
        System.out.println("This is a " + type + " with " + numSides + " sides.");
    }
}
class Rectangle extends Polygon{
    Rectangle(String type,int numSides)
    {
        super(type, numSides);
    }
    void display()
    {
        System.out.println("This is a " + type + " with " + numSides + " sides");
    }
}
class Triangle extends Rectangle{
    Triangle(String type,int numSides)
    {
        super(type, numSides);
    }
    void display()
    {
        System.out.println("This is a " + type + " with " + numSides + " sides");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Shape shape = new Shape("Generic Shape");
        shape.display();

        Polygon polygon = new Polygon("Polygon", 5);
        polygon.display();

        Rectangle rectangle = new Rectangle("Rectangle", 4);
        rectangle.display();

        Triangle triangle = new Triangle("Triangle", 3);
        triangle.display();
    }
}
