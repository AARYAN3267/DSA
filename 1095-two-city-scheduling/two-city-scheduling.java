class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length / 2;
        Arrays.sort(costs, (a, b) -> ((a[0] - a[1]) - (b[0] - b[1])));
        int a = 0;
        int ans = 0;
        for (int arr[] : costs) {
            if (a < n) {
                ans += arr[0];
                a++;
            } else {
                ans += arr[1];
            }
        }
        return ans;
    }
}