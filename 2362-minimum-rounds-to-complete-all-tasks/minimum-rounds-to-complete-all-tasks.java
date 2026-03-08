class Solution {
    public int minimumRounds(int[] tasks) {
     HashMap<Integer,Integer> map= new HashMap<>();
      for(int a:tasks){
        map.put(a,map.getOrDefault(a,0)+1);
      } 
      int min=0;
      for( int key:map.keySet()){
        if(map.get(key)==1)return -1;
        else{
            min+=( map.get(key)+2)/3;
        }
      }
      return min;     
    }
}