class Solution {
    public int maximumLengthSubstring(String s) {
        int max = Integer.MIN_VALUE;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.get(c) > 2) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                j++;
            }

            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}