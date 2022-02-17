//658. Find K Closest Elements
// Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.
//An integer a is closer to x than an integer b if:
//        |a - x| < |b - x|, or
//        |a - x| == |b - x| and a < b
//
//        Example 1:
//
//   Input: arr = [1,2,3,4,5], k = 4, x = 3
//        Output: [1,2,3,4]
//        Example 2:
//
//  Input: arr = [1,2,3,4,5], k = 4, x = -1
//        Output: [1,2,3,4]

package HEAP;
import java.util.*;

public class KClosestElementsLeetcode_658 {
                        // if array is not sorted then use this
    public static class Pair{
         int index;
         int diff;
        Pair(int val, int d){
            index = val;
            diff = d;
        }

    }
   static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> heap = new PriorityQueue<>((a,b)->(b.diff == a.diff)?(b.index- a.index):(b.diff- a.diff) );
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            heap.offer(new Pair(i,Math.abs(x - arr[i])));
            if(heap.size() > k){
                heap.poll();
            }
        }
        while (!heap.isEmpty()){
            ans.add(arr[heap.poll().index]);

        }
        Collections.sort(ans);
        return ans;
    }
    // if array is sorted then use two pointer method
    static List<Integer> findClosestElementsForSortedArray(int[] arr, int k, int x) {
        int low = 0;
        int high = arr.length-1;
        while (high - low >= k){
            if((Math.abs(arr[high] - x)) < (Math.abs(arr[low] - x))){
                low++;
            }else {
                high--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = low; i <= high ; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] customArray = {1,2,3,4,5,6,7,8,9};
        System.out.println(findClosestElements(arr,3,3));
        System.out.println(findClosestElements(customArray,4,5));
        System.out.println(findClosestElementsForSortedArray(arr,3,3));
        System.out.println(findClosestElementsForSortedArray(customArray,4,5));
    }
}
