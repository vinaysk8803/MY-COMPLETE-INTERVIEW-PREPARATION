package HEAP;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class minNoOFsteps {
    public static int requiredTime(int[] s,  int[] t, int n){
        int count = 0;
        int j = 0;
        for( int i = 0; i<n; i++){
            count+= s[i];
            if(t[i] > s[i]){
                count+= t[i] - s[i];
            }

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] s = new int[n];
            int[] t = new int[n];
            for( int a = 0; a<n; a++){
                s[a] = sc.nextInt();
            }
            for( int j = 0; j<n;j++){
                t[j] = sc.nextInt();
            }

            int ans = requiredTime(s,t,n);
            System.out.println(ans);


    }
//    }
}

    /*
     * Complete the 'getMaxUnits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER_ARRAY boxes
     *  2. LONG_INTEGER_ARRAY unitsPerBox
     *  3. LONG_INTEGER truckSize
     */

