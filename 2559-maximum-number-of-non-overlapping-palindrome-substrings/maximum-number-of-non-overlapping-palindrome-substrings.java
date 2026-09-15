class Solution {
    private boolean ispalli(StringBuilder sb) {
        int l= 0, r= sb.length() - 1;
        while (l<r) {
            if(sb.charAt(l++)!=sb.charAt(r--))return false;
        }
        return true;
    }
    public int maxPalindromes(String s, int k) { 
        int count=0;
        int n=s.length();
        int i=0;
      
      while (i<=n-k){
            StringBuilder sb = new StringBuilder();
             boolean found=false;
            for (int j = i; j < Math.min(n, i + k + 1); j++) {
                sb.append(s.charAt(j));
                if (sb.length() >= k && ispalli(sb)) {
                    count++;
                    i = j; 
                    found=true;
                    break;
                    
                }
            }
          
         i++;
        }
         return count;
    }
}