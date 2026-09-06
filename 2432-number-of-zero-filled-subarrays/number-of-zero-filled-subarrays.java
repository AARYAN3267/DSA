class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sum=0,tailingzero=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            sum+=tailingzero+1;
            tailingzero++;
        }
        else {
            tailingzero=0;
        }
      }  
      return sum;
    }
}