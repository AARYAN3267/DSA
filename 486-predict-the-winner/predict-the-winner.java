class Solution { 
    //dp laga do woh toh constrains chote iss liye chl gya..otherwise it would have kicked my ass
        //for satisfaction dp wala bhi karleta hu submit
    public int fun(int[]nums, int[][]dp,int i, int j){
    if(i==j)return nums[i];
    if(dp[i][j]!=-1)return dp[i][j];
    int left =nums[i]-fun(nums,dp,i+1,j);
    int right= nums[j]-fun(nums,dp,i,j-1);
    return dp[i][j]= Math.max(left,right);
    }
    public boolean predictTheWinner(int[] nums) {
        int n= nums.length;
        int dp[][]= new int[n][n];
        for(int a[]:dp){Arrays.fill(a,-1);}
      
               return fun(nums,dp,0,nums.length-1)>=0; 
    }
}