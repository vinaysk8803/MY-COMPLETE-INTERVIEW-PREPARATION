//18. 4Sum

//Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] \
// such that:   0 <= a, b, c, d < n  a, b, c, and d are distinct.
//     nums[a] + nums[b] + nums[c] + nums[d] == target
//        You may return the answer in any order.
//
// Example 1:
//        Input: nums = [1,0,-1,0,-2,2], target = 0
//        Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// Example 2:
//
//        Input: nums = [2,2,2,2,2], target = 8
//        Output: [[2,2,2,2]]


package ArraysSearching;

import java.util.*;

public class _4SumLeetcode18 {
     static  List<List<Integer>> fourSum(int[] nums, int target) {
         int n = nums.length;
         List<List<Integer>> ans = new ArrayList<List<Integer>>();
         if (n==0){
             return  ans;
         }
         Arrays.sort(nums);
         for (int i = 0; i <n-1 ; i++) {
             for (int j = i+1; j <n ; j++) {
                 int newTarget = target - (nums[i] + nums[j]);
                 int left = j+1;
                 int right = n-1;
                 while(left<right){
                     if(nums[left] + nums[right] < newTarget){
                         left++;
                     }
                     else if(nums[left] + nums[right] > newTarget){
                         right--;
                     }else{
                         List<Integer> tempList = new ArrayList<Integer>();
                         tempList.add(nums[i]);
                         tempList.add(nums[j]);
                         tempList.add(nums[left]);
                         tempList.add(nums[right]);
                         ans.add(tempList);
                         while (left < right && nums[left] == tempList.get(2)) ++left;
                         while (left < right && nums[right] == tempList.get(3)) --right;
                         }
                     }
                  while (j<n-1 && nums[j] == nums[j+1] ){
                      ++j;
                 }
             }
             while (i<n-2 && nums[i] == nums[i+1] ){
                 ++i;
             }

         }
         return ans;
    }

    public static void main(String[] args) {
        int[] arr ={1,0,-1,0,-2,2};
        System.out.println(fourSum(arr,0));
    }
}
