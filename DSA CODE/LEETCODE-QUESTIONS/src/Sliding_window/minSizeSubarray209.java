package Sliding_window;

public class minSizeSubarray209 {
   static int minSubArrayLen(int target, int[] nums) {
        int min = nums.length+1;
        int start =0;
        int sum = 0;
        for(int i = 0;i<nums.length;){
            sum+= nums[i];
            if(sum<target){

                i++;
            }else if(sum == target){
                if(min> i - start+1){
                    min = i- start+1;
                    sum-= nums[start];
                    start++;
                }
            }else if(sum> target){
                while(sum> target) {
                    sum -= nums[start++];
                }
                if(sum == target){
                    if(min> i - start+1){
                        min = i- start+1;
                        sum-= nums[start];
                        start++;
                    }
                }
                i++;
            }
        }
        return min == nums.length+1?0:min;
    }

    public static void main(String[] args) {
        int [] arr ={2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,arr));
    }
}
