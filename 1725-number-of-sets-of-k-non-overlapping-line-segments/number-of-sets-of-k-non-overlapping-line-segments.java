class Solution {
    int mod= 1_000_000_007;
    private long fun(int n,int i,int k,int conti,Integer dp[][][]){
long ways=0;
if(k==0)return dp[i][k][conti]=1;
if(i==n)return dp[i][k][conti]=0;
if(dp[i][k][conti]!=null)return dp[i][k][conti];
//if we are continuing to draw the segment
if(conti==1){
 ways= (ways+fun(n,i+1,k,1,dp))%mod;//either we can continue to take
  ways= (ways+ fun(n,i,k-1,0,dp))%mod;//or we can stop
}
else{
    //if we have to start another segement
ways= (ways+fun(n,i+1,k,1,dp))%mod;//we can take this posi
ways= (ways+fun(n,i+1,k,0,dp))%mod;//or we can skip this posi
}
return dp[i][k][conti]=(int)ways;
    }
    public int numberOfSets(int n, int k) {
        Integer dp[][][]= new Integer[n+1][k+1][2];
        return (int)fun(n,0,k,0,dp);
    }
}