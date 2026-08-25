class Solution {
    public int missingMultiple(int[] nums, int k) {
     int arr[]= new int[101];
     for(int a:nums){
        arr[a]+=1;
     } 
     int c=0;
     for(int i=k; i<arr.length;){
      if(arr[i]==0)return i;
      i+=k;
      c=i;
     }  
     return c;
    }
}