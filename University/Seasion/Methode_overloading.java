/**
 * Methode_overloading
 */
public class Methode_overloading {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    int sum(int a,int b,int c,int d,int e){
        return a+b+c+d+e;
    }
    public static void main(String[] args) {
        Methode_overloading m = new Methode_overloading();
        System.out.println(m.sum(10, 20));
        System.out.println(m.sum(10, 20,30));
        System.out.println(m.sum(10, 20,30,30));	
        System.out.println(m.sum(10, 20,30,40,50));
    }
}