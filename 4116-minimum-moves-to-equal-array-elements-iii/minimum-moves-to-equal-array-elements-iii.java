class Solution {
    public int minMoves(int[] nums) {
      int max= nums[0];
      for(int a: nums){
        max=Math.max(max,a);
      }  
      int sum=0;
      for(int a: nums){
        sum+=(max-a);
      }
      return sum;
    }
}