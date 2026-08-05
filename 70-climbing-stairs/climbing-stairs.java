class Solution {
    public int climbStairs(int n) {
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);
        return findways(n,dp);
    }
    public  int findways(int n, int dp[]){
        if(n==1||n==0){
            return 1;
        }
        if(dp[n]!=-1)return dp[n];
         return dp[n]= findways(n-1,dp)+findways(n-2,dp);
    }
}