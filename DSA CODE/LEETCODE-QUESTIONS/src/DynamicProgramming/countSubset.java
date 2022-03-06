package DynamicProgramming;

public class countSubset {
    static int countOfSubsetSum(int[] nums, int sum){
        int[][] dp = new int[nums.length+1][sum+1];
        dp[0][0] = 1;
        for(int i = 1;i<sum+1;i++){
            dp[0][i] = 0;
        }

        for(int i = 1; i<nums.length+1 ;i++){
            for(int j = 0; j<=sum ;j++){
                if(nums[i-1] <= j){
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]];

                }else{
                    dp[i][j] = dp[i -1][j];
                }
            }
        }
        return dp[nums.length][sum];

    }

    public static void main(String[] args) {
        int [] arr = {2,5,3,4,4,6,2};
        int a = countOfSubsetSum(arr,8);
        System.out.println(a);
    }
}
