class Solution {
    public int maxProduct(int[] nums) {
     int a = Integer.MIN_VALUE;
     int b = Integer.MIN_VALUE;   
     for (int x:nums){
        if(x>=b){
            a=b;
            b=x;
        }
        else if(x>a){
            a=x;
        }
     }
     return (a-1)*(b-1);
    }
}