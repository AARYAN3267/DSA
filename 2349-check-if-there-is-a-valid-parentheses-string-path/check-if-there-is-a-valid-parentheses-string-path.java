class Solution {

    Boolean[][][] dp;

    private boolean fun(char[][] grid, int i, int j, Stack<Character> st) {

        if (i >= grid.length || j >= grid[0].length)
            return false;

        // Process current cell
        if (grid[i][j] == '(') {
            st.push('(');
        } 
        else {
            if (st.isEmpty())
                return false;

            st.pop();
        }

        int balance = st.size();

        // If this state was already calculated
        if (dp[i][j][balance] != null) {

            // Undo current cell before returning
            if (grid[i][j] == '(')
                st.pop();
            else
                st.push(')');

            return dp[i][j][balance];
        }

        // Destination
        if (i == grid.length - 1 && j == grid[0].length - 1) {

            boolean ans = st.isEmpty();

            dp[i][j][balance] = ans;

            // Backtrack
            if (grid[i][j] == '(')
                st.pop();
            else
                st.push(')');

            return ans;
        }

        boolean right = fun(grid, i, j + 1, st);
        boolean down = fun(grid, i + 1, j, st);

        boolean ans = right || down;

        dp[i][j][balance] = ans;

        // Backtrack
        if (grid[i][j] == '(') {
            st.pop();
        } 
        else {
            st.push(')');
        }

        return ans;
    }

    public boolean hasValidPath(char[][] grid) {

        if (grid[0][0] == ')')
            return false;

        // Total path length must be even
        int pathLength = grid.length + grid[0].length - 1;

        if (pathLength % 2 != 0)
            return false;

        int maxBalance = pathLength + 1;

        dp = new Boolean[grid.length][grid[0].length][maxBalance];

        Stack<Character> st = new Stack<>();

        return fun(grid, 0, 0, st);
    }
}