class Solution {
    public int maximizeGreatness(int[] nums) {
       Arrays.sort(nums);
       int i=0; int j=0;
       int c=0;
       while(j<nums.length){
        if(nums[i]<nums[j]){
            c++;
            i++;
        }
        j++;
       } 
       return c;
    }
}