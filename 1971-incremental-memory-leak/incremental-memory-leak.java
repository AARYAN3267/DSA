class Solution {
    public int[] memLeak(int memory1, int memory2) {
      int time=1;
      while(time<=memory1||time<=memory2){
        if(memory1>=memory2)memory1-=time;
        else{memory2-=time;}
        time++;

      }  
      return new int[]{time,memory1,memory2};
    }
}