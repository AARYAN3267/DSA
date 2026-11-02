class Solution {
    public int minMoves2(int[] nums) {
      Arrays.sort(nums);
      int steps=0;
      int mid= nums[nums.length/2];
      for(int a:nums){
        steps+=Math.abs(mid-a);
      }  
      return steps;
    }
}