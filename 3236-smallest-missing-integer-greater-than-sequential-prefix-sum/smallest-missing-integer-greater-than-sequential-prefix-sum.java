class Solution {
    public int missingInteger(int[] nums) {
     HashSet<Integer>set = new HashSet<>();
     if(nums.length==1)return nums[0]+1;
     int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break; 
            }
        }
        for(int a:nums)set.add(a);
        while(set.contains(sum))sum++;
        return sum;   
    }
}