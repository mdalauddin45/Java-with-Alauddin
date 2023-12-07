public class StringBuffer_example {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello ");
        sb.append("world");
        sb.insert(6, "my ");
        sb.delete(7, 8);
        sb.replace(6, 7, "ny");
        String s = sb.toString();
        System.out.println(s);
    }
}