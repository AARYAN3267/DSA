class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
     int ans[]= new int[nums.length] ;
     int c=0;
     int e=0;
     for(int a: nums){
        if(a<pivot)c++;
        if(a==pivot)e++;
     }
     int i=0;
     int k=c+e;
     int j=c;
     for(int a: nums){
        if(a< pivot){
            ans[i]=a;
           
            i++;

        }
        else if(a==pivot){
            ans[j]=a;
            j++;
        }
        else{
            ans[k]=a;
            k++;
        }
     }
     return ans;
    }
}