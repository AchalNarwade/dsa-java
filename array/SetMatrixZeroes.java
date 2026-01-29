// https://leetcode.com/problems/set-matrix-zeroes/?envType=problem-list-v2&envId=array
/* Time Complexity = O(R*C)
   Space Complexity = O(R+C)
*/

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean zeroRows[] = new boolean[matrix.length];
        boolean zeroColumns[] = new boolean[matrix[0].length];
//traversing and saving index where the matrix is zero
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    zeroRows[i] = true;
                    zeroColumns[j] = true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(zeroRows[i] || zeroColumns[j]){
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}