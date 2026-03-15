class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     if(target> matrix[matrix.length-1][matrix[0].length-1])return false;
 
  int row= findrow(matrix,target);
   return ans(matrix,target,row);   
    }
    public int findrow(int [][]matrix, int t){
        int start=0,end=matrix.length-1;
        while(start<end){
            int mid= (start+end)/2;
            if(matrix[mid][0]<=t &&matrix[mid][matrix[0].length-1]>=t)return mid;
            else if(matrix[mid][0]<t && matrix[mid][matrix[0].length-1]<t)start=mid+1;
            else{ end=mid-1;}
        }
        return start;
    }
    public boolean ans(int [][]matrix, int t, int r){
        int start=0 , end =matrix[0].length-1;
        while(start<end){
            int mid= (start+end)/2;
            if(matrix[r][mid]==t)return true;
            else if(matrix[r][mid]<t)start=mid+1;
            else{ end=mid-1;}

        }
        return matrix[r][start]==t;
    }
}