class Solution {
    public int sumCounts(List<Integer> nums) {
    int sum=0;
    int n=nums.size();
    for(int i=0; i<n;i++){
     HashSet<Integer> set= new HashSet<>();
        for(int j=i; j<n;j++){
            int a=nums.get(j);
            set.add(a);
            sum+=(set.size()*set.size()); 
        }
    }
    return sum;
    }
}