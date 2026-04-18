class Solution {
    public int mirrorDistance(int n) {
     String s= String.valueOf(n);
    StringBuilder sb= new StringBuilder(s);
   String b= sb.reverse().toString();
     int k= Integer.valueOf(b);
     int ans= Math.abs(n-k);
     return ans;
    }
}