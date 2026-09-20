class Solution {
    public int reverseDegree(String s) {
    int i=1,sum=0;

    for(char ch:s.toCharArray()){
        int rev= 27-(ch-'a'+1);
        sum+= i*rev;
        i++;
    }    
    return sum;
    }
}