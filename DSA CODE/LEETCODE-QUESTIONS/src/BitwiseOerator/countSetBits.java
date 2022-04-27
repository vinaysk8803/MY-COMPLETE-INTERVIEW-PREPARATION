package BitwiseOerator;

public class countSetBits {
    public  static int countSetbits(int n){
        int ans = 0;
        while(n>0){
             ans+= 1 & (n>>1);
             n = n>>1;
        }
     return ans;
    }
    public  static int countSetbits2(int n){
        int ans = 0;
        while(n>0){
            ans+= 1 & (n>>1);
            n = n>>1;
        }
        return ans;
    }
    public static boolean checKthBitSetOrNot(int n, int k){
        int a = 1;
       a = a<<k-1;    // using left shift
        int b = a&n;
        n = n>>k-1; // method 2 right shift
        b =n ;
      if(b == 0){
            return false;
        }else{
            return true;
        }
    }


    public static void main(String[] args) {
        int ans = countSetbits(63);
        boolean a = checKthBitSetOrNot(238,6);
        System.out.println(ans);
        System.out.println(a);
    }
}
