class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
     int i=0;
     HashMap<String,Integer>map= new HashMap<>();
     int c=0;
    
     while(i<=s.length()-minSize){
         HashSet<Character>set= new HashSet<>();
      int j=0;
      StringBuilder sb= new StringBuilder();
      while(j<minSize){
        
        sb.append(s.charAt(j+i));
        set.add(s.charAt(j+i));
        j++;
      }
      if(set.size()<=maxLetters){
        String st= sb.toString();
        int freq=map.getOrDefault(st,0)+1;
        map.put(st,freq);
       c=Math.max(c,freq);
      
     }i++;
     
    }return c;
}}