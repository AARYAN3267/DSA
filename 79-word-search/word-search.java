class Solution {
    public boolean exist(char[][] board, String word) {
        char alph[]= word.toCharArray();
        for(int i=0;i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]==alph[0]&& check(board,i,j,alph,0)){
                  return true;
                }
          
            }
        }
              return false;
    }
    public boolean check(char[][]board, int i, int j, char[]arr, int index){
        if(i<0|| i>=board.length|| j<0|| j>=board[0].length||arr[index]!= board[i][j]){
            return false;
        }
        if(index==arr.length-1)return true;
        char a= board[i][j];
        board[i][j]='*';
        boolean ans=  check(board, i+1,  j, arr, index+1)||check(board, i,  j+1, arr, index+1)||check(board, i-1,  j, arr, index+1)||check(board, i,  j-1, arr, index+1);
        board[i][j]=a;
        return ans;
    }
}