class Solution {
    public boolean winnerOfGame(String colors) {
        if (colors.length()<=2) return false;
        int A=0;
        int B=0;
    for(int i=1;i<colors.length()-1;i++){
        if(colors.charAt(i)=='A'&&colors.charAt(i-1)=='A'&&colors.charAt(i+1)=='A')A++;
         if(colors.charAt(i)=='B'&&colors.charAt(i-1)=='B'&&colors.charAt(i+1)=='B')B++;
    }
    if(A>B)return true;
    return false;    
    }
}