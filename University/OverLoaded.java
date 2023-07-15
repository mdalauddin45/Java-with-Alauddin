public class OverLoaded {
    public static void main(String[] args) {
        int x = add(21, 92,49);
        System.out.println(x);
    }
    static int add(int x,int y)
    {
        System.out.println("This is overload methode 1");
        return x+y;
    }
    static int add(int x,int y,int z)
    {
         System.out.println("This is overload methode 2");
        return x+y+z;
    }
    static int add(int x,int y,int z,int a)
    {
         System.out.println("This is overload methode 3");
        return x+y+z+a;
    }
}
