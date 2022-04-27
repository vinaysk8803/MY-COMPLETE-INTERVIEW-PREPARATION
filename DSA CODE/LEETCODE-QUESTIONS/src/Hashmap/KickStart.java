package Hashmap;

import java.util.Scanner;

public class KickStart {
    public static int intresting(int start, int end){
        int product = 1;
        int sum = 0;
        int count = 0;
        for(int i = start;i<=end;i++){
            String s = Integer.toString(i);
            char[] arr = s.toCharArray();
            for(int j =0;j<arr.length;j++ ){
                sum+= arr[j] - '0';
                product*= arr[j] - '0';

            }
            if(product%sum == 0){
                count++;
            }
            sum = 0;
            product = 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(intresting(start,end));
        }

    }
}
