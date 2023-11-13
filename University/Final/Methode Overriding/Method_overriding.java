/**
 * Method_overriding
 */
class Animal{
    public void display(){
        System.out.println("I am an animal");
    }
}
class Dog extends Animal{
    @Override
    public void display(){
        System.out.println("I am a dog");
    }
}
public class Method_overriding {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.display();
        dog.display();
    }
}