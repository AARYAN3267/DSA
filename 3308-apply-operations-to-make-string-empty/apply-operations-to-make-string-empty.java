class Solution {
    public String lastNonEmptyString(String s) {
    int arr[] =new int[26];
    int maxfreq=0;
    StringBuilder sb= new StringBuilder();
    for(char a:s.toCharArray()){
        int ind=a-'a';
        arr[ind]++;
        if(arr[ind]>maxfreq)maxfreq=arr[ind];
    }
     int lassun[]=new int[26];
     for(char ch: s.toCharArray()){
        lassun[ch-'a']++;
        if(lassun[ch-'a']==maxfreq)sb.append(ch);
     }
     return sb.toString();
    }
}