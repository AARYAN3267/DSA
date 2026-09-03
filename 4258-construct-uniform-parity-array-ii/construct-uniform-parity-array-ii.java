class Solution {
    public boolean uniformArray(int[] nums1) {
        int small=Integer.MAX_VALUE;
      for(int i:nums1){
     small= Math.min(i,small);
      }

      if(small%2==0){
        for(int a:nums1){
            if(a%2!=0)return false;
        }
      }
     
      return true;
    }
}