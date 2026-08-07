class Solution {
    public int largestInteger(int n, int s) {
       int result=0;
       if(n*9<s)return -1;
      for(int i=0; i<n;i++){
        int dig= Math.min(s,9);
        result=result*10+dig;
        s-=dig;
       } 
       return result;
    }
}