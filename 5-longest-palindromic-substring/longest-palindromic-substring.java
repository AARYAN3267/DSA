class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1)return s;
        int start=0,end=0;
     for(int i=0; i<s.length();i++){
        int l1= expand(s,i,i);
        int l2= expand(s,i,i+1);
       int length= Math.max(l1,l2);
        if(length> end-start){
            start= i- (length-1)/2;
            end= i+length/2;
        }
     }
     return s.substring(start,end+1);
    }
    public int expand(String s, int left, int right){
        while(left>=0&& right<s.length() && s.charAt(left)== s.charAt(right)){
            left--; right++;
        }
        return right-left-1;
    }
}