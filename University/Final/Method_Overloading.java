public class Method_Overloading {
    public int sum(int x,int y){
        return (x+y);
    }
    public int sum(int x,int y,int z){
        return (x+y+z);
    }
    public double sum(double x,double y){
        return (x+y);
    }
    public static void main(String[] args) {
        Method_Overloading s = new Method_Overloading();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(10,20,40));
        System.out.println(s.sum(10.5,20.8));
    }
}
