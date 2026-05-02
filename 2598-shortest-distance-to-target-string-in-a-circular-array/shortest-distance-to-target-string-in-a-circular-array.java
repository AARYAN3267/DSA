class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int i = startIndex;
        int steps = 0;
        int min = Integer.MAX_VALUE;

        while (steps < n) {
            if (words[i].equals(target)) {
                min = Math.min(min, Math.min(steps, n - steps));
            }

            i = (i + 1) % n;
            steps++;
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}