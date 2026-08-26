class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int min = Integer.MAX_VALUE;
        int j = 0;
        int count = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                count++;

            while (count >= k) {
                if (count == k) {
                    int len = i - j + 1;
                    if (len < min) {
                        list.clear();
                        list.add(s.substring(j, i + 1));
                        min = len;
                    } else if (len == min) {
                        list.add(s.substring(j, i + 1));
                    }

                }
                if (s.charAt(j) == '1') {
                    count--;
                }
                j++;
            }

        }

        if (list.isEmpty())
            return "";
        String ans = list.get(0);
        for (String a : list) {
            if (a.compareTo(ans) < 0)
                ans = a;
        }
        return ans;
    }
}