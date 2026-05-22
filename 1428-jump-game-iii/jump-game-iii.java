class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean isvis[]= new boolean[arr.length];
        return find(arr,start,isvis);
    }
    public boolean find(int arr[],int i, boolean isvis[]){
   if(i>=arr.length||i<0||isvis[i])return false;
   if(arr[i]==0)return true;
   isvis[i]=true;
   boolean ans=  find(arr, i+arr[i],  isvis) ||find( arr, i-arr[i], isvis);
   return ans;
    }
}