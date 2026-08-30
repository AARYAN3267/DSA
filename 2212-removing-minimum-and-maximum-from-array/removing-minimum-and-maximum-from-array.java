class Solution {
    public int minimumDeletions(int[] nums) {
        int maxind=0; int minind=0;
        int n=nums.length;
       for(int i=0;i<n;i++){
        if(nums[i]<nums[minind])minind=i;
        if(nums[i]>nums[maxind])maxind=i;
       }
       int i=Math.min(minind, maxind);
       int j= Math.max(maxind,minind);
       int o1=n-i;
       int o2=j+1;
      int o3= (n-j)+(i+1);
      return Math.min(o1,Math.min(o2,o3));
    }
}