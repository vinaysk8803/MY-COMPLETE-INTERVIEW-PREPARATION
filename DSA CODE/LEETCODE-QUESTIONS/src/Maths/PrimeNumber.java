package Maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
    static List<Integer> sieveOfEr(int n){
        // print prine till n
        boolean arr[] = new boolean[n+1];
        for(int i = 2;i<= n;i++){
            if(!arr[i]){
                for(int j = i+i;j<=n;j+=i){
                    if(!arr[j])
                    arr[j] = true;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 2;i<= n;i++){
            if(!arr[i]){
                ans.add(i);
            }
        }
        return ans;
    }
    static List<Integer> printPrimeFactor(int n){
        List<Integer> ans = new ArrayList<>();
        while (n%2 == 0){
            ans.add(2);
            n= n/2;
        }
        while (n%3 == 0){
            ans.add(3);
            n= n/3;
        }
    // check every prime number
        for(int i = 5;i*i<=n;i+= 6){
            while (n % i == 0) {
                ans.add(i);
            }
            while (n % (i+2) == 0) {
                ans.add(i+2);
            }
        }
        //tc = o(root(n))
       if(n>3) ans.add(n);
       return ans;
    }
    static boolean primeOrNot(int n){
        if(n == 1 || n== 0){
            return false;
        }
        if(n == 2 || n==3){
            return true;
        }
        if(n%3 == 0 || n% 2 == 0){
            return false;
        }

        // for every prime number except 2&3 can be written as 6n+1 / 6n-1
        for(int i = 5;i*i<=n;i+= 6){
            if(n% i == 0 || n%(i+2) == 0){
                return false;
            }
        }
        //tc = o(root(n))
        return true;
    }
    public static void main(String[] args) {
        System.out.println(primeOrNot(1733));
        System.out.println(printPrimeFactor(1733));
        List<Integer> n = sieveOfEr(100);
        System.out.println(n);
    }
}
