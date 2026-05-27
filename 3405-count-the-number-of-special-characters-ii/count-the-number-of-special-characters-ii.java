class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer>map= new HashMap<>();
        int c=0;
      for(int i= 0; i< word.length();i++){
        if(Character.isLowerCase(word.charAt(i))){
            map.put(word.charAt(i),i);
        }else{
        if(map.containsKey(word.charAt(i)))continue;
        map.put(word.charAt(i),i);
        }
      } 
      for(char key:map.keySet()){
        if(Character.isLowerCase(key)&&map.containsKey((char)(key-32))){
            int a= map.get((char)(key-32));
            int b=map.get(key);
           if(a>b)c++;
        }
      }
      return c; 
    }
}