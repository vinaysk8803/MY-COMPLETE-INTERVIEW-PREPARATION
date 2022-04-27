package Hashmap;

import java.util.Scanner;

public class solution {
    public static String noOfletter(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int lcs = dp[n][m];
        int ans = s2.length() - lcs;
        if(lcs == s1.length()){
            return new String(String.valueOf(ans));
        }else{
            return "IMPOSSIBLE";
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(noOfletter(s1,s2));
        }
    }
}
