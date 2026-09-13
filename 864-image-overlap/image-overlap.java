class Solution {
    //it could be solved by loops but ill have the recursion one
    int max=0;
    private void dfs(int[][]img1,  int[][]img2, int i, int j,boolean[][]isvis){
        int n=img1.length;
if(Math.abs(i)>=n||Math.abs(j)>=n||isvis[i+n][j+n])return;
//coz i and j could be negative
isvis[i+n][j+n]=true;
int count= overlaps(img1,img2,i,j);
//four cases
dfs(img1,img2,i+1,j,isvis);
dfs(img1,img2,i-1,j,isvis);
dfs(img1,img2,i,j+1,isvis);
dfs(img1,img2,i,j-1,isvis);
max= Math.max(count,max);
    }
    private int overlaps(int[][]img1,  int[][]img2, int x, int y){
int c=0;
int n=img1.length;
for(int i=0; i<n;i++){
    for(int j=0; j<n;j++){
        int shiftrow=i+x;//gpt told;
        int shiftcolumn=j+y;
        if(shiftrow<0||shiftrow>=n||shiftcolumn<0||shiftcolumn>=n)continue;
        if(img1[i][j]==1&&img2[shiftrow][shiftcolumn]==1)c++;
    }
}
 return c;
    }
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
      boolean isvis[][]=  new boolean[2*n][2*n];
      dfs(img1,img2,0,0,isvis);
      return max;
    }
}
//the que wanted that we have to place the grid over another and then shift one by one block to find max one....shityyyyyy description