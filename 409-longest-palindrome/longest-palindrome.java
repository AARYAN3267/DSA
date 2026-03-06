class Solution {
    public int longestPalindrome(String s) {
      int ans=0;
        boolean isodd=false;
        HashMap<Character,Integer>map= new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
  }
  for(char key:map.keySet()){
   if(map.get(key)%2==0)ans+=map.get(key);
  else{
    ans+= map.get(key)-1;
    isodd=true;
  }
  }
  return isodd? ans+1:ans;
    }
}// string ko char aray me convert karke karna
// make boolean function for even and odd