class Solution {
    int count=0;
    private void fun(int []nums, int target,int sum,int i){
        if(i==nums.length){
if(sum==target)count++;
return;
        }
 fun(nums,target,sum+nums[i],i+1);
 fun(nums,target,sum-nums[i],i+1);
    }
    public int findTargetSumWays(int[] nums, int target) {
      fun(nums,target,0,0);
      return count;  
    }
}