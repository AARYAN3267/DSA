class Solution {
    public void rotate(int[][] matrix) {
       int n=matrix.length;
       for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
       }
       for(int row[]:matrix){
        int i=0;
        int j=n-1;
        while (i<j){
            int temp=row[i];
            row[i]=row[j];
            row[j]=temp;
            i++;
            j--;


         }
       }
        
    }
}