package Maths;

public class FastPower {
    static  long fastPower(int number , int power){
          long res = 1;
          while(power>0){
              if((power&1) != 0){
                  res = res*number;
              }
              number = number*number;
              power = power>>1;
          }
          return res;
            }
    public static void main(String[] args) {
        System.out.print(fastPower(4,4));
    }
}
