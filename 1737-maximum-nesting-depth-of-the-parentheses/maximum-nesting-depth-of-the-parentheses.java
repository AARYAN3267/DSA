class Solution {
    public int maxDepth(String s) {
        int curr=0;
        int max=0;
    for(char ch: s.toCharArray()){
if(ch=='('){
    curr++;
    max=Math.max(curr,max);
}else if(ch==')'){
    curr--;
}
} return max;
    }
}