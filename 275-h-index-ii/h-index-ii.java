class Solution {
    public int hIndex(int[] citations) {
    int ans=0;
    int start=0;
    int n= citations.length;
    int end= n;
    while(start<end){
        int mid= start+(end-start)/2;
        if(citations[n-1-mid]>mid){start=mid+1;}
        else{end=mid;}
    }
    return start;
    }
}