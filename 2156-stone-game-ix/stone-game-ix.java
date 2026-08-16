class Solution {
    public boolean stoneGameIX(int[] stones) {
     int ans[]= new int[3];
     // if we choose 1 remainder first then seq:- 11212121....
     //if 2 then:- 22121212.......
     
     for( int a: stones){
        if(a%3==0)ans[0]++;
        if(a%3==1)ans[1]++;
        if(a%3==2)ans[2]++;
     }
     int zer=ans[0];
     int one=ans[1];
      int two=ans[2];
      if(zer%2==0)return one>=1&&two>=1;
      else{
        return Math.abs(one-two)>2;
      }
    }
}