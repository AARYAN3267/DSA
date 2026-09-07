class Solution {
    //WILL WORK BUT WILL GIVE TLE BECAUSE OF RECURSIVE TREE :-}

//     private int fun(String s, StringBuilder sb, HashSet<String> set, int i){
//         int mod=1_000_000_007;
//  if(i==s.length()){
//     String curr= sb.toString();
//     if(set.contains(curr)) return 0;
//     else{
//         set.add(curr);
//         return 1;
//     }
//  }

//         sb.append(s.charAt(i));
//         long pick= fun(s,sb,set,i+1);
//         sb.deleteCharAt(sb.length()-1);
//         long notpick=fun(s,sb,set,i+1);
        
//         return (int)(((pick+notpick)+mod)%mod);
//     }
//     public int distinctSubseqII(String s) {
//   int mod=1_000_000_007;
//        HashSet<String> set= new HashSet<>();
//        StringBuilder sb= new StringBuilder();
//        return ((fun(s,sb,set,0)-1)+mod)%mod; 
//     }

//IF A CHARACTER APPEAR ONCE AGAIN DELETE THE NO OF SUBSEQUENCE IT HAD PREVIOUSLY MADE 
// WE CAN CALCULATE TOTAL NO OF SUBSEQUENCE BY 2^N;

//  private int fun(int n,int []prev,Integer[]dp){
//   int mod=1_000_000_007;
//   if(n==0)return 1;
//   if(dp[n]!=null)return dp[n];

//     int total=(2*fun(n-1,prev,dp))%mod;
//     if(prev[n]!=0){
//         int duplicate=fun(prev[n]-1,prev,dp);
//         total= ((total-duplicate)+mod)%mod;
//     }
//     return dp[n]=total;
//     }
//     public int distinctSubseqII(String s) {
//         Integer dp[]= new Integer[2001];
//   int mod=1_000_000_007;
//   int n= s.length();
//       int lastseen[]= new int[27];
//       int prev[]=new int[n+1];
//       for(int i=1;i<=n;i++){
//         int ind= s.charAt(i-1)-'a';
//         prev[i]=lastseen[ind];
//         lastseen[ind]=i;
//       }
//       return ((fun(n,prev,dp)-1)+mod)%mod;
       
//     }
    public int distinctSubseqII(String s){
        int dp[]= new int[2001];
  int mod=1_000_000_007;
  int n= s.length();
  int prev[]=new int[n+1];
  dp[0]=1;
  int lastseen[]= new int[27];
   for(int i=1;i<=n;i++){
        int ind= s.charAt(i-1)-'a';
        prev[i]=lastseen[ind];
        lastseen[ind]=i;
      }
  for(int i=1; i<=n;i++){
    int total=(2*dp[i-1])%mod;
  
    if(prev[i]!=0){
        int duplicate= dp[prev[i]-1];
        total= ((total-duplicate)+mod)%mod;
    }
    dp[i]=total;
  } 
  return (dp[n]-1+mod)%mod;
    }
}