class Solution {
        public boolean isValidSudoku(char[][] board) {
       for(int i =0; i<board.length;i++){
        if(!checkRow(board[i]))
            return false;
            if(!checkColumn(board, i)){
                return false;
            }}
            for(int i=0; i<board.length;i+=3){
                for(int j=0; j<board[i].length;j+=3){
                    if(!checkBox(board,i,j))return false;
                }

            }
            return true;
        
    }
    public boolean checkRow(char []row){
        HashSet<Character> set= new HashSet<>();
        for(char a: row){
            if(a!='.')
            if(set.contains(a))return false;
            else{ set.add(a);}
        }
        return true;
    }
    public boolean checkColumn(char[][]board, int j){
        HashSet<Character>set = new HashSet<>();
        for(int i=0;i<board.length;i++){
            if(board[i][j]!='.')
            if(set.contains(board[i][j]))return false;
            else{set.add(board[i][j]);}
        }
        return true;
    }
    public boolean checkBox(char[][]board,int i, int j){
     HashSet<Character> set= new HashSet<>();
        for(int k=i;k<i+3;k++){
            for(int p=j;p<j+3;p++){
                if(board[k][p]!='.')
                if(set.contains(board[k][p]))return false;
                else{set.add(board[k][p]);}
            }
        }
        return true;
    }
}