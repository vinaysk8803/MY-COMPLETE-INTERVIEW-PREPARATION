package Sliding_window;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class firstNeagtiveNumInWindow {
    public static long[] printFirstNegativeInteger(long a[], int n, int k)
    {
       long[] ans = new long[n-k+1];
        Queue<Long> q = new LinkedList<>();
        int i = 0;
        int j = 0;
        for(j = 0;j<k-1;j++){
            if(a[j] < 0){
               q.offer(a[j]);
            }
        }
        for (j = k-1; j <n ; j++,i++) {
            if(a[j]<0) q.offer(a[j]);
            if(!q.isEmpty()){
                ans[i] = q.peek();
            }else {
                ans[i] = 0;
            }
            if(a[i] < 0){
                q.poll();
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        long[] list = {-5,-2,3};
        long[] ans = printFirstNegativeInteger(list, list.length, 3);
        System.out.println(Arrays.toString(ans));

    }
}
