//215. Kth Largest Element in an Array
//        Given an integer array nums and an integer k, return the kth largest element in the array.
//      Note that it is the kth largest element in the sorted order, not the kth distinct element.
//         Example 1:
//
// Input: nums = [3,2,1,5,6,4], k = 2
//        Output: 5
//        Example 2:
//
//  Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
//        Output: 4

package HEAP;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementLeetcode215 {
    static int findKthLargest(int[] nums, int k) {
        Queue<Integer> ans = new PriorityQueue<>((a,b)-> b- a) ;
        for (int i = 0; i <nums.length ; i++) {
            ans.add(nums[i]);
        }
        int a=1;
        while (a<k){
            ans.poll();
            a++;
        }
        return ans.peek();
    }
    static int findKthLargestMinHeap(int[] nums, int k) {
        Queue<Integer> ans = new PriorityQueue<>() ;
        int n = nums.length;
        for (int i = 0; i <n ; i++) {
            ans.add(nums[i]);
            if(ans.size()>k){
                ans.poll();
            }
        }

        return ans.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
       int hey = findKthLargest(arr,4);
        System.out.println(hey);

    }

}
