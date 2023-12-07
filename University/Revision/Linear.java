public class Linear {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,80,100};
        int t = 500;
        int x=0;
        boolean r = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                r=true;
                x=i;
            }
        }
        if(r==false) System.out.println("Not found");
        else System.out.println("found at index "+x);
    }
}
