class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int leftmin[] = new int[n];
        int rightmin[] = new int[n];

        Stack<Integer> st = new Stack<>();

        // LEFT smaller
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            leftmin[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        // RIGHT smaller
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            rightmin[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            int area = heights[i] * (rightmin[i] - leftmin[i] - 1);
            max = Math.max(area, max);
        }

        return max;
    }
}