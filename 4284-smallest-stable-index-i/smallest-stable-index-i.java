class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n= nums.length;
     int min[]= new int [n];
     int suff= Integer.MAX_VALUE;   
     for(int i=n-1;i>=0;i--){
        suff=Math.min(suff,nums[i]);
        min[i]=suff;
     }
     int pre=Integer.MIN_VALUE;
     for(int i=0; i<n;i++){
       pre=Math.max(pre,nums[i]);
       if(pre-min[i]<=k)return i;
     }
     return -1;
    }
}