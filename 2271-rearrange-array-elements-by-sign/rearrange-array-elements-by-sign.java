class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posi[]= new int[nums.length/2];
        int negi[]= new int[nums.length/2];   
         int k=0;
         int j=0;
         for(int a:nums){
            if(a>=0){posi[k]=a;
            k++;}
            else{
                negi[j]=a;
                j++;
            }
         }
        k=0;
         j=0;
         for(int i=0;i<nums.length;i++){
           if(i%2==0){nums[i]=posi[k];
           k++;}
           else{
            nums[i]=negi[j];
            j++;
           }
         }
         return nums;
    }
}