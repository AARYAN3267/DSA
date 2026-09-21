class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] result = new long[k];
        long[] dp = new long[k];

        for (int num : nums) {
            int rem = num % k;
            long[] nextDp = new long[k];
            
            // Single-element subarray starting and ending at current index
            nextDp[rem]++;
            
            // Extend previous subarrays to include current element
            for (int r = 0; r < k; r++) {
                if (dp[r] > 0) {
                    int newRem = (r * rem) % k;
                    nextDp[newRem] += dp[r];
                }
            }
            
            // Accumulate counts into final answer array
            for (int r = 0; r < k; r++) {
                result[r] += nextDp[r];
            }
            
            dp = nextDp;
        }

        return result;
    }
}