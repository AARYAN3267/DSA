class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
       HashSet<Integer> set=new HashSet<>();
       for(int a:nums){
        set.add(a);
       } 
       for(int a:set){
        int curr=1;
        if(set.contains(a-1)){ continue;}
            if(set.contains(a+1)){
                while(set.contains(++a)){ curr++;}
            }
        
        longest= Math.max(longest,curr);
       }
       return longest;    
    }
}