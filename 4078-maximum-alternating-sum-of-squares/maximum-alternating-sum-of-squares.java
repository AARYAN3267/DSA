class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squares = new long[n];
        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(squares);
        long maxScore = 0;
        int left = 0, right = n - 1;
        boolean add = true;
        while (left <= right) {
            if (add) {
                maxScore += squares[right--];
            } else {
                maxScore -= squares[left++];
            }
            add = !add;
        }

        return maxScore;
    }
}