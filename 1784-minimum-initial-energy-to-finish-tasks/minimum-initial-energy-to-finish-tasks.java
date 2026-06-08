class Solution {
    public boolean isval( int mid, int arr[][]){
        for(int a[]:arr){
            if(a[1]>mid)return false;
            mid-=a[0];
        }
        return true;
    }
    public int minimumEffort(int[][] tasks) {
        int start=Integer.MAX_VALUE;;
        int end=0;
      for(int a[]:tasks){
        start=Math.min(start,a[1]);
        end+=a[1];
      }
     Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));
      int ans=0;
     while(start<=end){
        int mid= start+ (end-start)/2;
        if(isval(mid,tasks)){
            ans=mid;
            end=mid-1;
        }
        else{
            start=mid+1;
        }
     }
            return ans;           
    }
}