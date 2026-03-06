class Solution {
    public boolean checkOnesSegment(String s) {
       boolean isconti=true;
         if(s.length()<=1)return true;
      char[]ch =s.toCharArray();
      for( int i=1; i<ch.length;i++){
        if(ch[i-1]=='0'&&ch[i]=='1'){
          isconti=false;
          break;
        } }   
        return isconti;
      
    }
}