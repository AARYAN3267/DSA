class Solution {
    public int[] leftRightDifference(int[] nums) {
     int ans[]= new int[nums.length];  
     int sum=0;
     for(int a:nums){
        sum+=a;
     } 
     int lsum=0;
     for(int i=0;i<nums.length;i++){
        sum-=nums[i];
        ans[i]=Math.abs(lsum-sum);
        lsum+=nums[i];
     }
     return ans;
    }
}