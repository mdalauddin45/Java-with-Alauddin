import java.util.Scanner;
public class MidValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = sc.nextInt();
        }
        int[] result = makeMiddle(inputArray);
        
        for (int num : result) {
            System.out.print(num + " "); 
        }
    }
    
    public static int[] makeMiddle(int[] nums) {
        int middle = nums.length / 2;
        int[] result = {nums[middle - 1], nums[middle]};
        return result;
    }
}
