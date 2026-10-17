class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        int removedCount = 0;
        for (int i = 0; i < n; i++) {
            boolean covered = false;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                if (intervals[j][0] <= intervals[i][0] && intervals[i][1] <= intervals[j][1]) {
                    if (intervals[j][0] == intervals[i][0] && intervals[j][1] == intervals[i][1] && i < j) {
                        continue;
                    }
                    covered = true;
                    break;
                }
            }
            if (covered) {
                removedCount++;
            }
        }

        return n - removedCount;
    }
}