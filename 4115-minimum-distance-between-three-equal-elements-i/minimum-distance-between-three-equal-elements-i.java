class Solution {
    public int minimumDistance(int[] nums) {
      int n= nums.length;
      int min=Integer.MAX_VALUE;
if(n<3)return -1;
     for(int i=0;i<n;i++){
       
        int count=1;
        int j=-1;
        int k=-1;
        for(int m=i+1; m<n;m++){
           if(nums[m]==nums[i]){count++;
           if(count==2)j=m;
           else if(count==3){k=m;
           break;}
           } 
        }
         if(count==3){
           int curr = Math.abs(i-j)+ Math.abs(j-k)+Math.abs(i-k);
        min= Math.min(min,curr);
         }
     } 
    
       return min==Integer.MAX_VALUE?-1:min;
    }
}