class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
       int min=Integer.MAX_VALUE;
       for(int i=0; i<capacity.length;i++){
        if(capacity[i]>=itemSize){
            min= Math.min(min,capacity[i]);
        }
       }
       int i=0;
       while(i<capacity.length){
        if(capacity[i]==min)return i;
        else{i++;}
        } 
       return -1;
    }
}