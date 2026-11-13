class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count =1; int max=1; int min=1;
      for (int i=1 ; i< nums.length;i++){
        if(nums[i-1]<nums[i]){
            count++; max=Math.max(count,max);
        }
        else { count=1;}
      }  
      count=1;
       for (int i=1 ; i< nums.length;i++){
        if(nums[i-1]>nums[i]){
            count++; min=Math.max(count,min);
        }
        else { count=1;}
      }
 return Math.max(min,max);
    }
}