package DynamicProgramming;

public class subsetsum {
    static boolean subsetsum(int[] arr , int sum){
        int N = arr.length;
        int dp[][] = new int[N+1][sum+1];
        for(int i=0;i<=N;i++){
            for(int j=0;j<=sum;j++){
                if(i==0 || j==0){
                    dp[i][j]= 0;
                }
                else{
                    if(arr[i-1]<=j){
                        dp[i][j]= Math.max(arr[i-1]+dp[i-1][j-arr[i-1]],dp[i-1][j]);
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }


                }
                if(sum==dp[i][j]){
                    return true;
                }

            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr ={1,5,11,5};
        int sum = 11;
        System.out.println(subsetsum(arr,sum));
    }
}
