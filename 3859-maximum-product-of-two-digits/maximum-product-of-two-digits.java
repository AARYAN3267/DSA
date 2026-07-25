class Solution {
    public int maxProduct(int n) {
        int f= Integer.MIN_VALUE;
        int s= Integer.MIN_VALUE;
      while(n>0){
        int k= n%10;
        if(k>= f){
           s=f;
           f=k;
        }else if(k>s){s=k;}
        n/=10;
      }  
      return f*s; 
    }
}