class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int a:nums){
            min= Math.min(a,min);
            max= Math.max(max,a);
        }
        return (long)(max-min)*k;
        
    }
}