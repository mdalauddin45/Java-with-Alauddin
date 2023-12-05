/**
 * Constructor
 */
class Person{
    String name;
    public Person(String personName){
        name = personName;
    }
    public void display(){
        System.out.println("Name: " + name);
    }
}
public class Constructor_example {

    public static void main(String[] args) {
        Person p = new Person("Alauddin");
        p.display();
    }
}