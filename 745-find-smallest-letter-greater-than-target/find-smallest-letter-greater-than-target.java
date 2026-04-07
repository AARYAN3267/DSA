class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0;
        int r= letters.length-1;
        if(letters[letters.length-1]<=target || letters[0]>target)return letters[0];
        while(l<r){
            int mid= l+(r-l)/2;
           
            if(letters[mid]>target)r=mid;
            else{l=mid+1;}
        }
        return letters[l];
    }
}