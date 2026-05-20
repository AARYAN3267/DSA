class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int ans[]= new int [A.length];
        Set<Integer>set= new HashSet<>();
        for(int i=0; i<A.length;i++){
            set.add(A[i]);
            int j=i;
            int a=0;
            while(j>=0){
                if(set.contains(B[j])){
                    a++;
                }
                j--;
            }
            ans[i]=a;
        }
        return ans;
    }
}