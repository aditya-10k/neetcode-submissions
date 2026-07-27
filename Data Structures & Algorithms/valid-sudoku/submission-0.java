class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character> [] cols = new HashSet[9];
        HashSet<Character> [] rows = new HashSet[9];
        HashSet<Character> [][] squares = new HashSet[3][3];

        for(int i = 0 ; i < 9 ; i ++){
            cols[i] = new HashSet<>();
            rows[i] = new HashSet<>();
        }

        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                squares[i][j] = new HashSet<>();
            }
        }

        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j <board[0].length ; j++){

                if(board[i][j] == '.') continue ;

                if(cols[j].contains(board[i][j])) return false ;
                cols[j].add(board[i][j]);

                if(rows[i].contains(board[i][j])) return false ; 
                rows[i].add(board[i][j]);

                if(squares[i/3][j/3].contains(board[i][j])) return false ; 
                squares[i/3][j/3].add(board[i][j]);
            }
        }
        return true ;


    }
}
