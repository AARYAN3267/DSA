class Solution {
    public boolean isPalindromic(String s) {
     StringBuilder binaryStr = new StringBuilder();

        for (char c : s.toCharArray()) {

            String b = Integer.toBinaryString(c);
            while (b.length() < 8) {
                b = "0" + b;
            }

            binaryStr.append(b);
        }
        String fullBinary = binaryStr.toString();
        int left = 0;
        int right = fullBinary.length() - 1;
        while (left < right) {
            if (fullBinary.charAt(left) != fullBinary.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;   
    }
}