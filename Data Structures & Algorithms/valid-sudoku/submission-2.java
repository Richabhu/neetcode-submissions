class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int [][]row = new int[9][9];
        int [][]col = new int[9][9];
        int [][]cell = new int[9][9];

        

        for(int i = 0; i<9; i++) {
            for(int j = 0; j< 9; j++) {
                if(board[i][j] == '.')
                    continue;


                int digit = (int)(board[i][j] - '1');
                row[i][digit]++;
                col[j][digit]++;
                int cellNo = (i/3 * 3) + (j/3);
                cell[cellNo][digit]++;
                if(row[i][digit] > 1 || col[j][digit] > 1 ||
                cell[cellNo][digit] > 1)
                    return false;
            }
        }
        return true;
    }
}
