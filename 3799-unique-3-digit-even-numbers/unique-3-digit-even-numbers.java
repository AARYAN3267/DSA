class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        boolean[] visited = new boolean[digits.length]; 
        backtrack(digits, visited, 0, 0, uniqueNumbers);
        return uniqueNumbers.size();
    }

    private void backtrack(int[] digits, boolean[] visited, int depth, int currentNum, Set<Integer> uniqueNumbers) {
        if (depth == 3) {
            if (currentNum % 2 == 0) {
                uniqueNumbers.add(currentNum);
            }
            return;
        }
        for (int i = 0; i < digits.length; i++) {
            if (visited[i]) continue;
            if (depth == 0 && digits[i] == 0) continue;
            visited[i] = true;
            backtrack(digits, visited, depth + 1, currentNum * 10 + digits[i], uniqueNumbers);
            visited[i] = false;
        }
    }
}