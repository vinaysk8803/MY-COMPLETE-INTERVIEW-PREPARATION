package Maths;

public class gcd {
    static int Gcd(int a, int b){
        if(b == 0){
            return a;
        }else {
            return Gcd(b,a%b);
        }
    }

    public static void main(String[] args) {
        System.out.println(Gcd(126,72));
    }
}
