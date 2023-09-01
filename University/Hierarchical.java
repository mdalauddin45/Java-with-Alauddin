import java.util.*;
class Person{
    String name;
    Person(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
}
class Student extends Person{
    String course;
    Student(String name,String course)
    {
        super(name);
        this.course=course;
    }
    void display()
    {
        System.out.println(name + " is studying " + course + ".");
    }
}
class Teacher extends Person{
    String subject;
    Teacher(String name,String subject)
    {
        super(name);
        this.subject=subject;
    }
    void display()
    {
        System.out.println(name + " is teaching " + subject + ".");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Student student = new Student("Alauddin", "Computer Science");
        student.display();

        Teacher teacher = new Teacher("Asaduzzaman Apu ",  "Java");
        teacher.display();
    }
}
