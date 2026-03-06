class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map= new HashMap<>();
       int currsum=0, ans=0;
       map.put(0,1);
       for(int a: nums){
        currsum+=a;
        int diff= currsum-k;
        if(map.containsKey(diff)){
            ans+= map.get(diff);
        }
        if(map.containsKey(currsum)){
            map.put(currsum,map.get(currsum)+1);
        }
        else{map.put(currsum,1);}
       } 
       return ans;  
    }
}