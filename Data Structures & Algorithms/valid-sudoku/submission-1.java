class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Map<Integer, Set<Integer>> row = new HashMap<>();
        Map<Integer, Set<Integer>> col = new HashMap<>();

        for(int i = 0; i<9; i++)
        {
            row.put(i, new HashSet<>());
            col.put(i, new HashSet<>());
        }

        for(int i = 0; i<9; i++) {
            for(int j = 0; j<9; j++) {
                if(board[i][j] != '.') {
                    int n = (int)(board[i][j] - '0');
                    if(row.get(i).contains(n))
                        return false;
                    row.get(i).add(n);

                    if(col.get(j).contains(n))
                        return false;
                    col.get(j).add(n);
                }
            }
        }

        // System.out.println(row);
        // System.out.println(col);

        for(int i = 0; i< 9; i+=3) {
            for(int j = 0; j<9; j+=3) {

                Set<Integer> set = new HashSet<>();

                for(int l = i; l <i+3; l++) {
                    for(int m = j; m<j+3; m++) {

                        if(board[l][m] != '.') {
                            int n = (int)(board[l][m] - '0');
                            
                            if(set.contains(n)) {
                                // System.out.println("Row: " + l + " Col: " + m + " ele: " + n);
                                return false;
                            }
                            
                                

                            set.add(n);
                            System.out.println(set);
                        }
                            
                    }
                }

            }
        }
        return true;
    }
}
