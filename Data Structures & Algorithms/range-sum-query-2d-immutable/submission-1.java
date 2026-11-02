class NumMatrix {

    int prefix[][];
    int m;
    int n;

    public NumMatrix(int[][] matrix) {
        this.prefix = new int[matrix.length][matrix[0].length];

        this.m = matrix.length;
        this.n = matrix[0].length;

        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                prefix[i][j] = matrix[i][j];
            }
        }
        
        // row wise
        for(int i = 0; i<m; i++) {
            for(int j = 1; j<n; j++) {
                prefix[i][j] += prefix[i][j-1];
            }
        }

        // column wise add
        for(int i = 1; i<m; i++) {
            for(int j = 0; j<n; j++) {
                prefix[i][j] += prefix[i-1][j];
            }
        }
    }

    // public void display() {
    //     for(int i= 0; i< m; i++) {
    //         for(int j = 0; j<n; j++) {
    //             System.out.print(prefix[i][j] +" ");
    //         }
    //         System.out.println();
    //     }
    // }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {

        int res = prefix[row2][col2];
        if(col1-1 >= 0)
            res = res - prefix[row2][col1-1];
        if(row1-1 >= 0)
            res = res - prefix[row1-1][col2];
        if(row1-1 >= 0 && col1-1 >= 0)
            res = res + prefix[row1-1][col1-1];

        return res;
    }


    /*

    3  3  4  8 10
    5 11 14 16 17
    1  3  3  4  9
    4  5  5. 6 13
    1  1. 4. 4. 9


    3  3. 4. 8. 10
    8. 14 18 24 27
    9. 17 21 28 36
    13 23 26 34 49
    14 24 30 38 58


    */
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */