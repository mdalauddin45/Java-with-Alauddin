/**
 * Methode_overloading
 */
public class Methode_overloading {
    int sum(int a){
        return a;
    }
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Methode_overloading m = new Methode_overloading();
        System.out.println(m.sum(10));
        System.out.println(m.sum(10,20));
        System.out.println(m.sum(10,20,30));
    }
}