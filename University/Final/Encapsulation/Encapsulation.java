/**
 * Encapsulation
 */
class Person{
    String name;
    int age;
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
    int getAge(){
        return age;
    }
    void setAge(int age){
        this.age = age;
    }
}
public class Encapsulation {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alauddin");
        p.setAge(23);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}