class Solution {
    public int minSteps(String s, String t) {
    int arr[]= new int[26];
    for(char c:s.toCharArray()){
        arr[c-'a']++;
    }
    int steps=0;
    for(char c:t.toCharArray())arr[c-'a']--;
    for(int a:arr)if(a!=0)steps+=Math.abs(a);
    return steps;    
    }
}