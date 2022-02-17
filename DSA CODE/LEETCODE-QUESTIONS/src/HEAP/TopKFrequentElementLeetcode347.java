//347. Top K Frequent Elements
//        Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
//
// Example 1:
//        Input: nums = [1,1,1,2,2,3], k = 2
//        Output: [1,2]
//  Example 2:
//
//        Input: nums = [1], k = 1
//        Output: [1]


package HEAP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElementLeetcode347 {
    static int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0){
            return new int[k];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(a) - map.get(b));
        for ( int n: map.keySet()) {
            pq.add(n);
            if(pq.size() >k){
                pq.poll();
            }

        }
        int [] ans = new int[k];
        int i = 0;
        while (!pq.isEmpty()){
            int num = pq.poll();
            ans[i++] = num;
        }
return ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,3};
        int [] ans = topKFrequent(arr,2);
        System.out.println(Arrays.toString(ans));

    }
}
