class Solution {
    public int furthestDistanceFromOrigin(String moves) {
     int l=0;
     int r=0;
     int spaces=0;
     for(char a: moves.toCharArray()){
          if(a=='R')r++;
          else if(a=='L')l++;
          else{spaces++;}
     }
     return Math.abs(r-l)+spaces;
    }
}