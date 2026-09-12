class Solution {
    class Node{
        int ind[];
        long sum;
        Node(int ind[], long sum){
            this.ind=ind;
            this.sum=sum;
        }
    }
    private Node fun(int i,int k,int[][]arr,Node dp[][]){
        if(i==arr.length||k==0)return dp[i][k]=new Node(new int[0],0);
        if(dp[i][k]!=null)return dp[i][k];
   int s=i;
   int num=arr[i][1];
   int e=arr.length-1;
   while(s<=e){
 int mid= s+(e-s)/2;
 if(arr[mid][0]>num){
    e=mid-1;
 }
 else{
    s=mid+1;
 }}
 //pick
 Node pick= fun(s,k-1,arr,dp);
 int newind[]= new int[pick.ind.length+1];
 newind[0]=arr[i][3];
 for(int j=1; j<newind.length;j++){
    newind[j]=pick.ind[j-1];
 }
 long newsum= arr[i][2]+pick.sum;
 //not pick
 Node notpick= fun(i+1,k,arr,dp);
 Arrays.sort(newind);//sort for makin lexicographical small
 //return maximum
 if(newsum>notpick.sum){
    return dp[i][k]=new Node(newind,newsum);
 }
 else if(newsum<notpick.sum){
    return dp[i][k]=notpick;
 }
 //if both are equal then lexicographical smaller one
 else{
    if(Arrays.compare(newind,notpick.ind)>0)return dp[i][k]=notpick;
    else{
        return dp[i][k]=new Node(newind,newsum);
    }
 }
   }

    
    public int[] maximumWeight(List<List<Integer>> intervals) {
      int arr[][]= new int[intervals.size()][4];
      int i=0;
      for(List<Integer> list:intervals) {
        arr[i][0]=list.get(0);
        arr[i][1]= list.get(1);
        arr[i][2]= list.get(2);
        arr[i][3]=i++;
      }
      Node dp[][]= new Node[intervals.size()+1][5];
      //sorting on basis of start interval
      Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
      Node max= fun(0,4,arr,dp);
      return max.ind;

    }
}