public class default_constructor {
    int roll =13;
    String name="Alauddin";
    void display(){
        System.out.println(name+" "+roll);
    }
    public static void main(String[] args) {
        default_constructor s1=new default_constructor();
        s1.display();
    }
}
