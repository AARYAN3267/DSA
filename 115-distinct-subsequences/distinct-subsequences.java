class Solution {
//     private int fun(String s, String t, int m, int n,Integer dp[][]){
//  if(n==0)return dp[m][n]= 1;
//  if (m==0)return dp[m][n]= 0;
//  if(dp[m][n]!=null)return dp[m][n];
//         if(s.charAt(m-1)==t.charAt(n-1)){//if matchedd either pick it or not pick it for further searching same char after it;
//      return dp[m][n]=fun(s,t,m-1,n-1,dp)+fun(s,t,m-1,n,dp); 
//     }
//  return dp[m][n]= fun(s,t,m-1,n,dp);//not matched so no other option find in future only;
//     }
//     public int numDistinct(String s, String t) {
    
//       int m= s.length();
//       int n=t.length();
//       Integer dp[][]= new Integer[m+1][n+1];
//       return fun(s,t,m,n,dp);  
//     }

public int numDistinct(String s, String t){
    int m = s.length();
    int n= t.length();
    int dp[][]= new int [m+1][n+1];
    for(int i=0; i<=m;i++){
        dp[i][0]=1;
    }
    for(int i=1;i<=n;i++){
        dp[0][i]=0;
    }
    for(int i=1; i<=m;i++){
        for(int j=1;j<=n;j++){
            if(s.charAt(i-1)==t.charAt(j-1)){
                dp[i][j]= dp[i-1][j-1]+dp[i-1][j];
            }
            else{
                dp[i][j]= dp[i-1][j];
            }
        }
    }
    return dp[m][n];
}
}
