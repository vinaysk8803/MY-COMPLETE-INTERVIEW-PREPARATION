// 1636  Sort Array by Increasing Frequency
//Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.
 //Return the sorted array.
//      Example 1:
//    Input: nums = [1,1,2,2,2,3]
//        Output: [3,1,1,2,2,2]
//        Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
//    Example 2:
//   Input: nums = [2,3,1,3,2]
//        Output: [1,3,3,2,2]
//        Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
//    Example 3:
////  Input: nums = [-1,1,-6,4,5,-6,1,4,1]
//         Output: [5,-1,4,4,-6,-6,1,1,1]

package HEAP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortArraybyIncreasingFrequencyLeetcode1636 {
   static  int[] frequencySort(int[] nums) {
        if(nums.length == 0){
            return new int[0];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b)-> map.get(a) == map.get(b)? b - a: map.get(a) - map.get(b));

       for ( int n: map.keySet()) {
            pq.add(n);
        }
       int n = nums.length;
        int [] ans = new int[n];
     int count = 0;
        while (!pq.isEmpty()){
            int val = pq.peek();
            int a = map.get(pq.peek());
            for (int i = 0; i <a ; i++) {
                ans[count++] = val;

            }
            pq.poll();
        }
        return ans;
    }
    public static void main(String[] args) {
       int [] a = {1,1,2,2,2,3,4,4,5};
        System.out.println(Arrays.toString(frequencySort(a)));

    }
}
