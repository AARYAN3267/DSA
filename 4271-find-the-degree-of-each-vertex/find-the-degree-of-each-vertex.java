class Solution {
    public int[] findDegrees(int[][] matrix) {
     int arr[]= new int[matrix.length];
     for (int i=0 ; i< matrix.length; i++){
        int count=0;
        for (int j= 0; j< matrix[0].length;j++){
         count+=matrix[i][j];
        }
        arr[i]=count;
     }
     return arr;   
    }
}