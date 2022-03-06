package HEAP;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class gfgcontest {
    public static int[] smallestToRight(int[] arr){
        int ans[] = new int[arr.length];
        Queue<Integer> pq = new PriorityQueue<>((a, b)-> b- a) ;
        for(int i = arr.length -1; i>=0;i--){
            while(!pq.isEmpty() && pq.peek() > arr[i]){
                pq.poll();
            }
            ans[i] = pq.size();
            pq.add(arr[i]);
        }
        return ans;
    }
    public static int[] largestToLeft(int[] arr){
        int ans[] = new int[arr.length];
        Queue<Integer> pq = new PriorityQueue<>() ;
        int count = 0;
        for(int i = 0 ; i<arr.length;i++){
            while(!pq.isEmpty() && pq.peek() < arr[i]){
//                pq.poll();
                count --;
            }
            ans[i] = count;
            pq.add(arr[i]);
            count++;

        }
        return ans;
    }
    public static int[] greaterLesser(int[] a){
        int[] left = largestToLeft(a);
        int [] right = smallestToRight(a);
        int [] ans = new int[a.length];
        for(int i = 0; i<ans.length;i++){
            ans[i] = Math.abs(right[i]- left[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,10,2,100,3};
        int ans[] = greaterLesser(arr);
        System.out.println(Arrays.toString(ans));
    }
}
