class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
    int ans=0;
    for (int i=0; i< nums.length; i++){
   int freq=0;
   for(int j=i; j<nums.length;j++){
      if(nums[j]==target)freq++;
      if(2*freq>j-i+1)ans++;
   }
    }    
    return ans; 
    }
}