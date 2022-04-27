package Maths;

public class countTrailingZero {
    static int countTrailingZeroinfactorial(int n){
        int ans = 0;
        for(int i = 5;i<=n;i*=5){
            ans+= n/i;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(countTrailingZeroinfactorial(30));
    }
}
