class Solution {
    long sum;
    private void dfs(int[][]grid,int i, int j,boolean[][]isvis){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0||isvis[i][j])return;
sum+=grid[i][j];
isvis[i][j]=true;
dfs(grid,i+1,j,isvis); 
dfs(grid,i-1,j,isvis);
dfs(grid,i,j+1,isvis);
dfs(grid,i,j-1,isvis);
    }
    public int countIslands(int[][] grid, int k) {
        int m= grid.length;
        int n=grid[0].length;
        int count=0;

      boolean isvis[][]= new boolean [m][n]; 
      for(int i=0; i<m;i++){
        for(int j=0;j<n;j++){
            if(!isvis[i][j]&&grid[i][j]!=0){
                sum=0;
                dfs(grid,i,j,isvis);
                if(sum%k==0)count++;   
            }
            else{continue;}
        }
      } 
      return count;
    }
}