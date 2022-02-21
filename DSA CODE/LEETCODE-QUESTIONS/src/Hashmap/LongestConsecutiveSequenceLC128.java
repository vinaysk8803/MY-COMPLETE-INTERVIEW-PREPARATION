package Hashmap;

//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//        You must write an algorithm that runs in O(n) time.
//
//  Example 1:
//        Input: nums = [100,4,200,1,3,2]
//        Output: 4
//        Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:
//        Input: nums = [0,3,7,2,5,8,4,6,0,1]
//        Output: 9


import java.util.HashMap;

public class LongestConsecutiveSequenceLC128 {
    static  int longestConsecutive(int[] nums) {
       if(nums.length == 0){
           return 0;
       }
       HashMap<Integer,Boolean>  map1 = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            map1.put(nums[i], true);
        }

        for (int i = 0; i <nums.length ; i++) {
            if(map1.containsKey(nums[i] -1)){
                map1.put(nums[i], false);
            }
        }
        int ans =0;
        int firstVal = 0;
        for (int num: nums) {
            if(map1.get(num) == true){
                int len = 1;
                int val = num;
                while(map1.containsKey(val+len)){
                    len++;
                }
                if(len> ans){
                    ans = len;
                    firstVal = val;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
 int [] arr = {100,4,5, 7,8,9,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
}
