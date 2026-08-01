class Solution {
    public String removeDuplicateLetters(String s) {
      boolean[] isvisited = new boolean[26];
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }  
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);  
            if (isvisited[c - 'a']) continue;
            while (!stack.isEmpty() && 
                   stack.peek() > c && 
                   lastIndex[stack.peek() - 'a'] > i) {
                char removed = stack.pop();
                isvisited[removed - 'a'] = false;
            }
            stack.push(c);
            isvisited[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();   
    }
}