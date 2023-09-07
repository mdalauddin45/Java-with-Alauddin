import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        switch(s)
        {
            case "bodi": 
            System.out.println("বদ্দা আই তরে ডরাই");
             break;
            case "kader" : 
            System.out.println("মাসুদ ভালো হয়ে যাও");
            break;
            case "samim":
            System.out.println("খেলা হবে , আসো খেলবো");
            break;
            case "borhan":
            System.out.println("১৯৯৮ সালে  এইট পাশ , যা র্বতমান যুগের বিসিএস ক্যাডারের সমান ");
            break;
            default:
            System.out.println(" তুমি হয়তো বুঝো না , কারণ তোমার বয়স কম");
        }
    }
}
