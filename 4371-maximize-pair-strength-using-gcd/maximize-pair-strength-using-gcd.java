class Solution {
    public long maxPairStrength(int[] nums) {
        long ans= Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for (int j=i+1;j<nums.length;j++){
                long c= gcd(nums[i],nums[j]);
           long curr= ((long)nums[i]/c)*((long)nums[j]/c);
           ans=Math.max(ans,curr);
            }
        }
        return ans;
    }
    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}