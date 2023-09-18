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
        this.age=age;
    }
}
class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alauddin");
        p.setAge(23);
        System.out.println("Name "+p.getName());
        System.out.println("age "+p.getAge());
    }
}
