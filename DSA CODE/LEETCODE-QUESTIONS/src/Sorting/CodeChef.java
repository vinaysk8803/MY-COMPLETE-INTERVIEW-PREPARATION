package Sorting;

import java.util.Scanner;

public class CodeChef {
    static int gcd(int a , int b){
        if(a%b ==0) return b;
        return  gcd(b,a%b);
    }
    static int[] solve(int a, int b){
        int ans[] = {-1,-1};
        for(int i = a;i<b;i++){
            for(int j = i+1;j<=b;j++){
            if(gcd(i,j) >1){
                ans[0] =i;
                ans[1] =j ;
                return ans;
            }
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] ans = solve(a,b);
            if(ans[0] == -1){
                System.out.println(-1);
        }else{
                System.out.println(ans[0]);
                System.out.println(ans[1]);
            }
    }
    }
}
