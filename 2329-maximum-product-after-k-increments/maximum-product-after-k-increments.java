class Solution {
    public int maximumProduct(int[] nums, int k) {
     int MOD= 1_000_000_007;  
     long ans=1;
     PriorityQueue<Integer>pq= new PriorityQueue<>(); 
     for(int a:nums)pq.offer(a);
     while(k>0){
        int temp= pq.poll();
        pq.offer(++temp);
        k--;
     }
    for(int a:pq){
        ans=(ans*a)%MOD;
    }
     return (int)ans;
    }
}