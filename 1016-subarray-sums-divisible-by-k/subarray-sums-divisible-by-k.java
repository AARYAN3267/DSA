class Solution {
    public int subarraysDivByK(int[] nums, int k) {
    HashMap<Integer,Integer>map= new HashMap<>();
    int sum=0;
     map.put(0,1);
     int ans=0;
     for(int a: nums){
     sum+=a;
            int rem=sum%k;
            if(rem<0)rem+=k;
            if(map.containsKey(rem))
            ans+= map.get(rem);
                map.put(rem,map.getOrDefault(rem,0)+1);
            
     } 
     return ans;   
    }
}