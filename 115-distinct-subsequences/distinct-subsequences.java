class Solution {
    private int fun(String s, String t, int m, int n,Integer dp[][]){
 if(n==0)return dp[m][n]= 1;
 if (m==0)return dp[m][n]= 0;
 if(dp[m][n]!=null)return dp[m][n];
        if(s.charAt(m-1)==t.charAt(n-1)){
     return dp[m][n]=fun(s,t,m-1,n-1,dp)+fun(s,t,m-1,n,dp);     
    }
 return dp[m][n]= fun(s,t,m-1,n,dp);
    }
    public int numDistinct(String s, String t) {
    
      int m= s.length();
      int n=t.length();
      Integer dp[][]= new Integer[m+1][n+1];
      return fun(s,t,m,n,dp);  
    }
}