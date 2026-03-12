class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        String sc=Integer.toString(x);
        String reverse=new StringBuilder(sc).reverse().toString();
        return sc.equals(reverse);

    }
}