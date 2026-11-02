class Solution {
    public int minMoves(int[] nums) {
       Arrays.sort(nums);
       int sum=0;
       for(int a: nums){
        sum+= a-nums[0];
       } 
       return sum;
    }
}