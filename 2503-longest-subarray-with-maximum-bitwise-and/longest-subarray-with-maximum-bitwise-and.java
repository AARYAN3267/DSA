class Solution {
    public int longestSubarray(int[] nums) {
     int maxele=0;
     int curr=0; int max=0;
     for(int a:nums){
        maxele= Math.max(maxele,a);
     }
     for(int a:nums){
         if(a!=maxele)curr=0;
        else{curr++;
        max=Math.max(max,curr);
        }
     }
     return max;   
    }
}