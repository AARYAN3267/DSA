class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] minLen = new int[n];
        int INF = 1_000_000_000;
        java.util.Arrays.fill(minLen, INF);

        int left = 0, sum = 0;
        int ans = INF;
        int currentMin = INF;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum > target) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                int curLen = right - left + 1;
                
                // If a non-overlapping sub-array exists before 'left', combine them
                if (left > 0 && minLen[left - 1] != INF) {
                    ans = Math.min(ans, minLen[left - 1] + curLen);
                }
                
                currentMin = Math.min(currentMin, curLen);
            }

            minLen[right] = currentMin;
        }

        return ans >= INF ? -1 : ans;
    }
}