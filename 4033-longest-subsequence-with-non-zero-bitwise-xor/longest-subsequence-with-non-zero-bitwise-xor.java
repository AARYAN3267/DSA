class Solution {
    public int longestSubsequence(int[] nums) {
      int n= nums.length;
      int ans=0;
      boolean allzero=true;
      for( int a:nums){
    ans^=a;
    if(a!=0)allzero=false;
      }
      if(allzero)return 0;
      return ans==0?n-1:n;
    }
}