public class parameterized_constructor {
    parameterized_constructor(int a,int b){
        System.out.println("parameterized constructor");
        System.out.println("havig two parameter");
    }
    public static void main(String[] args) {
        parameterized_constructor s1 = new parameterized_constructor(10, 20);

    }
}
