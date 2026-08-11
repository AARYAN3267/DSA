class Solution {
    public int minFlips(int[][] grid) {
      int col=0;
      int row=0;
      for(int i=0; i< grid.length;i++){
            int k=grid[0].length-1;
            int j=0;
            while(j<k){
                if(grid[i][j]!=grid[i][k])row++;
                j++;
                k--;
            }}
            for(int i=0; i< grid[0].length;i++){
            int k=grid.length-1;
            int j=0;
            while(j<k){
                if(grid[j][i]!=grid[k][i])col++;
                j++;
                k--;
            }}
            return Math.min(row,col); 
    }
}