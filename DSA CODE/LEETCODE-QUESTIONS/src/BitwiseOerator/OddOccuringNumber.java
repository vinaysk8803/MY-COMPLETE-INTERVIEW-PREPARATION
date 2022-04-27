package BitwiseOerator;

public class OddOccuringNumber {
    static int findNum(int arr[]){
        int xor =0;
        for(int i = 0;i<arr.length;i++){
            xor^= arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,3,45,45,6,6,7,8,8,3,7,3};
        int ans = findNum(arr);
        System.out.println(ans);
    }
}
