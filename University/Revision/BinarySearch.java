public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,80,100};
        int t = 1000;
        boolean r = false;
        int left=0;
        int right=arr.length-1;
        while (left<=right) {
            int mid = (left+right)/2;
            if(arr[mid]==t){
                r = true;
                break;
            }else if(arr[mid]<t){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        System.out.println(r ? "Found" : "Not found");
    }
}
