// https://leetcode.com/problems/spiral-matrix/submissions/1904179192/?envType=problem-list-v2&envId=array
/* Time Complexity = O(m*n)
   Space Complexity = O(m*n)
*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length , n = matrix[0].length;
        int srow = 0 , erow = m-1 , scol = 0 , ecol = n-1;
        ArrayList<Integer> result = new ArrayList<>();

        while(srow<=erow && scol<=ecol){
            //top
            for(int j=scol;j<=ecol;j++){
               result.add(matrix[srow][j]);
            }
            //right
            for(int i=srow+1;i<=erow;i++){
                if(srow==erow){
                    break;
                }
                result.add(matrix[i][ecol]);
            }
            //bottom
            for(int j=ecol-1;j>=scol;j--){
                if(srow==erow){
                    break;
                }
                result.add(matrix[erow][j]);
            }
            //left
            for(int i=erow-1;i>=srow+1;i--){
                if(scol == ecol){
                    break;
                }
                result.add(matrix[i][scol]);
            }
            srow++;erow--;scol++;ecol--;
        }
        return result;
    }
}