class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
  
     int min= Integer.MAX_VALUE;
     for(int i=0;i<nums.length;i++){
        int curr=0;
        if(nums[i]==target){
            curr=Math.abs(i-start);
             min=Math.min(min,curr);
        }
       
     }
 return min;
    }
}