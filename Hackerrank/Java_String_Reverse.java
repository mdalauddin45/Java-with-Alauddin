import java.util.Scanner;
/**
 * Java_String_Reverse
 */
public class Java_String_Reverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse = "";
        for(int i=A.length()-1;i>=0;i--){
            reverse = reverse + A.charAt(i);
        }
        if(A.equals(reverse)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}