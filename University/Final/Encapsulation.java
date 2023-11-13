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
        if(age>=0){
            this.age= age;
        }
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.name("Ala Uddin");
        person.age(23);
    }
}
