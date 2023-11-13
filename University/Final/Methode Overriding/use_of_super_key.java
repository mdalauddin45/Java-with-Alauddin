class Animal{
    public void display(){
        System.out.println("I am an animal");
    }
}
class Dog extends Animal{
    public void display(){
        super.display();
        System.out.println("I am a dog");
    }
}
public class use_of_super_key {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}
