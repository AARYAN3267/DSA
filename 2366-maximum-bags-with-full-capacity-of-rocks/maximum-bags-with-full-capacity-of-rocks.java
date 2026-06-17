class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int [][]pair= new int[capacity.length][2];
        for(int i=0; i< capacity.length; i++){
            pair[i][0]=capacity[i];
            pair[i][1]=rocks[i];
        }  
        Arrays.sort(pair,(a,b)->(a[0]-a[1])-(b[0]-b[1]));
        int i=0;
         while(additionalRocks!=0&&i<capacity.length){
        if(additionalRocks>=pair[i][0]-pair[i][1]){
        additionalRocks-= pair[i][0]-pair[i][1];
        i++;}
        else break;
         }
         return i;
    }
}