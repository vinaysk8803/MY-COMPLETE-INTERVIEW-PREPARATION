package Strings;

import java.util.ArrayList;

public class findNthPermutaion {
    static String getPermutation(int n, String s,int k) {
        int fact = 1;
        ArrayList< Character > numbers = new ArrayList < > ();
        for (int i = 1; i < n; i++) {
            fact = fact * i;
            numbers.add(s.charAt(i-1));
        }
        numbers.add(s.charAt(n-1));
        String ans = "";
        k = k - 1;
        while (true) {
            ans = ans + "" + numbers.get(k / fact);
            numbers.remove(k / fact);
            if (numbers.size() == 0) {
                break;
            }

            k = k % fact;
            fact = fact / numbers.size();
        }
        return ans;
    }


    public static void main(String args[]) {
        int n = 6, k = 699;
        String ans = getPermutation(n,"GINRTU", k);
        System.out.println("GINRTU");
        System.out.println("The Kth permutation sequence is " + ans);


    }
}