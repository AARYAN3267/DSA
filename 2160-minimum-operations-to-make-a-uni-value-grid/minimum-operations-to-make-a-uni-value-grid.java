class Solution {
    public int minOperations(int[][] grid, int x) {
      ArrayList<Integer>list = new ArrayList<>();
        for(int[]arr:grid){
            for(int a: arr){
                list.add(a);
            }
        }
       Collections.sort(list);
       int mid= list.get(list.size()/2);
       int ans=0;
       for(int a: list){
        if((a-mid)%x!=0)return -1;
        else{
        ans+= Math.abs((a-mid)/x);
        }
       }
 return ans;
    }
}