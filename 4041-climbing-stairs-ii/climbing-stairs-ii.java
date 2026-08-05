class Solution {
    public int climbStairs(int n, int[] costs) {
     int dp[]= new int[n+1];
     Arrays.fill(dp,-1);
     return min(n,dp,costs);}
    public int min(int n, int dp[], int cost[]){
        int ans= Integer.MAX_VALUE;
   if(n==0)return 0;
   if(dp[n]!=-1)return dp[n];
   if(n>=1){
 ans =Math.min(ans, min(n-1,dp,cost)+costcal(n,1,cost));
   }
    if(n>=2){
 ans =Math.min(ans, min(n-2,dp,cost)+costcal(n,2,cost));
   }
    if(n>=3){
 ans =Math.min(ans, min(n-3,dp,cost)+costcal(n,3,cost));
   }
   return dp[n]=ans;
    }
    public int costcal(int i, int j ,int cost[]){
        return cost[i-1]+j*j;
    }
}